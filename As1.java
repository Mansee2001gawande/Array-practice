//1 wap to define an array of integer of size 6 .Take input from user and display it in reverse order 
import java.util.Scanner;
public class As1{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a[] = new int [6];
        System.out.print("enter array elements");
        for(int i=0;i<6;i++){
            a[i]=sc.nextInt();
        }
        for(int i=6-1 ;i>=0;i--){
            System.out.print(a[i]);
        }
        
    }
}