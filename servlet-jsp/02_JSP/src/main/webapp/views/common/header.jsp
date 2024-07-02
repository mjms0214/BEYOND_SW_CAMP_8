<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	LocalDateTime now = LocalDateTime.now();
	String today = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초"));
%>
<header>
	<h1>지시자 태그</h1>
	<p>
		오늘은 <span style="color: orange;"><%= today %></span> 입니다.
	</p>	
</header>