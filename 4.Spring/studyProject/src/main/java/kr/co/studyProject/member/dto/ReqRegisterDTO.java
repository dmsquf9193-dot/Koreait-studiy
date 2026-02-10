package kr.co.studyProject.member.dto;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class ReqRegisterDTO {
	private String userName;
	private String email;
	private String nickname;
	private String phone;
	private String password;
	private String passwordCheck;

}
