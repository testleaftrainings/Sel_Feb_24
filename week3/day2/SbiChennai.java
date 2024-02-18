package week3.day2;

public class SbiChennai implements Rbi {


	public void kyc() {
		System.out.println("pan card");
		
	}

	public void personalLoan() {
		System.out.println("ROI 12%");
		
	}
	public static void main(String[] args) {
		SbiChennai sbi=new SbiChennai();
		sbi.kyc();
		sbi.personalLoan();
		
	}
	

}
