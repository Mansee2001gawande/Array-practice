//Q.4 Write a Java program to swap first and last element of an integer 1-d array. 
import java.util.Scanner;
public class Assig24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int temp;

        System.out.println("enter array length");
        int length=sc.nextInt();
        int a[]= new int [length];

        System.out.println("enter array elements");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            temp = a[0];
            a[0] = a[a.length - 1];
            a[a.length-1] = temp;
        
        
        //System.out.println("after swapping 1 st & last no");
       // for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
}
    

