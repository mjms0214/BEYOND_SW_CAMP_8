package com.beyond.api.practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class C_JavaTime {
	/*
	 * java.time 패키지
	 * 	- 자바 1.8부터는 날짜와 시간을 나타내는 java.time 패키지를 제공한다.
	 */
	public void method1() {
		// 날짜와 시간정보를 모두 저장할 수 있다.
		LocalDateTime now = LocalDateTime.now(); // 현재 날짜와 시간 정보를 저장한 객체를 생성한다.
		// 매개값으로 주어진 날짜와 시간 정보를 저장한 객체를 생성한다.
//		LocalDateTime when = LocalDateTime.of(2024, 6, 13, 18, 10, 30);
		LocalDateTime when = LocalDateTime.parse("2024-05-25T20:20:39");
		
		System.out.println(now);
		System.out.println(when);
		System.out.println(ZonedDateTime.now());
		System.out.println();
		
		System.out.println(now.getYear());
		System.out.println(now.getMonth());
		System.out.println(now.getMonthValue());
		System.out.println(now.getDayOfMonth());
		System.out.println(now.getDayOfWeek());
		System.out.println(now.getDayOfYear());
		System.out.println(now.getHour());
		System.out.println(now.getMinute());
		System.out.println(now.getSecond());
		System.out.println(now.getNano());
		System.out.println();
		
		// 날짜와 시간을 조작하기
//		LocalDateTime plusDays = now.plusDays(1);
		LocalDateTime plusDays = now.plusDays(1).plusMonths(1).plusYears(2);
		LocalDateTime minusMonths = now.minusMinutes(2);
		
		System.out.println(now);
		System.out.println(plusDays);
		System.out.println(minusMonths);
		System.out.println();
		
		System.out.println(now.isAfter(plusDays));
		System.out.println(now.isBefore(plusDays));
		System.out.println(now.isEqual(plusDays));
		System.out.println(now.isAfter(minusMonths));
		System.out.println(now.isBefore(minusMonths));
		System.out.println();
		
		// 날짜 정보를 저장할 수 있다.
//		LocalDate localDate = LocalDate.now();
//		LocalDate localDate = LocalDate.of(2022, 5, 25);
//		LocalDate localDate = LocalDate.parse("2024-05-25");
		LocalDate localDate = now.toLocalDate();
		
		// 시간 정보를 저장할 수 있다.
//		LocalTime localTime = LocalTime.now();
//		LocalTime localTime = LocalTime.of(20, 49, 59);
//		LocalDate localTime = localTime.parse("20:49:59");
		LocalTime localTime = LocalTime.of(20, 30, 30);
		
		System.out.println(localDate);
		System.out.println(localTime);
		System.out.println();
		
		// DateTimeFormatter 클래스 사용
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		System.out.println(now);
		System.out.println(now.format(formatter));
		System.out.println();
		
		System.out.println(now.format(DateTimeFormatter.ISO_WEEK_DATE));
		System.out.println(now.format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println(LocalDate.parse("2024-W30-7", DateTimeFormatter.ISO_WEEK_DATE));
		System.out.println();
		
	}
}
