package kr.co.koreait;

public class Ex18_2_Person {
	// 필드 선언만
	// 이름(name)
	// 나이(age)
	// 주소(Addr)
	// 핸드폰번호(phone)
	
	String name;
	int age;
	String Addr;
	String phone;
	final static String HOBBY = "변기뿌수는 은버리 지키키";
	
	// 이름하고 나이만 받는 생성자
	// - 주소랑 핸드폰 번호는 기본값을 지정해서 줌
	Ex18_2_Person(String name, int age) {
		this.name = name;
		this.age = age; 
		this.Addr = "서울";
		this.phone = "개통중";
		
	}
	
	
	
	// 클래스명.필드명
	Ex18_2_Person(String name, int age, String Addr, String phone) {
	   System.out.println("생성자가 호출되었습니다.");
	   this.name = name;
	   this.age = age;
	   this.Addr = Addr;
	   this.phone = phone;
	   
	}
	// Ex18_2_Person() {}
	
	
	// intorudce 메서드
	// - "이름 : OOO"
	// - "나이 : OOO"
	// - "주소 : OOO"
	// - "핸드폰번호 : OOO"
	public void introduce() {
		System.out.println("이름 : " + name);
	    System.out.println("나이 : " + age);
	    System.out.println("주소 : " + Addr);
		System.out.println("핸드폰번호 : " + phone);
		
	}
	

}
