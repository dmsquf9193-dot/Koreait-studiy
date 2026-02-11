package kr.co.studyProject.member.repository;

import java.lang.reflect.Member;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

	boolean existsByNickname(String nickname);
	
	boolean existsByEmail(String email);
	
	Member findByNickname(String nickname);

	


}
