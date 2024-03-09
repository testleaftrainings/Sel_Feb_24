package week6.day1;

import org.testng.annotations.Test;

public class LearnEnabled {
	
	@Test()
	public void editLead() {
		System.out.println("editLead");
	}
	
	@Test(priority =-1 ,enabled=false)
	public void createLead() {
		System.out.println("createLead");
	}
	
	@Test
	public void deleteLead() {
		System.out.println("deleteLead");
	}

}
