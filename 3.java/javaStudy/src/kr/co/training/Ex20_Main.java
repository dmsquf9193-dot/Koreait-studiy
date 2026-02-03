package kr.co.training;

public class Ex20_Main {

	public static void main(String[] args) {
		// getter/setter를 사용하는 경우
		// - 객체 생성 후에도 자유롭게 데이터 변경 가능
		// - 필요한 필드만 setter로 값을 넣을 수 있음
		//   > 초기값 이후 값을 변경할 필요가 없다면 setter 안만들면 됨
		Ex20_1_Animal dog = new Ex20_1_Animal(); // 기본 생성자 호출
		dog.setName("강아지");
		dog.setage(5);
		dog.eat();
		
		// 생성자로만 필드를 초기화 하는 경우
		// - 데이터가 불변 (객체생성후 값이 변하지 않음)
		Ex20_1_Animal cat = new Ex20_1_Animal("나비", 3);
		cat.eat();
		
		
		Ex20_2_BookInfo bookInfo = new Ex20_2_BookInfo(); // 도서관 정보 객체
		bookInfo.setBookCount(100); // 초기에 100권이 있다.
		
		Ex20_2_Book book = new Ex20_2_Book(); // 도서관 객체
		//              도서관 정보, 빌릴 책의 수
		book.borrowBook(bookInfo, 3);
		
		book.returnBook(bookInfo, 5);
		
		book.showBookCount(bookInfo);
		
		// - 각각의 객체 생성 후 MenberInfo는 초기값 setter로 넣기
		Ex20_3_MemberInfo mi = new Ex20_3_MemberInfo();
		mi.setName("김체리");
		mi.setAge(18);
		mi.setAddr("무지개마을");
		mi.setIsStudent(false);
		
		
	
		
		
		
 
	}

}
