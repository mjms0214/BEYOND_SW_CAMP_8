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
<title>Hello World</title>
</head>
<body>
	<h2>Hello World</h2>
	
	<c:if test="${ empty loginMember }">
		<form action="${ path }/login" method="post">
			<label for="userId">아이디 : </label>
			<input type="text" id="userId" name="userId" />
			
			<br>
			
			<label for="userPwd">비밀번호 : </label>
			<input type="password" id="userPwd" name="userPwd" />
			
			<br><br>
			
			<input type="button" value="회원가입" onClick="location.replace('${ path }/member/enroll');"/>
			<input type="submit" value="로그인" />
		</form>
	</c:if>

	<c:if test="${ not empty loginMember }">
		<a href="${ path }/member/info">${ loginMember.name }</a>님 안녕하세요.
		
		<form action="${ path }/logout" method="post">
			<button type="submit">로그아웃</button>
		</form>
	</c:if>
</body>
</html>