package com.beyond.list.practice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class A_ArrayList {
	
	public void method1() {
		List list = new ArrayList();
//		List list = new Vector();
//		List list = new LinkedList();
		
		// 객체를 저장할 때는 add() 메소드를 사용한다.
		list.add("안녕하세요.");
		list.add(LocalDateTime.now());
		list.add(3.14);
		list.add(false);
		list.add('a');
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println();
		
		// 객체를 가져올 때는 get() 메소드를 사용한다.
		String str = (String)list.get(0);
		LocalDateTime now = (LocalDateTime)list.get(1);
		Double number = (Double)list.get(2);
		
		System.out.println(str);
		System.out.println(now);
		System.out.println(number);
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		// 객체의 중복 저장을 허용한다.
		list.add("안녕하세요.");
		// null 저장을 허용한다.
		list.add(null);
		list.add(null);
		
		System.out.println(list);
		System.out.println();
		
		// 원하는 인덱스 위치에 객체를 추가할 수 있다.
		list.add(2, 12000);
		// 원하는 인덱스 위치에 객체를 변경할 수 있다.
		list.set(2, false);
		
		System.out.println(list);
		System.out.println();
		
		// 저장된 객체를 삭제할 때는 remove() 메소드를 사용한다.
		list.remove(2);
		list.remove("안녕하세요.");
//		list.remove("안녕하세요.");
		list.remove(null);
		
		list.removeFirst();
		list.removeLast();
		
		System.out.println(list);
		System.out.println();
		
		// List 에 저장된 객체를 모두 삭제할 때는 clear() 메소드를 사용한다.
		System.out.println(list.isEmpty()); // List 가 비어있는지 확인하는 메소드이다.
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		System.out.println();
	}

	public void method2() {
		/*
		 * 컬렉션에서 제네릭스(<>)를 사용하는 이유
		 * 	- 명시된 타입의 객체만 저장하도록 제한을 두기 위해서 사용한다.
		 * 	- 컬렉션에 저장된 객체를 꺼내서 사용할 때 매번 형 변환을 하지 않아도 된다.
		 */
		List<String> fruits = new ArrayList<>();
//		List<int> numbers;
		List<Integer> numbers = new ArrayList<>();
		
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("mango");
		fruits.add("grape");
		
		numbers.add(Integer.valueOf(8));
		numbers.add(Integer.valueOf("1"));
		numbers.add(7);
		numbers.add(10);
		numbers.add(3);
		numbers.add(2);
		
	
		System.out.println(fruits);
		System.out.println(numbers);
		System.out.println();
		
		// 오름차순으로 리스트를 정렬
		Collections.sort(fruits);
		Collections.sort(numbers);
		
		System.out.println(fruits);
		System.out.println(numbers);
		System.out.println();
		
		// 내림차순으로 리스트를 정렬
		Collections.reverse(fruits);
		Collections.reverse(numbers);
		
		System.out.println(fruits);
		System.out.println(numbers);
		System.out.println();
		
		
	}

	public void method3() {
		
		List<Music> list = new ArrayList<>();
		
		list.add(new Music("How Sweet", "뉴진스", 1));
		list.add(new Music("소나기", "이클립스", 3));
		list.add(new Music("해야", "아이브", 6));
		list.add(new Music("ETA", "뉴진스", 5));
		list.add(new Music("Drama", "에스파", 4));
		list.add(new Music("미안해 미워해 사랑해", "크러쉬", 2));

		for (Music music : list) {
			System.out.println(music);
		}
		
		System.out.println();
		
		// 오름차순으로 리스트를 정렬 (랭킹순으로 리스트를 정렬)
		Collections.sort(list);
		
		for (Music music : list) {
			System.out.println(music);
		}
		
		System.out.println();
		
		// 아티스트순으로 리스트를 오름차순 정렬
		Collections.sort(list, new ArtistAcending());
		
		for (Music music : list) {
			System.out.println(music);
		}
		
		System.out.println();
		
		// 아티스트순으로 리스트를 내림차순 정렬 ( 익명 구현 객체를 사용)
		Collections.sort(list, new Comparator<Music>() {

			@Override
			public int compare(Music o1, Music o2) {
				
				return o2.getArtist().compareTo(o1.getArtist());
			}
			
		});
		
		for (Music music : list) {
			System.out.println(music);
		}
		
		System.out.println();
		
		// 타이틀순으로 리스트를 오름차순 정렬(람다식을 사용)
		Collections.sort(list, (o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));
		
		for (Music music : list) {
			System.out.println(music);
		}
		
		System.out.println();
	}
}
