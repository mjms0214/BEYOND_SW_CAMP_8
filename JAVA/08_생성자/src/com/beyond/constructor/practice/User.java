package com.beyond.constructor.practice;

public class User {
	// 필드 선언
		private String id;
		
		private String password;
		
		private String name;
		
		private int age;
		
		private char gender;
		
		/*
		 * 기본 생성자
		 * 
		 * 객체 생성만을 목적으로 사용된다.
		 * 기본 생성자를 생략하는 경우 자동으로 만들어준다.
		 */
		public User() {
//			System.out.println("기본 생성자 호출");
		}
		
		/*
		 * 생성자를 private으로 선언하면 외부에서 절대로 객체를 생성할 수 없다.
		 * 클래스 내부에서만 생성자를 호출할 수 있고 객체를 생성할 수 있다.
		 */
//		private User() {
//		}
		
		// 매개변수가 있는 생성자 (아이디, 패스워드, 이름)
		// 객체 생성과 동시에 전달된 값들로 필드를 초기화하는 목적으로 사용된다.
		public User(String id, String password, String name) {
			this.id = id;
			this.password = password;
			this.name = name;
		}
		
		// 매개변수가 있는 생성자 (아이디, 패스워드, 이름, 나이, 성별)
		public User(String id, String password, String name, int age, char gender) {
			// 클래스 내에서 문자열 매개변수 3개를 가지는 생성자를 호출한다.
			this(id, password, name);
			this.age = age;
			this.gender = gender;
		}
		
		// 메소드 선언
		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public char getGender() {
			return gender;
		}

		public void setGender(char gender) {
			this.gender = gender;
		}
		
		public String information() {
//			메소드 내부에서는 this()를 사용해서 생성자를 호출할 수 없다.
//			this(id, password, name);
//			System.out.println(this);
			
			return String.format("%s, %s, %s, %d, %c", 
					this.id, this.password, this.name, age, gender);
		}
}
