package com.beyond.subject.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {

	private String no;
	private String name;
	private String category;
	private String openYn;
	private int capacity;

}

