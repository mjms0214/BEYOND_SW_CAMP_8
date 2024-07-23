package com.beyond.subject.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.beyond.subject.dto.BaseResponseDto;
import com.beyond.subject.dto.ItemsResponseDto;
import com.beyond.subject.dto.SubjectRequestDto;
import com.beyond.subject.service.SubjectService;
import com.beyond.subject.vo.Subject;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/subject-service")
@Tag(name = "Subjects APIs", description = "과목 관련 API 목록")
@RequiredArgsConstructor
public class SubjectController {
	private final SubjectService subjectService;
	@GetMapping("/subejcts")
	@Operation(summary="과목 목록 조회", description = "전체 과목의 목록을 조회한다.")
	@ApiResponse(responseCode="404", description="NOT FOUND",
	content=@Content(mediaType="application/json"))
	@Parameters(
		value = {
			@Parameter(name = "page", description = "페이지 번호", example = "1"),
			@Parameter(name = "numOfRows", description = "한 페이지의 결과 수", example = "10")
			
		}
	)
	public ResponseEntity<ItemsResponseDto<List<Subject>>> getDepartments(@RequestParam int page, @RequestParam(required = false) int numOfRows) {
		int totalCount = subjectService.getTotalCount();
		List<Subject> subjects = subjectService.getSubjects(page, numOfRows);
	
		if (subjects.size() > 0) {
			return ResponseEntity.ok(new ItemsResponseDto<>(HttpStatus.OK, subjects, page, subjects.size(), totalCount));			
		} else {
			return ResponseEntity.ok(new ItemsResponseDto<>(HttpStatus.NOT_FOUND, subjects, page, subjects.size(), totalCount));						
		}
		
	}
	
	@GetMapping("/subjects/{subject-no}")
	@Operation(summary = "과목 상세 조회", description = "과목 번호로 학과의 상세 정보를 조회한다.")	
	@ApiResponses(
			value = {
				@ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json")),
				@ApiResponse(responseCode = "404", description = "NOT FOUND", content = @Content(mediaType = "application/json"))
			}
	)
	
	public ResponseEntity<BaseResponseDto<Subject>> getDepartmentByDeptNo(@Parameter(description = "과목 번호", example = "C0003400") @PathVariable("subject-no") String subNo) {
		Subject subject = subjectService.getSubjectBySubNo(subNo);
		if (subject != null) {
			return ResponseEntity.ok(new BaseResponseDto<>(HttpStatus.OK, subject));			
		} else {
			return ResponseEntity.ok(new BaseResponseDto<>(HttpStatus.NOT_FOUND, subject));			
		}
	}
	
	@PostMapping("/subjects")
	@Operation(summary = "과목 등록", description = "과목 정보를 JSON으로 받아서 등록한다.")
	@ApiResponses(value = {
			@ApiResponse(
					responseCode="201",
					description="CREATE",
					content=@Content(mediaType = MediaType.APPLICATION_JSON_VALUE)),
			@ApiResponse(
					responseCode="500",
					description="INTERNAL SERVER EROOR")
	})
	public ResponseEntity<BaseResponseDto<Subject>> create(
			@RequestBody SubjectRequestDto requestDto) {
		Subject subject = new Subject(requestDto);
		
		subjectService.save(subject);
		
		return ResponseEntity.ok(new BaseResponseDto<>(HttpStatus.CREATED, subject));
	}
	
	@PutMapping("/subjects/{subject-no}")
	@Operation(summary = "과목 정보 수정", description = "과목 정보를 JSON으로 받아 수정한다.")
	@ApiResponses(value = {
			@ApiResponse(
					responseCode="200",
					description="OK",
					content=@Content(mediaType = MediaType.APPLICATION_JSON_VALUE)),
			@ApiResponse(
					responseCode="404",
					description="NOT FOUND",
					content=@Content(mediaType = MediaType.APPLICATION_JSON_VALUE)),
	})
	public ResponseEntity<BaseResponseDto<Subject>> update(@Parameter(description = "과목 번호", example = "C8033801")@PathVariable("subject-no") String subNo, @RequestBody SubjectRequestDto requestDto){
		Subject subject = subjectService.getSubjectBySubNo(subNo);
		
		if (subject != null) {
			subject.setSubjectRequestDto(requestDto);
			subjectService.save(subject);
			return ResponseEntity.ok(new BaseResponseDto<>(HttpStatus.OK, subject));
		} else {
			return ResponseEntity.ok(new BaseResponseDto<>(HttpStatus.NOT_FOUND, subject));	
		}
		
	}
	
	@DeleteMapping("/subjects/{subject-no}")
	@Operation(summary = "과목 삭제", description = "과목 번호로 해당 과목을 삭제한다.")
	@ApiResponses(value = {
			@ApiResponse(
					responseCode="200",
					description="OK",
					content=@Content(mediaType = MediaType.APPLICATION_JSON_VALUE)),
			@ApiResponse(
					responseCode="404",
					description="NOT FOUND",
					content=@Content(mediaType = MediaType.APPLICATION_JSON_VALUE)),
	})
	public ResponseEntity<BaseResponseDto<Subject>> delete(@Parameter(description = "과목 번호", example = "C8033801") @PathVariable("subject-no") String subNo){
		Subject subject = subjectService.getSubjectBySubNo(subNo);
		
		if (subject != null) {			
			subjectService.delete(subject.getNo());

			return ResponseEntity.ok(new BaseResponseDto<>(HttpStatus.OK, subject));
		} else {
			return ResponseEntity.ok(new BaseResponseDto<>(HttpStatus.NOT_FOUND, subject));	
		}
	}
}
