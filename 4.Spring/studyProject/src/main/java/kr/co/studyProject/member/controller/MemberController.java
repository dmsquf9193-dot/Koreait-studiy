package kr.co.studyProject.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import kr.co.studyProject.member.dto.ReqLoginDTO;
import kr.co.studyProject.member.dto.ReqRegisterDTO;
import kr.co.studyProject.member.dto.ResLoginDTO;
import lombok.RequiredArgsConstructor;

@Controller 
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
	
	@GetMapping("/register/form")
	public String registerForm() {
		return "pages/member/register";
	}
	
	@PostMapping("/register")
	public String register(ReqRegisterDTO request) {
		memberService.register(request);
		
		return "redirect:/member/login/form";
	}
	
	@GetMapping("/login/form")
	public String loginForm() {
		return "pages/member/login";
	}
	
	@PostMapping("/login")
	public String loginForm(ReqLoginDTO request,
			                HttpSession session) {
		
		ResLoginDTO response = memberService.login(request);
		
		if(response == null) {
			return "redirect:/member/register/form";
		}
		
		session.setAttribute("LOGIN_USER", response);
		return "redirect:/";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		
		session.invalidate();
		
		return "redirect;/";
	}


}
