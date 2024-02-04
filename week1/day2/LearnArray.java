package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {

		//array literal
		
		int[] age= {23,43,45,21,18,30,10,7};
		
		//what is length - ctrl+2-L
		int arrLength = age.length;
		System.out.println("Length of the array : "+arrLength);
	
	//i need get value as 23
		System.out.println("get value as 23 :"+age[0]);
	
	//print last data in index
		System.out.println("get last index value :"+age[arrLength-1]);
		
		//array is in sort order
		Arrays.sort(age);
		//7,10,18,21,23,30,43,45
		System.out.println("after sort the array index 0 :"+age[0]);
	
		//print all values from array
		
		for (int i = 0; i < arrLength; i++) {
			System.out.println(age[i]);
		}
	}

}
