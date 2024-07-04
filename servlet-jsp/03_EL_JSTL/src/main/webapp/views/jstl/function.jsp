<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>JSTL Function Library</h2>
	
	<c:set var="str" value="java mariadb HTML5 CSS5 JavaScript Servlet JSP"/>
	
	원본 : ${ str }<br>
	
	<br>
	
	문자열의 길이 : <%= ((String)pageContext.getAttribute("str")).length() %><br>
	문자열의 길이 : ${ fn:length(str) }<br>
	대문자로 변경 : ${ fn:toUpperCase(str) }<br>
	소문자로 변경 : ${ fn:toLowerCase(str) }<br>

	<br>

	원본 : ${ str }<br>
</body>
</html>