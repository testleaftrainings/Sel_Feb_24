package week1.day2;

public class LearnMethodAndObject {

	//Access modifier returnType methodName (input args)
	
	public void add() {
		System.out.println(5+6);
	}
	public void name(String name) {
		System.out.println("What is Your Name :"+name);
	}
	
	public int add(int a,int b) {
		return a+b;	
	}
	private void debitCard(int pinNO) {
System.out.println("Debit Card PinNo: "+ pinNO);
	}
	
	String student(String sub,int rollNO) {
		return sub +" "+ rollNO;	
	}
	
	public static void main(String[] args) {
		//step 1-create object for the class
		LearnMethodAndObject mo=new LearnMethodAndObject();
		
		//step2 - to access all methods inside this class
		//objectName.methodName();
		mo.add();
		//m-1 for return 
		System.out.println(mo.add(10, 10));
		mo.debitCard(4567);
		mo.name("Selenium");
		//m2- for return 
		//this value in local variable-after ';' ctrl+2 -L
		String student = mo.student("Selenium", 123);
		System.out.println(student);
		
		String student2 = mo.student("Dilip", 2024);
		System.out.println(student2);
		
	}
}
