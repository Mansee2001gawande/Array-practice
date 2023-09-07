/*Q.15 Write a Java program to print the following grid.
- - - - - - - - - - 
- - - - - - - - - - 
- - - - - - - - - - 
- - - - - - - - - - 
- - - - - - - - - - 
- - - - - - - - - - 
- - - - - - - - - - 
- - - - - - - - - - 
*/public class As15 {   
    public static void main(String[] args) {
        for(int i=1;i<=8;i++){
            for(int j=1;j<=10;j++){
                System.out.print("-");
            }
            System.out.println();
        }
    }
    
}
