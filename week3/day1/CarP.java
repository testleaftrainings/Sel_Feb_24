package week3.day1;

public class CarP extends VehicleGP{

	public void accerator() {
		
		System.out.println("Its coming from  Parent class accerator");

	}
	
	protected void ac() {
		System.out.println("Its coming from  Parent AC");
	}
	
	public static void main(String[] args) {
		
		CarP c=new CarP();
		c.ac();
		c.brake();
		c.horn();
		c.accerator();
	}

}
