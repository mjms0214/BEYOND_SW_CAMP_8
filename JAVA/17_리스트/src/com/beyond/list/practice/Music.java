package com.beyond.list.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Music implements Comparable<Music> {
	
	@Getter
	private String title;
	private String artist;
	@Setter
	private int ranking;
	
	/*
	 * compareTo() 
	 * 	- 메소드에서 반환되는 값을 가지고 정렬 기준을 잡는다.
	 * 	- 비교해서 같으면 0을 리턴한다.
	 * 	- 비교해서 자신이 크다면 양의 정수를 리턴한다.
	 * 	- 비교해서 자신이 작다면 음의 정수를 리턴한다.
	 */
	@Override
	public int compareTo(Music music) {
		// 랭킹 순서대로 정렬하는 코드
		
		return this.ranking - music.ranking;
//		return music.ranking - this.ranking; // 내림차순 정렬
	}
	
}
