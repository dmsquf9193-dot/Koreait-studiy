package kr.co.studyProject.member.service.impl;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kr.co.studyProject.member.dto.ReqLoginDTO;
import kr.co.studyProject.member.dto.ReqRegisterDTO;
import kr.co.studyProject.member.dto.ResLoginDTO;
import kr.co.studyProject.member.entity.Member;
import kr.co.studyProject.member.repository.MemberRepository;
import kr.co.studyProject.member.service.MemberService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
	private final MemberRepository memberRepository;
	private final BCryptPasswordEncoder passwordEncoder;


@Override
public void register(ReqRegisterDTO request) {
	if(!request.getPassword().equals(request.getPasswordCheck())) {
		System.out.println("비밀번호가 일치하지 않습니다.");
	}
	if(memberRepository.existsByEmail(request.getEmail())) {
		System.out.println("이미 존재하는 이메일 입니다.");
	}
	
	String encodedPassword = passwordEncoder.encode(request.getPassword());
	
	Member member = new Member();
	member.setNickname(request.getNickname());
	member.setUserName(request.getUserName());
	member.setEmail(request.getEmail());
	member.setPassword(request.getPassword());
	
	memberRepository.save(member);
	
	
 }


@Override
public ResLoginDTO login(ReqLoginDTO request) {
	// TODO Auto-generated method stub
	return null;
}


}