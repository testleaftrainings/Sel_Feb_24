package week3.day2;

public class FindNoCharsPresents {

	public static void main(String[] args) {

		String name="Testleaf";
		
		//count as variable
		int count=0;
		for (int i = 0; i < name.length(); i++) {
			if(name.charAt(i)=='e') {
				count++;
			//	count=count+1;
				//count=0+1=1=>count=1
				//count=1+1=> count =2
			}
			
		}
		System.out.println("number of 'e' is present : "+count);
	}

}
