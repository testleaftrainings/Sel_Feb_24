package week1.day2;

public class CallMethodsFromAnotherClass {

	public static void main(String[] args) {

		LearnMethodAndObject ob=new LearnMethodAndObject();
		
		ob.add();
		System.out.println(ob.add(20, 16));
		ob.name("Methods");
		System.out.println(ob.student("Methods&Object", 2));
	}

}
