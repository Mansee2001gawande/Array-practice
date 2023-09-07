//Q.2 Write a program for Sorting an array. 
public class Assig22 {
    public static void main(String[] args) {
        java.util.Scanner sc =new java.util.Scanner(System.in);
    System.out.print("enter the length ");
    int length =sc.nextInt();
        int a[]=new int[length];

        System.out.println("enter array elements ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<length;j++){
                if(a[i]>a[j]){
                    a[i]=a[i]+a[j];
                    a[j]=a[i]-a[j];
                    a[i]=a[i]-a[j];
                }
            }
        }
            for(int i=0;i<a.length;i++){
               // for(int j=0;j<a[i].length;j++){
                    System.out.print(" "+a[i]);
                //}
            }
        }
    }

