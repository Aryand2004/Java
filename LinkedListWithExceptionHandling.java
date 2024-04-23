import java.util.*;
class InvalidInputException extends RuntimeException
{
  public InvalidInputException (String message)
  {
	super (message);
  }
}
class Node
{
  int data;
  Node next;
  public Node (int data)
  {
	this.data = data;
	this.next = null;
  }
}
class LinkedList
{
  Node head;
  public LinkedList ()
  {
	this.head = null;
  }
  public void InsertElement (int data)
  {
	if (this.head == null)
	  {
		head = new Node (data);
	  }
	else
	  {
		Node newNode = new Node (data);
		Node temp = head;
		while (temp.next != null)
		  {
			temp = temp.next;
		  }
		temp.next = newNode;
	  }
  }
  public void printList ()
  {
	if (this.head == null)
	  {
		System.out.println ("Linked List is empty !");
	  }
	else
	  {
		System.out.println ("Linked List : ");
		Node Temporary = new Node (head.data);
		Temporary = head;
		while (Temporary != null)
		  {
			System.out.print (Temporary.data + " --> ");
			Temporary = Temporary.next;
		  }
		System.out.print ("null");
	  }
  }
}

public class LinkedListWithExceptionHandling
{
  public static void main (String args[])
  {
	Scanner sc = new Scanner (System.in);
	int n, value = 0;
	LinkedList L = new LinkedList ();
	boolean insert = true;
	while (insert)
	  {
		try
		{
		  System.out.println ("Add elements to the Linked List ? (1/0) ");
		  n = sc.nextInt ();
		  if (n == 1)
			{
			  System.out.
				println
				("Enter the Integer Value to be Inserted into the Linkedlist : ");
			  value = sc.nextInt ();
			  L.InsertElement (value);
			}
		  else if (n == 0)
			{
			  insert = false;
			}
		  else
			{
			  throw new
				InvalidInputException
				("Invalid Input! - Only 0 or 1 Accepted Values");
			}
		}
		catch (InvalidInputException e)
		{
		  System.out.println (e.getMessage ());
		  sc.nextLine ();
		}
	  }
	L.printList ();
	sc.close ();
  }
}
