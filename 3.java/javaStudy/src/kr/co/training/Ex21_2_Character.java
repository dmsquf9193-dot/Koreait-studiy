package kr.co.training;

public class Ex21_2_Character {
	// 힘(str), 민첩(dex), 지력(knowledge), 레벨(level) 필드를 가집니다.
	// - 모두 정수형
	// - 접근제어자 : private
	private int str;
	private int dex;
	private int knowledge;
	private int level;
	
	// walk 메서드를 가집니다.
	// - "캐릭터가 한걸음 움직입니다." 출력
	// stop 메서드를 가집니다.
	// - "캐릭터가 멈춥니다." 출력
	
	public Ex21_2_Character(int str, int dex, int knowledge, int level) {
		this.str =str;
		this.dex =dex;
		this.knowledge =knowledge;
		this.level =level;
		
	}
	public void walk() {
		System.out.println("캐릭터가 한걸음 움직입니다.");
	}
	public void stop() {
		System.out.println("캐릭터가 멈춥니다.");
	}
	
	
	// 힘과 레벨 필드에 대한 getter/setter 
	private void setStr (int str) {
		this.str = str;
	}
	private void setDex (int dex) {
		this.dex = dex;
	}
	private void setKnowledge (int knowledge) {
		this.knowledge = knowledge;
	}
	private void setLevel (int level) {
		this.level = level;
	}
	
	private int getStr() {
		return str;
	}
	private int getDex() {
		return dex;
	}
	private int getKnowledge() {
		return knowledge;
	}
	private int getLevel() {
		return level;
	}
	

}
