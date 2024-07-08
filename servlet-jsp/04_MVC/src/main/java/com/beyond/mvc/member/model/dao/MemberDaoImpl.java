package com.beyond.mvc.member.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.beyond.mvc.common.jdbc.JDBCTemplate.close;
import com.beyond.mvc.member.model.vo.Member;

public class MemberDaoImpl implements MemberDao {

	@Override
	public Member findMemberById(Connection connection, String userId) {

		Member member = null;
//		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
//		String query = "SELECT * FROM tb_member WHERE id='"+ userId +"'";
		String query = "SELECT * FROM tb_member WHERE id=? AND status='Y'";
		
		try {
//			stmt = connection.createStatement();
			pstmt = connection.prepareStatement(query);
			pstmt.setString(1, userId);

//			rs = stmt.executeQuery(query);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				member = new Member();
				member.setNo(rs.getInt("no"));	
				member.setId(rs.getString("id"));
				member.setPassword(rs.getString("password"));
				member.setRole(rs.getString("role"));
				member.setName(rs.getString("name"));
				member.setPhone(rs.getString("phone"));
				member.setEmail(rs.getString("email"));
				member.setAddrress(rs.getString("address"));
				member.setHobby(rs.getString("hobby"));
				member.setStatus(rs.getString("status"));
				member.setEnrollDate(rs.getDate("enroll_date"));
				member.setModifyDate(rs.getDate("modify_date"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		
		return member;
	}

	@Override
	public int insertMember(Member member) {
		
		int result = 0;
		Connection connection = null;
		PreparedStatement pstmt = null;
		String query  = "INSERT INTO tb_member VALUES(NULL, ?,?,DEFAULT,?,?,?,?,?,DEFAULT,DEFAULT,DEFAULT)";
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
			connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/web", "beyond", "1234");
			
			// insert 바로 수행 -> false로 하면 자동 commit 안됨(트랜잭션)
//			connection.setAutoCommit(false);
			
			pstmt = connection.prepareStatement(query);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPassword());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getPhone());
			pstmt.setString(5, member.getEmail());
			pstmt.setString(6, member.getAddrress());
			pstmt.setString(7, member.getHobby());
			
			result = pstmt.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		
		return result;
	}

}
