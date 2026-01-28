package kr.co.koreait;

import java.util.Scanner;

public class Ex06_while {

	public static void main(String[] args) {
		// while문
		// - 조건식으로 구성됨
		// - 조건식 하나만 들어감(조건식 거짓이 나오면 종료)
		// - 언젠가 조건식이 거짓(false)이 나오게 해야함 (안그러면 영원히 반복되는 '무한루프'가 생성)
		int cnt = 0;
		
		while(cnt < 5) {
			System.out.println("현재 cnt 값 : " + cnt);
			cnt++; // -> 꼭 써줘야함
		}
		
		// while문으로 합계 구하기
		int sum = 0; // 합계를 저장할 변수
		int count = 1; // while문 조건식에 줄 변수
		
		// 1부터 10까지의 합계
		while(count <= 10) {
			sum = sum + count;
			count++;
		}
		System.out.println(sum);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0을 입력하면 종료됩니다 : ");
		int inputExit = sc.nextInt();
		
		while(inputExit != 0) {
			System.out.print("0을 입력하세요 :");
			inputExit = sc.nextInt();
		}
		
		// do-while문
		// - 조건식과 상관없이 최초 1번은 무조건 실행
		// - 참, 거짓을 판단하기 전에 무조건 1번 이상 실행해야 할 코드가 있을 경우 사용
		// while : 조건 검사 후 -> 코드실행
		// do-while : 코드실행(do)후 -> 조건 검사
		int num; // - 변수 선언
		
		do { System.out.print("0 입력 : ");
			 num = sc.nextInt(); // - 변수 선언한 값을 초기화함
		} while(num != 0); // 마지막 조건이 일치하지 않으면 다시 do로 가서 실행됨
		
	}

}















