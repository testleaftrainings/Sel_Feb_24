package week8.day1;

import java.io.FileNotFoundException;

import org.openqa.selenium.StaleElementReferenceException;

public class LearnTryCatchBlocks {

	public static void main(String[] args) {
		int  x = 10;
		try {
			System.out.println(x/0);
			System.out.println("I'm inside the try block");
		} catch (ArithmeticException e) {
			System.out.println(x/1);
		}
		
		int[] num = {1,2,3,4,5};
		
		
			try {
				System.out.println(num[1]);
				try {
					System.out.println(num[5]);
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("ArrayIndexOutOfBoundsException occurs so print the last index "+num[num.length-1]);
					throw new RuntimeException();
				}
			} catch (ArithmeticException e) {
				System.out.println(num[0]+num[1]);
			}catch(StaleElementReferenceException d) {
				System.out.println("Last index value is "+ num[num.length-1]);
			}catch (RuntimeException e) {
				System.out.println("RunTimeException occurs in line number 27");
			}catch(Exception e) {
				System.out.println(e);
			}finally {
				System.out.println("This is finally block");
			}
		
		
	}

}
