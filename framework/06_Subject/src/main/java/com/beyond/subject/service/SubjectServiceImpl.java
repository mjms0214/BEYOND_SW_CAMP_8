package com.beyond.subject.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.beyond.subject.mapper.SubjectMapper;
import com.beyond.subject.vo.Subject;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {
	private final SubjectMapper subjectMapper;
	
	@Override
	public List<Subject> getSubjects(int page, int numOfRows) {
		int limit =  numOfRows;
		int offset = (page - 1) * limit;
		
		RowBounds rowBounds = new RowBounds(offset, limit);
		
		return subjectMapper.selectSubjects(rowBounds);
	}

	@Override
	public int getTotalCount() {
		return subjectMapper.selectSubjectCount();
	}

	@Override
	public Subject getSubjectBySubNo(String subNo) {
		return subjectMapper.selectSubjectBySubNo(subNo);
	}

	@Override
	@Transactional
	public int save(Subject subject) {
		int result = 0;
		
		if(subject.getNo() != null ) {
			// update
			result = subjectMapper.updateSubject(subject);
		} else {
			// insert
			result = subjectMapper.insertSubject(subject);
		}
		
		return result;

	}

	@Override
	public void delete(String subNo) {
		subjectMapper.deleteSubject(subNo);
	}

}
