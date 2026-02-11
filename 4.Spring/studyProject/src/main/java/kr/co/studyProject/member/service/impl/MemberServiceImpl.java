package kr.co.studyProject.member.service.impl;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kr.co.studyProject.member.dto.ResLoginDTO;
import kr.co.studyProject.member.entity.Member;
import kr.co.studyProject.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class MemberServiceImpl {
	private final MemberRepository memberRepository;
	private final BCryptPasswordEncoder passwordEncoder;
	
	
	@Override
	public void register(ReqRegisterDTO request) {
		if(!request.getPassword().equals(request.getPasswordCheck())) {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
		
		if(memberRepository.existsByNickname(request.getNickname())) {
			System.out.println("이미 존재하는 닉네임 입니다.");
		}
		
		if(memberRepository.existsByEmail(request.getEmail())) {
		    System.out.println("이미 존재하는 이메일 입니다.");
		}
		
		String encodedPassword = passwordEncoder.encode(request.getPassword());
		
		Member member = new Member();
		member.setUserName(request.getUserName());
		member.setNickname(request.getNickname());
		member.setEmail(request.getEmail());
		member.setPassword(encodedPassword);
		
		memberRepository.save(member);
	
	}
	
	
	@Override
	public ResLoginDTO login(ReqLoginDTO request) {
		
		Member member = memberRepository.findByUserId(request.getUsernickname());
		
		if(member == null) {
			return null;
		}
		
		if(!passwordEncoder.matches(request.getPassword(), member.getPassword())) {
			System.out.println(request.getPassword());
			System.out.println(member.getPassword());
			return null;
		}
		ResLoginDTO response = new ResLoginDTO();
		response.setUserName(member.getNickname());
		response.setUserName(member.getUserName());
		response.setCreatedAt(member.getCreatedAt());
		response.setUpdatedAt(member.getUpdatedAt());
		return response;
	}

}
