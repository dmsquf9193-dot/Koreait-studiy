package kr.co.training;

import java.util.Scanner;

public class Ex24_2_Main {

	public static void main(String[] args) {

		//		24_2_Main 클래스를 생성하세요. (메일 메서드 포함)
		
//		사용자로부터 아이디와 비밀번호를 입력받으세요.
		
//		아래 클래스들을 모두 구현 후 login 메서드를 호출하세요.
//	    	  > 사용자가 입력한 아이디와 비밀번호를 인자값으로 전달해주어야 합니다.
//	    	  > 반환받은 값을 result 변수에 저장 후 출력합니다.
	
		Ex24_2_Login log = new Ex24_2_Login();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디 : ");
		String Id = sc.nextLine();

		System.out.println("비밀번호 : ");
		String Pwd = sc.nextLine();
		
		log.login(Id, Pwd);
		
		String result = log.login(Id, Pwd);
		System.out.println(result);
		
		
		
		
		
		
	
                     
		

	}

	private static String LoginInterface() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
