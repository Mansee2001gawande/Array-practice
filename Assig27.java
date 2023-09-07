//Q.7 Wap to Insert an element at a specific position in an Array in Java
import java.util.Scanner;
public class Assig27 {
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array length");
        int length=sc.nextInt();
        int a[]=new int [length];
         
        System.out.println("enter array A elements");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the element you want to insert");
        int insert=sc.nextInt();
        System.out.println("enter inserting position");
        int pos=sc.nextInt();

        for(int i=length;i>pos-1;i--){
            a[i+1]=a[i];
        }
        System.out.println("after downshifting....");
        a[pos-1]=insert;
        length=length+1;
        for(int i=0;i<a.length;i++)
        System.out.print(" "+a[i]);
        System.out.println("------------------");
        
    }
}