package week1.day2;

import java.util.Arrays;

public class PrintDuplicateValuesInArray {

	public static void main(String[] args) {

		int[] num= {12,56,78,90,23,12,68,78,45,89,90};
		//12,78,90
		//for loop-nested for loop
		//single for loop
		
		//nested for loop
		
		//outter loop
		//[0]=12
		for (int i = 0; i < num.length; i++) {
			
			//inner loop
			//[0+1]=[1]=>56
			for (int j = i+1; j < num.length; j++) {
				
				if(num[i]==num[j]) {
					System.out.println("This is duplicate value in the array :"+num[j]);
				}
			}
		}
		
		
		System.out.println("--------------------------------");
		
		//sort array {12,56,78,90,23,12,68,78,45,89,90}
		//12,12,23,45,56,68,78,78,89,90,90
		//compare with next value
		//one for loop
		//0-9
		//0-10-1
		//0-9
		Arrays.sort(num);
		
		for (int i = 0; i < num.length-1; i++) {
			
			if(num[i]==num[i+1]) {
				System.out.println("Duplicate value :"+ num[i+1]);
			}
			
		}
		
	}

}
