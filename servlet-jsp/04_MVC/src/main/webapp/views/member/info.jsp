<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>


<c:set var="path" value="${ pageContext.request.contextPath }"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }
    h2 {
        text-align: center;
    }
    .container {
        background-color: #fff;
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        width: 400px;
        margin: auto;
    }
    table {
        width: 100%;
        border-collapse: collapse;
    }
    th, td {
        padding: 8px 12px;
        text-align: left;
    }
    th {
        width: 30%;
        background-color: #f9f9f9;
        border-bottom: 1px solid #ddd;
    }
    td {
        width: 70%;
    }
    input[type="text"], input[type="password"] {
        width: calc(100% - 24px);
        padding: 8px;
        margin: 4px 0;
        border: 1px solid #ccc;
        border-radius: 4px;
    }
    input[type="submit"], input[type="button"] {
        width: 48%;
        padding: 10px;
        border: none;
        border-radius: 4px;
        background-color: #5cb85c;
        color: white;
        cursor: pointer;
        margin-top: 10px;
    }
    input[type="button"] {
        background-color: #d9534f;
    }
    input[type="submit"]:hover {
        background-color: #4cae4c;
    }
    input[type="button"]:hover {
        background-color: #c9302c;
    }
    label {
        margin-right: 10px;
    }
</style>
</head>
<body>
	<container>
	<h2>회원 정보</h2>
	<form action="${ path }/member/update" method="post">
            <table>
                <tr>
                    <th><label for="userId">아이디</label></th>
                    <td><input type="text" id="userId" name="userId" value="${ loginMember.id }" readonly required/></td>
                </tr>
                <tr>
                    <th><label for="userName">이름</label></th>
                    <td><input type="text" id="userName" name="userName" value="${ loginMember.name }"></td>
                </tr>
                <tr>
                    <th><label for="phone">휴대전화</label></th>
                    <td><input type="text" id="phone" name="phone" value="${ loginMember.phone }"></td>
                </tr>
                <tr>
                    <th><label for="email">이메일</label></th>
                    <td><input type="text" id="email" name="email" value="${ loginMember.email }"></td>
                </tr>
                <tr>
                    <th><label for="address">주소</label></th>
                    <td><input type="text" id="address" name="address" value="${ loginMember.address }"></td>
                </tr>
                <tr>
                    <th>취미</th>
                    <td>
                        <label><input type="checkbox" name="hobby" value="운동" ${ fn:contains(loginMember.hobby, "운동")? 'checked': '' }>운동</label>
                        <label><input type="checkbox" name="hobby" value="등산" ${ fn:contains(loginMember.hobby, "등산")? 'checked': '' }>등산</label>
                        <label><input type="checkbox" name="hobby" value="독서" ${ fn:contains(loginMember.hobby, "독서")? 'checked': '' }>독서</label><br>
                        <label><input type="checkbox" name="hobby" value="게임" ${ fn:contains(loginMember.hobby, "게임")? 'checked': '' }>게임</label>
                        <label><input type="checkbox" name="hobby" value="여행" ${ fn:contains(loginMember.hobby, "여행")? 'checked': '' }>여행</label>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" style="text-align: center;">
                        <input type="submit" value="정보수정">
                        <input type="button" onclick="memberDelete();" value="탈퇴">
                    </td>
                </tr>
            </table>
        </form>
    </container> 
    
    <script>
    	function memberDelete(){
    		if (confirm("정말로 탈퇴하시겠습니까?")){
    			location.replace('${ path }/member/delete');
    		}
    	}
    </script>
</body>
</html>