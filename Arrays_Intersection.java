import java.util.*;

public class Arrays_Intersection {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> Unique = new HashSet<>();
        HashSet<Integer> Intersection = new HashSet<>();
        try {
            System.out.println("Enter size of the first list: ");
            int sizeOfFirstList = sc.nextInt();
            int a[] = new int[sizeOfFirstList];
            for (int i = 0; i < sizeOfFirstList; i++) {
                System.out.println("Enter element " + (i + 1) + " of the first list: ");
                a[i] = sc.nextInt();
            }
            
            System.out.println("Enter size of the second list: ");
            int sizeOfSecondList = sc.nextInt();
            int b[] = new int[sizeOfSecondList];
            for (int j = 0; j < sizeOfSecondList; j++) {
                System.out.println("Enter element " + (j + 1) + " of the second list: ");
                b[j] = sc.nextInt();
            }
            
            for (int num : a) {
                Unique.add(num);
            }
            
            for (int num : b) {
                if (Unique.contains(num)) {
                    Intersection.add(num);
                    Unique.remove(num);
                }
            }
            
            if (Intersection.isEmpty()) {
                System.out.println("No common elements found.");
            } else {
                System.out.println("Intersection of the two lists: " + Intersection);
            }
        } catch (Exception e) {
            System.out.println("Error - Invalid Data Type");
        } finally {
            sc.close();
        }
    }
}
