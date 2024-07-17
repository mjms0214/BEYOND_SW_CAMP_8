package com.beyond.university.student.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.beyond.university.student.model.vo.Student;

@Mapper
public interface StudentMapper {

	List<Student> selectAllByDeptNo(@Param("deptNo") String deptNo);

	Student selectStudentByNo(@Param("sno") String sno);

	int insertStudent(Student student);

}
