//Basic Calculator Program
import java.util.*;
class BasicCalculator2
{
		public static void main(String args[])
		{
		       int a,b,c;
			   Scanner sc=new Scanner(System.in);
			   System.out.println("Please Enter Two Number:");
			   a=sc.nextInt();
			   b=sc.nextInt();
			   c=a+b;
			   System.out.println("Addition Of two Number:"+c);
			   c=a-b;
			   System.out.println("Substraction Of two Number:"+c);
			   c=a*b;
			   System.out.println("Multiplication Of two Number:"+c);
			   c=a/b;
			   System.out.println("Division Of two Number:"+c);	
		}
}