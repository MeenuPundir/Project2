package Exception;

//import java.util.Scanner;

public class Demo2 {
	public static void main (String[] args) {
		String s=null;
		//System.out.println("Enter any string:");
	//Scanner sc = new Scanner(System.in);
	//String s= sc.next();
	try {
		System.out.println(s.length());
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally {
		System.out.println("Compilation continue");
	}
	}

}
