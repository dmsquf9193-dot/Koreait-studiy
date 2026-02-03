package kr.co.koreait;

public class Ex23_Ploy {
    // 리모콘 생각하면 됨 프로그램안에는 있으나 실행 버튼이 없음 ㅋ
	public static void main(String[] args) {
		// 부모 클래스 타입으로 객체 생성 (평소 방식)
		Ex23_1_Parent parent = new  Ex23_1_Parent();
		parent.printHello();
		
		// 자식 클래스 타입으로 객체 생성 (평소 방식)
		Ex23_1_Child child = new Ex23_1_Child();
		child.printHello();
		child.displayHello();
		
		Ex23_1_Parent p = child; // 클래스 타입 변환(자식객체이름이 부모객체이름으로 변신)
		
		// 클래스 타입 변환 (자식 객체를 부모 타입으로)
		// 부모 클래스에 있는 변수와 메서드만 사용 가능
		Ex23_1_Parent p1 = new  Ex23_1_Child();
		p1.printHello();
		
	// 타입 제한
		Ex23_2_Calendar calendar = new Ex23_2_DeskCalendar("빨강", 8);
		calendar.info();
		calendar.hanging();
	//  calendar.onTheDesk();
		
		
		EX23_3_ComputerRoom cr = new EX23_3_ComputerRoom();
		cr.computer1 = new Ex23_3_Samsong();
		cr.computer2 = new Ex23_3_Samsong();
		cr.computer3 = new Ex23_3_Samsong();
		
		cr.computer4 = new Ex23_3_LZ();
		cr.computer5 = new Ex23_3_LZ();
		cr.computer6 = new Ex23_3_LZ();
		
		cr.allPowerOn();
	}

}
