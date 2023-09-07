//Q.16 Write a Java program to calculate the average value of array elements.
public class As16 {
    public static void main(String[] args) {
        java.util.Scanner sc= new java.util.Scanner(System.in);
        System.out.println("enter array length");
        int length=sc.nextInt();
        int a[]=new int[length];
        
        System.out.println("enter array elements");
        for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
        }
        
        int ave,sum=0;
        
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
            ave= sum/length;
        System.out.println("average is "+ave);
        }


    }

