//Q13. Write a program to array elements to print sum of Cubic Values
public class As13 {
    public static void main(String[] args) {
    java.util.Scanner sc= new java.util.Scanner(System.in);
    System.out.println("enter array length");
    int length=sc.nextInt();
    int a[]=new int[length];
    
    System.out.println("enter array elements");
    for(int i=0;i<a.length;i++){
    a[i]=sc.nextInt();
    }
    for(int i=0;i<a.length;i++){
    int sum=0;
    sum=sum+(a[i]*a[i]*a[i]);
    
    System.out.println(sum);
    }
}
}
