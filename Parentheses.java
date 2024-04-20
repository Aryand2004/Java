import java.util.*;
class Node
{
  char data;
  Node next;
  public Node (char data)
  {
	this.data = data;
	this.next = null;
  }

}
class Stack
{
  Node top;

  public Stack ()
  {
	this.top = null;
  }
  public void push (char data)
  {
	Node newNode = new Node (data);
	newNode.next = top;
	top = newNode;
  }
  public boolean isEmpty ()
  {
	return top == null;
  }
  public char pop ()
  {
	if (isEmpty () == true)
	  {
		System.out.println ("Stack Underflow");
		return '\0';
	  }
	else
	  {
		char data = top.data;
		top = top.next;
		return data;
	  }
  }
  public char peek ()
  {
	if (isEmpty ())
	  {
		System.out.println ("Stack is empty");
		throw new IllegalStateException ("Stack is empty");
	  }
	else
	  {
		return top.data;
	  }
  }
  public void printStack ()
  {
	if (isEmpty ())
	  {
		System.out.println ("Stack is Empty");
	  }
	Node current = top;
	System.out.println ("Stack elements");
	while (current != null)
	  {
		System.out.println (current.data + " | ");
		current = current.next;
	  }
  }
}

public class Parentheses
{
  public static boolean isBalanced (String abc)
  {
	Stack s = new Stack ();
	int count = 0;
	for (int i = 0; i < abc.length (); i++)
	  {
		char ch = abc.charAt (i);
		if (ch == '(')
		  {
			s.push (ch);
			count++;
		  }
		else if (ch == ')')
		  {
			if (s.isEmpty () || s.pop () != '(')
			  {
				return false;
			  }
			count--;
		  }
	  }
	return count == 0;
  }
  public static void main (String args[])
  {
	Scanner sc = new Scanner (System.in);
	System.out.println ("Enter a string containing only parenthesis:");
	try
	{
	  String a = sc.nextLine ();
	  boolean b = isBalanced (a);
	  if (b)
		{
		  System.out.println ("The parantheses are balanced");
		}
	  else
		{
		  System.out.println ("The parantheses are not balanced.");
		}
	}
	catch (InputMismatchException e)
	{
	  System.out.
		println
		("Invalid input. Please enter a string containing only parantheses.");
	}
	finally
	{
	  sc.close ();
	}

  }

}
