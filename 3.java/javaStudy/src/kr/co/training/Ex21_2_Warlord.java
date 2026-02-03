package kr.co.training;

public class Ex21_2_Warlord extends Ex21_2_Character{
	// character 클래스를 상속받습니다.
	
	// 객체 생성 시 힘50, 민첩10, 지력10, 레벨1로 생성
	// - 부모 생성자를 호출하세요
	//Ex21_2_Warlord(int str, int dex, int knowledge, int level) {	}
	Ex21_2_Warlord() {
		super(50,10,10,1);
		
	}
	
	// attack 메서드 생성
	// - "둔기를 휘두릅니다." 출력
	public void attack() {
		System.out.println("둔기를 휘두릅니다.");
	}
	
	// levelUp() 메서드 생성
	// - "레벨업을 하여 힘이 5 증가합니다." 출력
	// - "현재 레벨 : OO, 힘 : OO" 출력
	// - 현재 레벨을 1 증가시키고, 힘을 5 증가시킵니다.
//	public void levelUp() {
//		int curruntStr = super.getStr();
//		int curruntLevel = super.getLevel();
		
//		super.setLevel(currentLevel + 1);
//		super.setSer(currentStr + 5);
		
//		System.out.printnl("레벨업을 하여 힘이 5 증가합니다.")
//		System.out.printnl("레벨업을 하여 힘이" + super.getLevel() + ", 힘 : " + super.getStr());
//	}
	
	

}
