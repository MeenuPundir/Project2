package PatternQuestions;

import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
int i,j,k,n;

System.out.println("Enter the value of n : ");
Scanner sc = new Scanner(System.in);
n=sc.nextInt();

//Type 1	
		for(i =1; i<=n; i++)
		{
			for(j=1; j<=n; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
		System.out.println("___________________________");
		
		
	

//Type 2
		for (i=1;i<=n;i++)
		{
			for (j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("___________________________");

	
		
		
		

//Type 3
				for (i=1;i<=n;i++)
				{
					for (j=n; j>=i; j--)
					{
						System.out.print("*");
					}
					System.out.println();
				}
				System.out.println("___________________________");	


		
	
//Type 4
				for (i=1;i<=n;i++)
				{
					for (j=1; j<=n-i; j++)
					{
						System.out.print(" ");
					}
					for(k=1;k<=i;k++) {
						System.out.print(" *");
					}
					
					System.out.println();
				
				}		
				System.out.println("___________________________");
				
				
//Type 5
				for (i=n;i>=1;i--)
				{
					for (j=1; j<=n-i; j++)
					{
						System.out.print(" ");
					}
					for(k=1;k<=i;k++) {
						System.out.print(" *");
					}
					
					System.out.println();
				
				}		
				System.out.println("___________________________");
							
				
				
						
		
//Type 6
	
					for (i=n ;i>=1;i--)
					{
						for (j=1; j<=i; j++)
						{
							System.out.print(" *");
						}
							
						System.out.println();
					}
					System.out.println("___________________________");

		

	}
}
