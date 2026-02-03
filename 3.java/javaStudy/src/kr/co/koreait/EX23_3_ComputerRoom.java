package kr.co.koreait;

public class EX23_3_ComputerRoom {
	Ex23_3_Samsong computer1;
	Ex23_3_Samsong computer2;
	Ex23_3_Samsong computer3;
	
	Ex23_3_LZ computer4;
	Ex23_3_LZ computer5;
	Ex23_3_LZ computer6;
	
	public void allPowerOn() {
		computer1.powerOn();
		computer2.powerOn();
		computer3.powerOn();
		computer4.powerOn();
		computer5.powerOn();
		computer6.powerOn();
	}
	
	public void selectPowerOn(Ex23_3_Computer computer) {
		computer.powerOn();
	}
	
//	public void selectPowerOn(Ex23_3_LZ lz) {
//		lz.powerOn();
//	}

}
