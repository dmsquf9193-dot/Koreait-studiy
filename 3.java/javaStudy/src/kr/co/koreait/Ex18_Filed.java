package kr.co.koreait;

public class Ex18_Filed {
	// 필드
	int num = 10; // 인스턴스 변수

	public static void main(String[] args) {
		// 필드(=멤버 변수)
		// - 클래스 레벨의 변수를 의미
		int num2 = 20;
		
		Ex18_1_Car car = new Ex18_1_Car();
		car.wheel = 5;
		
		System.out.println(car.speed);
		System.out.println(car.wheel);
		
		Ex18_1_Car sonata = new Ex18_1_Car();
		sonata.wheel = 7;
		sonata.speed = 140;
		
		System.out.println(sonata.speed);
		System.out.println(sonata.wheel);
		
    	Ex18_2_Person ps = new Ex18_2_Person("짱구", 20, "서울", "없음");
//		ps.name = "짱구";
//		ps.age = 20;
//		ps.Addr = "서울";
//		ps.phone = "없음";
		ps.introduce();
		
		Ex18_2_Person ps1 = new Ex18_2_Person("오렌지", 20);
		ps1.introduce();
		

//		Ex18_2_Person dog = new Ex18_2_Person();
//		dog.name = "체리";
//		dog.age = 18;
//		dog.Addr = "무지개시 다리구 건너동 강아지 마을";
//		dog.phone = "010-7777-7777";
//		dog.introduce();
	
	//Ex18_2_Person ex18_2_Person = new Ex18_2_Person();
	 //System.out.println(Ex18_2_Person.HOBBY);
	// ex18_2_Person.introduce();
		
		
	}

}
