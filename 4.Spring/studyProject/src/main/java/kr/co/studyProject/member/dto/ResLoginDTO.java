package kr.co.studyProject.member.dto;

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
