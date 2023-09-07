//4 wap to print max and minimum value in given array
import java.util.Scanner;
public class As3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length");
        int length=sc.nextInt();

        int a[]=new int[length];

        System.out.print("enter array elements");
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int max=a[0];
        int min =a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            else if (a[i]<min){
                min = a[i];
            }
        }
        System.out.println("min "+min);
        System.out.println("max "+max);
    }
}
