package com.beyond.department.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.beyond.department.vo.Department;

@Mapper
public interface DepartmentMapper {
	List<Department> selectDepartments(@Param("openYn") String openYn, RowBounds rowBounds);

	int selectDepartmentCount(@Param("openYn") String openYn);

	Department selectDepartmentByDeptNo(String deptNo);

	int insertDepartment(Department department);

	int updateDepartment(Department department);

	void deleteDepartment(String deptNo);

}
