package com.beyond.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*
 * 서블릿을 실행시키는 방법
 * 	1. jakarta.servlet.http.HttpServlet 상속하는 클래스를 생성한다.
 * 	2. 서블릿을 등록 및 매핑한다.
 * 		- web.xml에 서블릿을 등록 및 매핑한다.
 * 		- @WebServlet 어노테이션으로 서블릿을 등록 및 매핑한다.
 */
public class FirstServlet extends HttpServlet {

	private static final long serialVersionUID = -5206829137206333067L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 한글이 깨지는 것을 방지하기 위해서 응답 헤더를 설정하는 메소드이다.
		resp.setContentType("text/html;charset=utf-8");
		
		// 응답 화면을 출력하기 위한 출력 스트림을 얻어온다.
		PrintWriter out = resp.getWriter(); // 문자 기반 출력 스트림
		
		// 자바 코드로 응답 화면을 작성
		out.write("<!DOCTYPE html>");
		out.write("<html>");
		out.write("<body>");
		out.write("<h1>첫 번째 서블릿이 반환한 내용</h1>");
		out.write("<p>현재 시간 : " + LocalDateTime.now().toString() +"</p>");
		out.write("</body>");
		out.write("</html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	
}
