package kr.co.studyProject.member.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResLoginDTO {
	private String userName;
	private String nickname;
	private String email;
	private String phone;

	private LocalDateTime createAt;
	private LocalDateTime updatedAt;
	
		
	}

