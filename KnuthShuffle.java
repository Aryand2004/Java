import java.util.Random;
public class KnuthShuffle
{
  public static void knuthShuffle (int a[])
  {
	Random rand = new Random ();
	for (int i = (a.length - 1); i > -1; i--)
	  {
		int pick = rand.nextInt (i + 1);
		int temp = a[i];
		  a[i] = a[pick];
		  a[pick] = temp;
	  }
  }
  public static void main (String args[])
  {
	int a[] = { 1, 2, 3, 4, 5 };
	System.out.println ("Inputted Array : ");
	for (int j = 0; j < a.length; j++)
	  {
		System.out.print (a[j] + " || ");
	  }
	knuthShuffle (a);
	System.out.println ();
	System.out.println ("Random Output : ");
	for (int i = 0; i < a.length; i++)
	  {
		System.out.print (a[i] + " || ");
	  }
  }
}
