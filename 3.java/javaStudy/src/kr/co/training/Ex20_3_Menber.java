package kr.co.training;

public class Ex20_3_Menber {

	private Ex20_3_MemberInfo mi;

	// - introduce 메서드
	//  > Ex20_3_MemberInfo를 매개변수로 받습니다.
	//  > "이름 : "
	//  > "나이 : "
	//  > "사는곳 : "
	//  > "학생여부 : " (true면 학생, false 학생 아님)
	public void introduce(Ex20_3_MemberInfo mi) {
		String StrStudent;
		
		if (mi.getIsStudent()) {
			StrStudent = "학생";
		} else { // 가져온 isStudent가 false면
			StrStudent = "학생 아님";
		}
		
		System.out.println("이름 :" + mi.getName());
		System.out.println("나이 :" + mi.getAge());
		System.out.println("사는곳 :" + mi.getAddr());
		System.out.println("학생여부 : " + mi.getIsStudent());
		
	}
	
	// - run 메서드
    //  > Ex20_3_MemberInfo를 매개변수로 받습니다.
	//  >"OOO에 사는 OOO이 달리고 있습니다." 출력
	public void run(Ex20_3_MemberInfo mi) {
		System.out.println(mi.getAddr() + "에 사는" + mi.getName() + "이 달리고 있습니다.");
	}
	

}
