package com.beyond.map.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Snack {
	private String name;
	private String flavor;
	private int    calorie;
}
