package kr.co.koreait;

public class Ex25_Class2 {

	public static void main(String[] args) {
//      <정적 중첩 클래스 생성 방법>
//		Outerclass.InnerClass inner = new Outerclass.InnerClass();
//		inner.print();
		
//      <비정적 중첩 클래스 생성 방법>		
		// 1. 바깥 클래스 객체 생성 먼저
		OuterClass outer = new OuterClass();
		Ex25_1_Calculator cct = new Ex25_1_Calculator(1, 2);
		
		// 2. 안쪽(inner) 클래스 객체 생성
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.print();
		Ex25_1_Calculator.Calc calc = cct.new Calc();
		System.out.println(calc.add());
		
//      익명 내부 클래스(일회용 작업할 때 사용함)		
		Animal animal = new Animal() {
			// ↓클래스 구현
			@Override
			public void sound() {
				System.out.println("소리를 냅니다.");
			}
		};
		
//      람다식(화살표가 보이면 람다식, 스트링과 람다는 세트)
		Animal animal2 = () -> System.out.println("웍웍!");
		
	}
}

interface Animal {
	void sound();
}

class OuterClass {
	private static int staticNum = 10; // 클래스 변수
	private int instanceNum = 20; // 인스턴스 변수
	
//	static class InnerClass { 정적 중첩 클래스
    class InnerClass { // 비정적 중첩 클래스
		public void print() {
			System.out.println(instanceNum);
			System.out.println(staticNum);
		}
	}
}
