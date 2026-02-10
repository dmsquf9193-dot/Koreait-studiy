package kr.co.studyProject.member.service.impl;


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
		
		if(memberRespository.existsByNickname(request.getNickname())) {
			System.out.println("이미 존재하는 닉네임 입니다.");
		}
		
		if(memberRepository.existsByEmail(request.getEmail())) {
		    System.out.println("이미 존재하는 이메일 입니다.");
		}
		
		String encodedPassword = passwordEncoder.encode(request.getPassword());
		
		Memeber member = new Member();
		member.setUserName(request.getUserName());
		member.setNickname(request.getNickname());
		member.setEmail(request.getEmail());
		member.setPassword(encodedPassword);
		
		memberRepository.save(member);
	
	}

}
