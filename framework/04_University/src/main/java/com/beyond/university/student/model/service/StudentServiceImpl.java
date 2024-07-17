package com.beyond.university.student.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.beyond.university.student.mapper.StudentMapper;
import com.beyond.university.student.model.vo.Student;


@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentMapper studentMapper;

	@Override
	public List<Student> getStudentsByDeptNo(String deptNo) {
		
		return studentMapper.selectAllByDeptNo(deptNo);
	}

	@Override
	public Student getStudentByNo(String sno) {
		return studentMapper.selectStudentByNo(sno);
	}

	@Override
	@Transactional
	public int save(Student student) {
		int result = 0;
		
		if (student.getNo() != null) {
			// update
		} else {
			// insert
			result = studentMapper.insertStudent(student);
		}
		
		return result;
	}

}
