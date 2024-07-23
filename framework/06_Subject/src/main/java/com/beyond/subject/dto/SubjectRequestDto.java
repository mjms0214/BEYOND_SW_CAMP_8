package com.beyond.subject.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SubjectRequestDto {
	@Schema(description = "과목 번호", example = "C8033801")
	private String no;
	@Schema(description = "과목 이름", example = "수학심화")
	private String name;
	@Schema(description = "선수 과목", example = "C1141800")
	private String preattendingClass;
	@Schema(description = "과목 유형", example = "전공선택")
	private String type;
	@Schema(description = "학과 번호", example = "022")
	private String departmentNo;
}
