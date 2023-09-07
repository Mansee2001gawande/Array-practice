
/*Q.11 There are two arrays object one containing 100 elements
and another containing 50 elements. Both are of same data type
.Can we assign one Array to another Array
*/ //we cannot assign one array to anather array.
import java.util.Scanner;
public class As11ver {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int i, j;
      System.out.print("Enter size of 1st Arr: ");
      int r = sc.nextInt();
      System.out.print("Enter size of 2nd Arr: ");
      int c = sc.nextInt();

      int[] a = new int[r];
      int[] b = new int[c];
      // a=b;
      System.out.println("enter A element");
      for (i = 0; i < a.length; i++) {
         System.out.println("Enter " + (i + 1) + " Element: ");
         a[i] = sc.nextInt();
      }

      System.out.println("enter B  element");
      for (j = 0; j < b.length; j++) {
         System.out.println("Enter " + (j + 1) + " Element: ");
         b[j] = sc.nextInt();
      }
      System.out.println("Interchange the Arr Element:------------");
      if (b.length > a.length) {
         for (int k = 0; k < b.length; k++) {
            b[k] = a[k];
            System.out.print(" " + b[k]);
         }
      } else if (b.length < a.length) {
         for (int k = 0; k < b.length; k++) {
            a[k] = b[k];
            System.out.print(" " + a[k]);
         }
      }
   }
}
