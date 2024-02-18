package week3.day2;

public class SBI extends SbiHQ {

	@Override
	public void kyc() {
		System.out.println("Pan card");
		
	}

	@Override
	void debitcard() {
		System.out.println("roi 5% ");
		
	}
	public static void main(String[] args) {
		
		SBI sbi=new SBI();
		sbi.creditcard();
		sbi.debitcard();
		sbi.kyc();
		sbi.personalLoan();
	}

}
