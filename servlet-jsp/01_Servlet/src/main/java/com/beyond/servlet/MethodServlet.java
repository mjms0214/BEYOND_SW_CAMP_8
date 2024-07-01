package com.beyond.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Arrays;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/method.do")
public class MethodServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public MethodServlet() {
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 사용자가 보낸 데이터들은 request 객체를 통해서 얻어올 수 있다.
		// getParameter("name 속성의 값");
		// - 해당 name 속성의 값을 가지는 요소의 value 값을 문자열로 읽어온다.
		String userName = request.getParameter("userName");
		String userAge = request.getParameter("userAge");
		String gender = request.getParameter("gender");
		String[] foods = request.getParameterValues("food");
		
		System.out.println(userName);
		System.out.println(userAge);
		System.out.println(gender);
		System.out.println(Arrays.toString(foods));
		
		// 응답 화면 출력
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		out.write("<!DOCTYPE html>");
		out.write("<html>");
		out.write("<head>");
		out.write("<title>개인 정보 출력</title>");
		out.write("</head>");
		out.write("<body>");
		out.write("<h1>개인 정보 출력</h1>");
		out.printf("%s님은 %s세 %s입니다.<br>", userName, userAge, gender);
		out.write("좋아하는 음식은 ");
		Arrays.stream(foods).forEach(food -> out.print(food + " "));
		out.write("입니다. <br> ");
		out.write("</body>");
		out.write("</html>");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setCharacterEncoding("utf-8");
		
		this.doGet(request, response);
	}
	
	

}
