//Q.1 Write a program to make a Jagged Array . 
public class Assig21 {
    public static void main(String[] args) {
        int a[][]=new int [5][];
        for(int i=0;i<a.length;i++){
            a[i]=new int [i+1];
        }
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=count++;
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
