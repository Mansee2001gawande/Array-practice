//5 wap to find and print even numbers in given array
import java.util.Scanner;
public class As4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length");
        int length=sc.nextInt();

        int a[]=new int[length];

        System.out.print("enter array elements");
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            if(a[i]%2 ==0)
            System.out.print(" "+a[i]);
        }
    }
}
