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
	private Long id;
	private String UserName;
	private String nickname;
	private String email;
	
	private LocalDateTime createdAt;
	private LocalDateTime updateAt;
}