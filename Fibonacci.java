import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number=sc.nextInt();
		
		System.out.println("The fibonacci series of given number "+ number+ " is :");
		//Taking two numbers
		int n1=0,n2=1;
		int n3;
		System.out.print(n1 +" "+ n2 + " ");
		//taking a for loop and iterating from to number
		for(int i=1;i<=number;i++)
		{
		 n3=n1+n2;
		 System.out.print(n3+ " ");
		 //assiging n1 to n2 and n3 to n2 ,swapping
		 n1=n2;
		 n2=n3;
		}

	}

}
