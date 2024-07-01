package com.beyond.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

//@WebServlet("/second.do")
//@WebServlet(name = "second", urlPatterns = "/second.do")
@WebServlet(name = "second", urlPatterns = {"/second.do", "/second2.do"})
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SecondServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println(request.getContextPath());
//		System.out.println(request.getServletPath());
//		System.out.println(request.getServerName());
//		System.out.println(request.getServerPort());
//		System.out.println(request.getRemoteAddr());
		
		// 한글이 깨지는 것을 방지하기 위해서 응답 헤더를 설정하는 메소드이다.
		response.setContentType("text/html;charset=utf-8");
		
		// 응답 화면을 출력하기 위한 출력 스트림을 얻어온다.
		PrintWriter out = response.getWriter(); // 문자 기반 출력 스트림
		
		// 자바 코드로 응답 화면을 작성
		out.write("<!DOCTYPE html>");
		out.write("<html>");
		out.write("<body>");
		out.write("<h1>두 번째 서블릿이 반환한 내용</h1>");
		out.write("<p>현재 시간 : " + LocalDateTime.now().toString() +"</p>");
		out.write("</body>");
		out.write("</html>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
