//Q.18 Write a Java program to add two matrices of the same size.
public class As18 {
    public static void main(String[] args) {
        java.util.Scanner sc= new java.util.Scanner(System.in);
        System.out.println("enter array length");
        int length=sc.nextInt();
        int a[][]=new int[length][length];
        
        System.out.println("enter array elements");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
            a[i][j]=sc.nextInt();
        }
    }
    int sum=0;
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length;j++){
            sum=sum+a[i][j];
        }
    }
    System.out.println(sum);

    }
}

