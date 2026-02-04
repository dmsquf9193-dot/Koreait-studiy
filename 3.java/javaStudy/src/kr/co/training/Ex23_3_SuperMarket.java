package kr.co.training;

public class Ex23_3_SuperMarket {
	
	private int milkCount;
	
	public void goSuperMarket(Ex23_2_AvocadoCondition avc) {
		 if (avc.hasAvocado()) {
	            milkCount = 6;
	        } else {
	            milkCount = 1;
	        }
	    }

	   
	    public int getMilkCount() {
	        return milkCount;
	    }
	
		
		
		
		
	

}
