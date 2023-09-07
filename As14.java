//Q.14Write a program in to array size to be user input print it
public class As14 {
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
            System.out.println(a[i]);
        }
    }    
}
