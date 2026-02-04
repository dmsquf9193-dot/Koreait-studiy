package kr.co.training;

public class Ex23_1_Cow extends Ex23_1_Animal {
	// Animal 클래스를 상송 받습니다.
	
	// Cry 메서드를 오버라이딩 하세요.
	// - 매개변수 동일
	// - "소가 OOO하고 소리를 냅니다." 출력
	@Override
	public void cry(String soundString) {
		System.out.println("소가" + soundString + "소리를 냅니다.");
	}

}
