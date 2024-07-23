package com.beyond.subject.vo;

import lombok.Data;

import com.beyond.subject.dto.SubjectRequestDto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subject {
	@Schema(description = "과목 번호", example = "C8033801")
	private String no;
	@Schema(description = "과목 이름", example = "수학2")
	private String name;
	@Schema(description = "선수 과목", example = "수학1")
	private String preattendingClass;
	@Schema(description = "과목 유형", example = "전공 필수")
	private String type;
	@Schema(description = "학과 번호", example = "064")
	private String departmentNo;
	
	public Subject(SubjectRequestDto requestDto) {
		this.setSubjectRequestDto(requestDto);
	}

	public void setSubjectRequestDto(SubjectRequestDto requestDto) {
		this.name = requestDto.getName();
		this.preattendingClass = requestDto.getPreattendingClass();
		this.type = requestDto.getType();
		this.departmentNo = requestDto.getDepartmentNo();

	}
}
