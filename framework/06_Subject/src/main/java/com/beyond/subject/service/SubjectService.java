package com.beyond.subject.service;

import java.util.List;

import com.beyond.subject.vo.Subject;

public interface SubjectService {

	List<Subject> getSubjects(int page, int numOfRows);

	int getTotalCount();

	Subject getSubjectBySubNo(String subNo);

	int save(Subject subject);

	void delete(String no);

}
