package com.beyond.university.student.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.beyond.university.student.model.service.StudentService;
import com.beyond.university.student.model.vo.Department;
import com.beyond.university.student.model.vo.Student;
import com.beyond.university.student.model.service.DepartmentService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j //lombok 로거
@Controller
@RequiredArgsConstructor
public class StudentController {
	private final DepartmentService departmentService;
	private final StudentService studentService;
	
	@GetMapping("/student/search")
	public ModelAndView search(ModelAndView modelAndView, @RequestParam(required=false) String deptNo) {
		List<Department> departments = departmentService.getDepartments();
		
		if (deptNo != null) {
			List<Student> students = studentService.getStudentsByDeptNo(deptNo);
			
//			System.out.println(students);
//			log.info(students.toString());
			
			modelAndView.addObject("students", students);
		}
		
		modelAndView.addObject("departments", departments);
		
		modelAndView.setViewName("student/search");
		
		return modelAndView;
	}
	
	@GetMapping("/student/info")
	public ModelAndView info(ModelAndView modelAndView, @RequestParam String sno) {
		Student student = studentService.getStudentByNo(sno);
		List<Department> departments = departmentService.getDepartments();
		
		System.out.println(student);
		
		modelAndView.addObject("student", student);
		modelAndView.addObject("departments", departments);
		modelAndView.setViewName("student/info");
		return modelAndView;
	}
	
	@GetMapping("/student/enroll")
	public ModelAndView enrollPage(ModelAndView modelAndView) {
		List<Department> departments = departmentService.getDepartments();
		
		modelAndView.addObject("departments", departments);
		modelAndView.setViewName("student/enroll");
		
		return modelAndView;
	}
	
	@PostMapping("/student/enroll")
	public ModelAndView enroll(ModelAndView modelAndView, Student student) {
	
		int result = 0;
		
		result = studentService.save(student);
		
		if (result > 0) {
			modelAndView.addObject("msg", "학생이 등록되었습니다.");
			modelAndView.addObject("location", "/student/info?sno=" + student.getNo());
			
			modelAndView.setViewName("redirect:/student/enroll");
		} else {
			modelAndView.addObject("msg", "학생 등록을 실패하였습니다.");
			modelAndView.addObject("location", "/student/enroll");
			
		}
		modelAndView.setViewName("common/msg");
		
		
		return modelAndView;
	}
}
