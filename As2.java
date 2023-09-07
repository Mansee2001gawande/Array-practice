//3 wap to define an array of integer and assign value in program and print sum of all values
import java.util.Scanner;
public class As2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("enter the length");
        int length=sc.nextInt();

        int a[]=new int[length];

        System.out.print("enter array elements");
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
            System.out.print(sum);
     }
    
}
