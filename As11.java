/*Q.11 There are two arrays object one containing 100 elements
and another containing 50 elements. Both are of same data type.
Can we assign one Array to another Array
*/import java.util.Scanner;
public class As11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // int i,j;
        int a[]=new int [4];
        int b[]=new int [2];
        System.out.println("enter 100 elements");
        for(int i=0;i<4;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter B elements");
        for(int j=0;j<2;j++){
            a[j]=sc.nextInt();
    }
        for(int i=0;i<4;i++){
             System.out.print(a[i]);
        }
        for(int j=0;j<2;j++){
            System.out.print(a[j]);
        }
        System.out.println();
            b=a;
        for(int i=0;i<4;i++){
        System.out.println(" "+a[i]);
        }
        for(int j=0;j<2;j++){
        System.out.print (" "+a[j]);
        }
        System.out.println();

    }
}
    

