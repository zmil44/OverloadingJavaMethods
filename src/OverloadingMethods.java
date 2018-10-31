/*
Zach Miller
Assignment 6.2
The purpose of this program is to ask the user to input 2 numbers either ints or doubles and then use method overloading to find the difference of the highest minus the lowest and have the correct return type
04 Oct 2017
Bellevue University
OverloadingMethods.java
*/
import java.util.*;
import java.math.*;

public class OverloadingMethods {

	public static void main(String[] args) 
	{
		double num1=getInput();
		double num2=getInput();
		boolean change1=false,change2=false;
		int int1=0,int2=0,differenceI;
		double differenceD;
		for(int i=1; i<=2; i++)
		{ 
			if(i==1)
			{
				boolean change = checkInt(num1);
				if(change==true)
				{
					int1 = changeInt(num1);
					change1=true;
				}
			}
			if(i==2)
			{
				boolean change = checkInt(num2);
				if(change==true)
				{
					int2 = changeInt(num2);
					change2=true;
				}
			}
		}
		if(change1==true&& change2==true)
		{
			differenceI=subtract(int1,int2);
			System.out.println("="+differenceI);

		}
		else if(change1==true)
		{
			differenceD=subtract(int1,num2);
			System.out.println("="+differenceD);
		}
		else if(change2==true)
		{
			differenceD=subtract(num1,int2);
			System.out.println("="+differenceD);

		}
		else
		{
			differenceD=subtract(num1,num2);
			System.out.println("="+differenceD);

		}
		
	}
	
	private static int subtract(int num1, int num2)
	{
		System.out.print(Math.max(num1,num2)+"-"+Math.min(num1,num2));
		int diff = (Math.max(num1,num2)-Math.min(num1,num2));
		return diff;
	}
	
	private static double subtract(double num, int numI)
	{
		System.out.print(Math.max(num,numI)+"-"+Math.min(num,numI));
		double diff = (Math.max(num, numI)-Math.min(num, numI));
		return diff;
	}
	
	private static double subtract(int numI, double num)
	{
		System.out.print(Math.max(num,numI)+"-"+Math.min(num,numI));
		double diff = (Math.max(num, numI)-Math.min(num, numI));
		return diff;
	}
	
	private static double subtract(double num1, double num2)
	{
		System.out.print(Math.max(num1,num2)+"-"+Math.min(num1,num2));
		double diff = (Math.max(num1, num2)-Math.min(num1, num2));
		return diff;
	}
	
	//determines if the number entered had a decimal point or not
	private static boolean checkInt(double num) 
	{
		boolean change=false;
		if(num%1==0)
			change=true;
		
		return change;
	}

	//changes the double to an int
	private static int changeInt(double num)
	{
		int number = (int)num;
		return number;
	}

	//gets input
	private static double getInput()
	{
		Scanner scan = new Scanner(System.in);
		boolean correct;
		double num = 0;
		do
		{
			try
			{
				System.out.print("Please enter a number: ");
				num = scan.nextDouble();
				correct=true;
			}catch(InputMismatchException ex)
			{
				System.out.println("\n You did not enter a number. Please try again.");
				scan.next();
				correct=false;
			}
		}while(correct=false);
		
		return num;
	}

}
