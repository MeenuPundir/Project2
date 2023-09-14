package Exception;

import java.util.Scanner;

public class Demo1 {
	
	public static void main(String[] args) {
		System.out.println("We are going to find out division");
		System.out.println("Enter first number");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		try
		{
		System.out.println("Div is = "+(num1/num2));
		}
		catch(Exception e){
			e.printStackTrace();	
		}
		finally{
			sc.close();
		}
			
		System.out.println("next program please_________");
	
		
	}

}
