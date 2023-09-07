//Q.3 Write a program for Swapping Two Arrays . 
import java.util.Scanner;
public class Assig23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array length");
        int length=sc.nextInt();
        int a[]=new int [length];

        int b[]=new int [length];
        int c[]=new int [length];
         
        System.out.println("enter array A elements");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter array B elements");
        for(int i=0;i<a.length;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
            a[i]=b[i];
            b[i]=c[i];
        }
        System.out.println("after swapping arrays");
        System.out.println("A elements");

        for(int i=0;i<a.length;i++){
            System.out.println(" "+a[i]);
        }
        System.out.println("B elements");

        for(int i=0;i<a.length;i++){
        System.out.print(" "+b[i]);
        }


    }
}
