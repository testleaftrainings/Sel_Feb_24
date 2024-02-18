package week3.day2;

public class LearnStringMethods {

	public static void main(String[] args) {

		String name="TestLeaf";
		//tolowercase & touppercase
		
		String lc = name.toLowerCase();
		System.out.println("convert into Lowercase :"+lc);
		
		String uc = name.toUpperCase();
		System.out.println("convert into uppercase:"+uc);
		
		//split
		String data="TestLeaf Always Ahead";
		//output- TestLeafAlwaysAhead
		
		String[] split = data.split(" "); //T //stL //af Always Ah //ad
		//TestLeaf
		//Always
		//Ahead
		
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]);
			
		}
		
		System.out.println(" ");
		
       //replace
		String value="Selenium";
		
		String replace = value.replace('S', 's');
		System.out.println("Repalce single char :"+replace);
		
		//replaceAll
		String com="Amazon have 10000 Product on Live sales";
		
		String replaceAll = com.replaceAll("[a-z]", "@");
		System.out.println(replaceAll);
		
		//subString
		
		String data1="Abstraction";
		
		String substring = data1.substring(4);
		System.out.println("beingvalue substring : "+substring);
		
		//being n end index =2,9= (2,9-1)=>(2,8)
		String substring2 = data1.substring(2, 8);//(2,7)
		System.out.println("Starting index & ending index :"+substring2);
		
		
		//convert string value into int value
		String price="2590";
		int parseInt = Integer.parseInt(price);
		System.out.println(parseInt);
		
		
	}
	
	

}
