package com.beyond.subject.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import com.beyond.subject.vo.Subject;

@Mapper
public interface SubjectMapper {

	List<Subject> selectSubjects(RowBounds rowBounds);

	int selectSubjectCount();

	Subject selectSubjectBySubNo(String subNo);

	int insertSubject(Subject subject);

	int updateSubject(Subject subject);

	void deleteSubject(String subNo);


}
