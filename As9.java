// 9.Initialize and print all elements of a 2D array.
public class As9 {
public static void main(String[] args) {
    int a[][]=new int [2][2];
    System.out.println("enter 1 st row elements");
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
            a[i][j]=i+j;
        }
    }
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
        System.out.print(" "+a[i][j]);

        }
        System.out.println();
    }
}
}
