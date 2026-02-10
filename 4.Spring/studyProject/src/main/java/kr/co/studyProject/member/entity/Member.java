package kr.co.studyProject.member.entity;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Member {
	@Id
	@GenerratedValue(strategy = GenerationType.IDENTITY)
	private String userName;
	private String email;
	private String nickname;
	private String password;
	private String phone;
	
	private LocalDateTime createsAt;
	private LocalDateTime updateAt;
	
	@PrePersist
	public void prePersist() {
		this.createsAt = LocalDateTime.now();
	}
	

}
