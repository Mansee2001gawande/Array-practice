//6 wap to find and print prime numbers in given array
import java.util.Scanner;
public class As5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length");
        int length=sc.nextInt();

        int a[]=new int[length];

        System.out.print("enter array elements");
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        for(int i=0; i<a.length; i++){
            boolean flag =true;
            for(int j=2;j<a[i];j++){
            if(a[i]%j==0){
                flag = false;
                break;
            }
        }
        if(flag){
                System.out.println("no is prime"+a[i]);
        }
        }        
    }
}




