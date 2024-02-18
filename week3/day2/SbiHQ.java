package week3.day2;

public abstract class SbiHQ implements Rbi{

	//will have both implement and unimplements methods
	//abstract will have 0 to 100% abstract method
	
	@Override
	public void personalLoan() {
		System.out.println("roi 13%");
		
	}
	
	public void creditcard() {
		System.out.println("Life time free card");
	}
	
	//abstract method
	abstract void debitcard();
	
	public static void main(String[] args) {
		
		//for interface we cannot create a object
		//Rbi rbi=new Rbi();
		
		//for abstract class we cannot create a object
		//SbiHQ sbi=new SbiHQ();
	}

}
