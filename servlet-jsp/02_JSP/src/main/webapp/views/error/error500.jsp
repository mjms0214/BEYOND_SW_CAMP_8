<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage=true %> --%>
    
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>에러가 발생하였습니다. 관리자에게 문의해 주세요.</h2>
	
	<button onClick="history.go(-1);">이전 페이지로</button>
	
	<%-- <%= exception.getMessage() %>
	<%= exception.getClass().getName() %> --%>
</body>
</html>