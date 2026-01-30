package kr.co.koreait;

public class Ex14_Overloading {

	public static void main(String[] args) {
		// 오버로딩 (Overloading)*****중요*****
		// - 같은 메서드 이름을 사용하지만 매개변수의 타입(자료형)과 위치가 다른 방식
		                                                             
		// 객체 생성
		// - 클래스명 변수명 = new 클래스명()
		Ex14_Overloading ol = new Ex14_Overloading();
		Ex14_1_Calc numero = new  Ex14_1_Calc();
		// 메서드 호출
		// - 변수명.메서드명()
		ol.introduce("고은별");
		ol.introduce("고은별", 20);
		
		numero.add(20, 30);
		numero.add(50, 60, 70);
	}
	
	
	public void introduce(String name) {
		System.out.println("안녕하세요. 제 이름은 " + name + "입니다.");
	}
	
	public void introduce(String name, int age) {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}
	
	

}
