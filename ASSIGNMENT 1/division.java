import java.io.*;
import java.util.*;  
class Division
{
	private static int divide(int numerator, int denominator)
	{
		int sign;
		if ((numerator<0)^(denominator<0)==true)
			sign=-1;
		else
			sign=1;
		numerator = Math.abs(numerator);
		denominator = Math.abs(denominator);
		int quotient = 0;
		while (numerator>=denominator){
			numerator-=denominator;
			++quotient;
		}
		return sign * quotient;
	}
	public static void main (String[] args)
	{
		Scanner sc= new Scanner(System.in);     
		System.out.print("Enter numerator : ");  
		int a= sc.nextInt();  
		System.out.print("Enter denominator : ");  
		int b= sc.nextInt();  
		System.out.println(divide(a, b));
	}
}

