package week3.day1;

public class BMWC extends CarP {

	
	public void airbag() {
System.out.println("its coming from child class BMW");
	}
	
	public void brake() {
		System.out.println("ABS for BMW class");
	}
	
	public static void main(String[] args) {
		BMWC b=new BMWC();
		b.ac();
		b.accerator();
		b.airbag();
		b.brake();
		b.horn();
	}
	
}
