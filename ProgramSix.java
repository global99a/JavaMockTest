

public class ProgramSix {

	public static void main(String[] args) {

		for(int i=1;i<=100;i++)
		{
			//multiplies of 3 and 5
			if(i%3==0 && i%5==0)
			{
				System.out.println(" The number " + i+ "is multiply of 3 and 5 -FizzBuzz");
			}
			//multiplies of 3 
			else if(i%3 ==0)
			{
				System.out.println(" The number " + i+ "is multiply of 3 -Fizz");
			}
			//multiplies of 5
			else if(i%5==0)
			{
				System.out.println(" The number " + i+ "is multiply of 5 -Buzz");
			}
			
		
			else {
				System.out.println(i);
			}
			
		}

	}

}
