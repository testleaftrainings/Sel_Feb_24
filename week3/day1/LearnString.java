package week3.day1;

public class LearnString {

	public static void main(String[] args) {

		String companyName="TestLeaf";
		String com1="TestLeaf";
		
		String com=new String("Testleaf");
		
		//m1-length
		int length = companyName.length();
		System.out.println("Total Number of Char :"+length);
		
		//m2-equals
		// what is different b/t .equals() & ==
		
		if(companyName.equals(com1)) {
			System.out.println("content is same-equals");
		}else {
			System.out.println("content is not same-equals");
		}
		
		//== will check memory value
		if(companyName==(com1)) {
			System.out.println("content is same-==");
		}else {
			System.out.println("content is not same-==");
		}
		
		//m3- equalignorecase

		if(companyName.equalsIgnoreCase(com)) {
			System.out.println("content is same");
		}else {
			System.out.println("content is not same");
		}
		
		//m4-contains
		String name= "Dilip";
		
		boolean contains = name.contains("l");
		System.out.println(contains);
		
		//m5-tocharArray
		String data="Selenium";
		
		char[] ch = data.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		
		System.out.println(" ");
		String value="Test Leaf";
		
		char[] charArray = value.toCharArray();
		for (int i = charArray.length -1; i >=0 ; i--) {
			System.out.print(charArray[i]);
		}
		
		System.out.println("");
		
		//m6-charAt-index value start from '0'
		String data1="Java";
		
		char charAt = data1.charAt(3);
		System.out.println(charAt);
		
		
	}
	

}
