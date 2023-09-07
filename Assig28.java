/*Q.8 Java Program to Increment All Element of an Array by One 
Examples: 
Input : arr1[] = {50, 25, 32, 12, 6, 10, 100, 150} 
Output: arr1[] = {51, 26, 33, 13, 7, 11, 101, 151} 
Input : arr2[] = {3, 6, 8, 12, 45} 
Output: arr2[] = {4, 7, 9, 13, 46} 
*/
import java.util.Scanner;
public class Assig28 {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array length");
        int length=sc.nextInt();
        int a[]=new int [length];

        System.out.println("enter array elements");
        for(int  i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            a[i]+=1;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(" "+a[i]);
        }
        }
    }

