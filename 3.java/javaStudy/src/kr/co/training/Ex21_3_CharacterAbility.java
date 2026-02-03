package kr.co.training;

public class Ex21_3_CharacterAbility {
	// 아래의 필드들을 가집니다.
	// - 힘(str), 민첩(dex), 지력(knowledge)
	//   레벨(level, 초기값 1)
	//   경험치(exp, 100이 될 경우 레벨이 1 증가하고 경험치는 0이 됨)
	//   체력(hp, 초기값 100, 레벨없을 해도 회복되지 않음)
	//   마력(mp, 초기값 100, 레벨없을 해도 회복되지 않음)
	// - 모든 필드의 접근 제어자는 private
	// - 각 필드에 대한 getter/setter 작성
	// - 현재 능력치를 모두 확인할 수 있는 toString 오버라이딩 작성
	//  > toString은 문자열을 반환 합니다.
	//  > public String toString() { return "문자열" }
	
	private int str;
	private int dex;
	private int knowledge;
	private int exp;
	private int level;
	private int hp;
	private int mp;
	
	public Ex21_3_CharacterAbility() {
		this.level = 1;
		this.exp = 0;
		this.hp = 100;
		this.mp = 100;
	}
	
	void setStr (int str) {
		this.str = str;
	}
	void setDex (int dex) {
		this.dex = dex;
	}
	void setKnowledge (int knowledge) {
		this.knowledge = knowledge;
	}
	void setExp (int exp) {
		if(exp == 100) {
			this.level = 1;
			this.exp = 0;
		} 
		this.exp = exp;
	}
	void setLevel (int level) {
		this.level = level;
	}
	void setHp (int hp) {
		this.hp = hp;
	}
	void setMp (int mp) {
		this.mp = mp;
	}
//---------------------------------------------------------	
	public int getStr() {
		return str;
	}
	public int getDex() {
		return dex;
	}
	public int getKnowledge() {
		return knowledge;
	}
	public int getExp() {
		return exp;
	}
	public int getLevel() {
		return level;
	}
	public int getHp() {
		return hp;
	}
	public int getMp() {
		return mp;
	}
	// - 현재 능력치를 모두 확인할 수 있는 toString 오버라이딩 작성
		//  > toString은 문자열을 반환 합니다.
		//  > public String toString() { return "문자열" }
	@Override
	public String toString() {
		return "힘 : " + str + "민첩 : " + dex + "지력 : " + knowledge + "레벨 : " + level + "경험치 : " + exp + "체력 : " + hp + "마력 : " + mp;
		//return String.format("힘 : %d, 민첩 : %d", str, dex);
	}
	
	
	

}
