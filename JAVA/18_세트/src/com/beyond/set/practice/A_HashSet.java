package com.beyond.set.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class A_HashSet {
	public void method1() {
		Set<String> set = new HashSet<>();

		System.out.println(set.isEmpty());
		System.out.println(set.size());
		
		set.add(null);
		set.add("반갑습니다.");
		set.add(new String("반갑습니다."));
		set.add("여러분");
		set.add("안녕하세요.");
		set.add("여러분");
		set.add(null);
		
		System.out.println(set);
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		System.out.println(set.contains("여러분"));
		System.out.println();
		
		// Set 에 저장된 객체에 접근하는 방법
		// 1. 향상된 for 문을 사용하는 방법
		for (String str : set) {
			System.out.println(str);
		}
		
		System.out.println();
		
		// 2. HashSet에 저장된 객체들을 ArrayList에 담아서 사용하는 방법
		ArrayList<String> list = new ArrayList<>(set);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		// 3. Iterator 반복자를 사용하는 방법
		// 	- 가져올 객체가 있는지 확인할 때는 hasNext() 메소드를 사용한다.
		// 	- 하나의 객체를 가져올 때는 next() 메소드를 사용한다.
		Iterator<String> iterator = set.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println();
		
		iterator = set.iterator();
		
//		iterator.forEachRemaining((t) -> System.out.println(t + "_lambda"));
		iterator.forEachRemaining(System.out::println);
		
		
	}
	
	public void method2() {
		Set<Music> set = new HashSet<>();
		
		set.add(new Music("How Sweet", "뉴진스", 1));
		set.add(new Music("How Sweet", "뉴진스", 1));
		set.add(new Music("소나기", "이클립스", 3));
		set.add(new Music("해야", "아이브", 6));
		set.add(new Music("해야", "아이브", 6));
		set.add(new Music("ETA", "뉴진스", 5));
		set.add(new Music("Drama", "에스파", 4));
		set.add(new Music("미안해 미워해 사랑해", "크러쉬", 2));

		for (Music music : set) {
			System.out.println(music);
		}
		
		System.out.println();
	}

	public void method3() {
		TreeSet<String> ts = new TreeSet<>();
		TreeSet<Music> set = new TreeSet<>();
		
		// 중복제거, 정렬, null 저장 X
		ts.add("하하하");
		ts.add("나나나");
		ts.add("가가가");
		ts.add("다다다");
		ts.add("다다다");
		ts.add("하하하");
		
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println();
		
		set.add(new Music("How Sweet", "뉴진스", 1));
		set.add(new Music("How Sweet", "뉴진스", 1));
		set.add(new Music("소나기", "이클립스", 3));
		set.add(new Music("해야", "아이브", 6));
		set.add(new Music("해야", "아이브", 6));
		set.add(new Music("ETA", "뉴진스", 5));
		set.add(new Music("Drama", "에스파", 4));
		set.add(new Music("미안해 미워해 사랑해", "크러쉬", 2));
		
		for (Music music : set) {
			System.out.println(music);
		}
		
		System.out.println();
	}
}
