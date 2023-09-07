//Q.6 Find a missing number in an array 
class Assig6{
    public static void main(String[] args) {
       // int a[] = {1,2,3,5};
        boolean flag=false;
        java.util.Scanner sc =new java.util.Scanner(System.in);
        System.out.println ("enter array length");
        int length=sc.nextInt();

        int a[]=new int [length];
        System.out.println("enter array elements");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the missing element");
        int search=sc.nextInt();

        for(int i=0;i<a.length;i++){
            if(search == a[i]){
                flag=true;
                break;
            }
        }
            if(flag) {
                System.out.println("found ");
            } else{
                System.out.println("not found ");
            }
        }
}    
















        /*java.util.Scanner sc = new java.util.Scanner(System.in);
        //System.out.println("enter array length");
        int n = a.length;
        int sum=1;
        // sum = ((n+1)*(n+2))/2;
        for(int i=0;i<(n+1);i++){
            sum=sum+i;
            sum=sum-a[i-2];
        }
        System.out.println(sum);
        System.out.print(a); */

    



