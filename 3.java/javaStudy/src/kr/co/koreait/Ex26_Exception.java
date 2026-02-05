package kr.co.koreait;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

// 되도록 안 쓰는게 좋음 어떤 예외가 발생하는지 나중에 가서 모름
public class Ex26_Exception {

	public static void main(String[] args) {
		// 예외는 무조건 try 안에서만
		try {
			int[] numbers = {1, 2, 3};
			System.out.println("예외 발생 전");
			numbers[5] = 10; // 3번 인덱스 밖에 없는데 5번 인덱스에 10을 넣는다라고 하면 OutOfBoundsException 발생 ㅋ
			System.out.println("예외 발생 후");
			// 예외발생 안 하면 실행 안됨
		} catch(Exception e) { // ArrayIndexOutOfBoundsException
			System.out.println("예외 발생!! : " + e);
		} finally {
			// 예외 발생 유무와 상관없이 실행할 코드
			System.out.println("Finally!");
		}

		System.out.println("끝");
		
		//-------------------------------------
////		Scanner sc = null;
//		try (Scanner sc = new Scanner(System.in)) { // try-with-resources try 에서만 실행가능
////			sc = new Scanner(System.in);
//			System.out.print("첫번째 숫자 : ");
//			int num1 = sc.nextInt();
//			
//			System.out.print("두번째 숫자 : ");
//			int num2 = sc.nextInt();
//			
//			int result = num1/num2;
//			System.out.println("나눗셈 결과 : " + result);
//		} catch(Exception e) {
//			System.out.println("0으로 나눌 수 없습니다.");
//			System.out.println("발생한 예외 : " + e);
//
//			e.printStackTrace(); // 잘 안씀(보존, 보안 안됨 ) 예외 발생 시 호출 스택에 있었던 메서드의 정보와 예외 메시지 출력
//			System.out.println(e.getStackTrace()[0]); // 어디서 발생했는지 알려줌
//			System.out.println(e.getMessage()); // 예외 설명 만 나옴
//		} finally {
////			sc.close();
//			System.out.print("프로그램 종료!");
//		}
		// ------------------------------------------------------------------------------------------
		
		try {
			// throw는 의도적으로 예외 발생
			throw new ArrayIndexOutOfBoundsException();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 발생");
		}
		
		//---------------------------------------------------------------------------------------------
		try {
			readFile();
		} catch(IOException e) {
			System.out.println("파일을 찾을 수 없음");
		}
		
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("나이 : ");
			int age = sc.nextInt();
			
			checkAge(age);
		}catch(Ex26_2_CustomException e) {
			System.out.println("예외 발생 : " + e);
		}	
	}
	
	public static void checkAge(int age) {
		if(age < 0) {
			throw new Ex26_2_CustomException("나이는 음수가 될 수 없습니다!");
		} else if(age < 18) {
			throw new Ex26_2_CustomException("미성년자는 접근할 수 없습니다!");
		} else {
			System.out.println("정상적으로 접근되었습니다.");
	 }
 }
	
	public static void readFile() throws IOException{
		// Checked Excepetion (예외처리 필수)
		FileReader fr = new FileReader("test.txt"); //무조건 예외처리 해야함

	}

}
