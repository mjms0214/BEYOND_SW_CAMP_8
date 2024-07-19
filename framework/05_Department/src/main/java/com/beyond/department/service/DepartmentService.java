package com.beyond.department.service;

import java.util.List;

import com.beyond.department.vo.Department;

public interface DepartmentService {

	List<Department> getDepartments(int page, int numOfRows, String openYn);

	int getTotalCount(String openYn);

}
