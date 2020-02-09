package calculator_epam;
import java.util.*;
public class Calci {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int a,b,c,select;
		System.out.println("Enter the two numbers");
		a = scan.nextInt();
		b = scan.nextInt();
		System.out.println("User please enter your choice");
		System.out.println("Please enter 1 for ADDITION");
		System.out.println("Please enter 2 for SUBTRACTION");
		System.out.println("Please enter 3 for MULTIPLICATION");
		System.out.println("Please enter 4 for DIVISION");
		//printing user's selection
		select = scan.nextInt();
		Manipulate obj = new Manipulate();
		while(select > 4)
		{
			System.out.println("INVALID CHOICE.Please Try Again");
			select = scan.nextInt();
		}
		if(select ==1)
		{
			c = obj.add(a,b);
			System.out.println(" The sum is " +c);
		}
		else if(select ==2)
		{
			c =obj.sub(a,b);
			System.out.println("The subtract is" +c);
		}
		else if(select ==3)
		{
			c =obj.multi(a,b);
			System.out.println("The multiplication is" +c);
		}
		else if(select ==4)
		{
			c =obj.div(a,b);
			System.out.println("The division is" +c);
		}
	}

}

