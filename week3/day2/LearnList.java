package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {

		List<String> mentors=new ArrayList<String>();
		//add()
		mentors.add("Subraja");
		mentors.add("Aravind");
		mentors.add("Princila");
		mentors.add("Gokul");
		mentors.add("Vinoth");
		mentors.add("Mukesh");
		mentors.add("Vinoth");
		mentors.add("kathri");
		mentors.add("Muthu");
		mentors.add("Vineeth");
		
		System.out.println(mentors);
		
		//
		mentors.add(2, "Dilip");
		System.out.println(mentors);
		
		//remove
		mentors.remove(5);
		System.out.println("remove method used :"+mentors);
		
		//get
		String string = mentors.get(7);
		System.out.println(string);
		
		//size
		int size = mentors.size();
		System.out.println("Size of the List :"+size);
		
		for (int i = 0; i < mentors.size(); i++) {
			System.out.println(mentors.get(i));
		}
	
		//clear
		mentors.clear();
		System.out.println(mentors);
		
		
		//remove all
		//[Aravind,Gokul,Dilip,Vinoth]  mentors.removeAll(mentors2)
		//[Subraja,Aravind,Vineeth,Princila,Dilip]
	}

}
