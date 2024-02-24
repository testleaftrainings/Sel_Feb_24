package week4.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSET {

	public static void main(String[] args) {

		int[] number= {2,4,6,4,7,9,11,2,5,8,33};
		
		Set<Integer> unq=new LinkedHashSet<Integer>();
		
		for (Integer i: number) {
			unq.add(i);	
		}
		
		System.out.println(unq);
		
		//get index(5)
		
		//convert set into list
		List<Integer> data=new ArrayList<Integer>(unq);
		
		Integer i = data.get(5);
		System.out.println(i);
	}

}
