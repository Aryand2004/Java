/*
Write a program that implements a simple calculator for basic arithmetic operations 
(addition, subtraction, multiplication, division).
*/
import java.util.*;
public class MiniCalculator
{
  public static double Addition (double a, double b)
  {
	double sum = a + b;
	  return sum;
  }
  public static double Subtraction (double a, double b)
  {
	double difference = a - b;
	return difference;
  }
  public static double Multiplication (double a, double b)
  {
	double product = a * b;
	return product;
  }
  public static double Division (double a, double b)
  {
	double quotient = a / b;
	if (b == 0.0)
	  {
		throw new RuntimeException ("Error - Division by 0");
	  }
	return quotient;

  }
  public static void main (String args[])
  {
	Scanner sc = new Scanner (System.in);
	boolean proceed = true;
	String s = "";
	double a, b = 0;
	int c = 0;
	while (proceed == true)
	  {
		System.out.println ("Enter two variables : ");
		a = sc.nextDouble ();
		b = sc.nextDouble ();
		System.out.println
		  ("Perform Operation: Addition - 1, Subtraction - 2, Multiplication - 3, Division - 4");
		c = sc.nextInt ();
		if (!(c == 1 || c == 2 || c == 3 || c == 4))
		  {
			throw new RuntimeException ("Invalid Input ");
		  }
		else if (c == 1)
		  {
			double add = Addition (a, b);
			System.out.println ("Sum : " + add);
		  }
		else if (c == 2)
		  {
			double diff = Subtraction (a, b);
			System.out.println ("Difference : " + diff);
		  }
		else if (c == 3)
		  {
			double prod = Multiplication (a, b);
			System.out.println ("Product : " + prod);
		  }
		else if (c == 4)
		  {
			double quot = Division (a, b);
			System.out.println ("Quotient : " + quot);
		  }
		System.out.println ("Continue Operations ? ");
		sc.nextLine(); 
        s = sc.nextLine().trim().toLowerCase(); 
		if (s.equals ("yes"))
		  {
			continue;
		  }
		else if (s.equals ("no"))
		  {
			proceed = false;
		  }
		else
		  {
			throw new RuntimeException ("Invalid Input");
		  }
	  }
	sc.close ();
  }
}
