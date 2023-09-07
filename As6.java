//7 wap to search a particular number in given array and print its position
import java.util.Scanner;
public class As6 {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the length");
            int length=sc.nextInt();

            int a[]=new int[length];

            System.out.print("enter array elements");
            for (int i=0;i<a.length;i++){
                a[i]=sc.nextInt();
        }
        System.out.println("enter the no you want to serach");
        int search =sc.nextInt();


        boolean flag =true;
        for(int i=0;i<a.length;i++){
            if(a[i]==search){
                flag =true;
                break;
            }
        
        if(flag) {
        System.out.println(search +"no found at "+a[i+1]);
        }
        }
    }
}

