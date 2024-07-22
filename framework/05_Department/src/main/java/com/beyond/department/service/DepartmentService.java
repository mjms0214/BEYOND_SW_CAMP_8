package com.beyond.department.service;

import java.util.List;

import com.beyond.department.vo.Department;

public interface DepartmentService {

	List<Department> getDepartments(int page, int numOfRows, String openYn);

	int getTotalCount(String openYn);
	
	Department getDepartmentByDeptNo(String deptNo);

	int save(Department department);

	void delete(String no);

}
