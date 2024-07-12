package com.beyond.mvc.member.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beyond.mvc.member.model.repository.MemberRepository;
import com.beyond.mvc.member.model.vo.Member;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberRepository repository;

	public MemberServiceImpl(MemberRepository repository) {
		this.repository = repository;
	}

	@Override
	public Member login(String userId, String userPwd) {
		Member member = null;
		
		member = repository.findMemberById(userId);
		
		if (member == null || !member.getPassword().equals(userPwd)) {
			return null;
		}
		
		return member;
	}

}
