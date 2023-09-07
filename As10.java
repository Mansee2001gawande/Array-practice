/*10.Take 20 integer inputs from user and print the following:
 number of positive numbers
 number of negative numbers
 number of odd numbers.
  number of even numbers
  number of 0s.
*/import java.util.Scanner;
public class As10 {
    public static void main(String[] args) {
        int s=4,t=4;
        int a[][]=new int [s][t];
        Scanner sc=new Scanner (System.in);
        int pos=0,neg=0,even=0,odd=0;
        System.out.println("enter array elements");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
             a[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
            if(a[i][j]>0){
                pos++;
            }
            if(a[i][j]<0){
                neg++;
            }
            if(a[i][j]%2==0){
                even++;
            }
            if(a[i][j]%2==1){
                odd++;
            }
        }
    }
    System.out.println("positive "+pos);
        System.out.println("negative "+neg);
            System.out.println("even "+even);
            System.out.println("odd "+odd);




}
    
}
