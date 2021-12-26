package week1.day1;

public class Mobile {
	String mobileModel = "Iphone";
	int mobileWeight = 250;
	boolean isFullCharge = false; 
    double mobileCost = 45255.54;  
	
	public void makecall() {
		System.out.println("calling....");
	}

	public void sendMsg() {
		System.out.println("sending message");
	}
	
	public static void main(String[] args) {
		Mobile mobileUse = new Mobile();
		mobileUse.makecall();
	    mobileUse.sendMsg();
	    
	    System.out.println(mobileUse.mobileModel);
	    System.out.println(mobileUse.mobileWeight);
	    System.out.println(mobileUse.isFullCharge);
	    System.out.println(mobileUse.mobileCost);
	}
}
