//Q.5 Write a Java program to test two arrays' equality. 
public class Assign25 {
  public static void main(String[] args) {
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("enter array length");
    int length=sc.nextInt();
    boolean flag =false;

    int a[]=new int[length];
    int b[]=new int [length];

    System.out.println("enter a element");
    for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
    }
    System.out.println("enter B elements");
    for(int i=0;i<a.length;i++){
        b[i]=sc.nextInt();
    }
    for(int i=0;i<a.length;i++){
    if(a[i]==b[i]) {
        flag = true ;
        break;
    }
}
     if(flag){
        System.out.println("both elements are equal");
    } else {
        System.out.println("elements are not equal");
    }
  }  
}

