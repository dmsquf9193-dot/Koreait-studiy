package kr.co.koreait;

public class Ex15_Recursion {

	public static void main(String[] args) {
		Ex15_Recursion r = new Ex15_Recursion();
		int result = r.sum(5);
		System.out.println(result);

	}
	
	public int sum(int n) {
		if(n==1) {
			return 1;
		}
		
		return n + sum(n-1);
	}
	
	public void test(int n) {
		if (n==0) {
			return;
		}
		
		System.out.println(n + " "); // 위,아래 위치에 따라서 출력값이 달라짐  
		test(n-1);
	}
	

}
