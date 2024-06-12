package com.beyond.inherit.practice;

import java.util.Objects;

/*
 *  모든 클래스는 Object 클래스를 상속한다.
 *  즉, 모든 클래스의 최상위 클래스는 Object 클래스이다.
 */
public class Book /* extends Object */{
	
	private String title;
	private String author;
	private int    price;
	
	public Book() {
		super();
	}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String information() {
		
		return String.format("title : %s, author : %s, price : %d\n",
				this.title, this.author, this.price);
	}

	
	/*
	 * 1. Obejct 클래스의 toString() 메소드
	 * 		- toString() 메소드는 객체의 문자 정보를 리턴한다.
	 * 		- 기본적으로 Object 클래스에서는 "클래스명@16진수 해시코드"를 리턴한다.
	 * 		- 자식 클래스에서 객체에 대한 유용한 문자열 정보를 리턴하도록 재정의할 수 있다.
	 */
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	/*
	 * 2. Obejct 클래스의 equals() 메소드
	 * 		- equals() 메소드는 매개값으로 전달받은 객체와 자신이 동일한 객체라면 true를 리턴하고 그렇지 않으면 false를 리턴한다.
	 * 		- 기본적으로 Object 클래스에서는 주소값을 비교하는데 자식 클래스에서 객체들이 가지고 있는 필드의 들을 비교하도록 재정의할 수 있다.
	 */
//	@Override
//	public boolean equals(Object obj) {
//		boolean result = false;
//		Book target = (Book)obj;
//		
//		result = this.title.equals(target.title) && this.author.equals(target.author) && this.price == target.price;
//		
//		return result;
//	}


	/*
	 * 3. Obejct 클래스의 hashCode() 메소드
	 * 		- 객체의 해시 코드란 객체를 식별할 수 있는 하나의 정수값을 의미한다.
	 * 		- 기본적으로 Object 클래스의 hashCode() 메소드는 객체의 메모리 번지를 이요해서 만들어주기 때문에 객체마다 다른 값을 가지고 있다.
	 * 		- 컬렉션들은 hashCode() 메소드를 가지고 두 객체가 동등한지 비교한다.
	 * 		  해시 코드값이 같으면 equals() 메소드로 다시 비교한다.
	 */
//	@Override
//	public int hashCode() {
//		/*
//		 * 해당 객체의 필드 값들을 하나의 문자열로 합쳐서 해당 문자열의 해시 코드를 리턴해준다.
//		 * 
//		 * String 클래승에서 같은 문자열의 경우 해당 문자열의 hashCode는 같도록 이미 재정의되어 있다.
//		 */
//		return (this.title + this.author + this.price).hashCode(); 
//	}
	
	// 이클립스를 사용해서 재정의
	@Override
	public int hashCode() {
		return Objects.hash(author, price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && price == other.price && Objects.equals(title, other.title);
	}
	
	
	

}
