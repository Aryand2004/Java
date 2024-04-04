import java.util.Scanner;
public class InterpolationSearch
{
  public static int InterpolationSearch (int a[], int value)	//Average runtime O(log(log N))
  {
	int high = (a.length - 1);
	int low = 0;
	while (value >= a[low] && value <= a[high] && low <= high)
	  {
		int probe = low + (high - low) * (value - a[low]) /
		  (a[high] - a[low]);
		if (a[probe] == value)
		  {
			return probe;
		  }
		else if (a[probe] < value)
		  {
			low = probe + 1;
		  }
		else
		  {
			high = probe - 1;
		  }
	  }
	return -1;

  }
  public static void main (String args[])
  {
	Scanner sc = new Scanner (System.in);
	int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };	//Works well for Uniformly Distributed Data
	try
	{
	  System.out.println ("Enter a value you want to find ? ");
	  int value = sc.nextInt ();
	  int index = InterpolationSearch (a, value);
	  if (index != -1)
		{
		  System.out.println ("Value found at index : " + index);
		}
	  else
		{
		  System.out.println ("Value not in the Array!");
		}
	}
	catch (Exception e)
	{
	  System.out.println ("Invalid Data Input!");
	}
	finally
	{
	  sc.close ();
	}

  }
}
