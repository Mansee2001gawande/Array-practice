public class As17 {
    public static void main(String[] args) {
      /*  String name [] = new String[]{"mansee","peru","pranjali","peru" ,"chinki"};
        for(int i=0;i<5-1;i++){
            for(int j=0;j<4;j++){
                if(name[i]==name[j] && (i!=j)){
                    System.out.println(name[j]+"[duplicacy found...]");
                }//else{
                    //System.out.println("no duplicacy found");
                //}
            }
        }
    }  
} */
java.util.Scanner sc = new java.util.Scanner(System.in);
    //System.out.println("enter length :-");
   // int length=sc.nextInt();
    String name[] =new String[4];

    System.out.println("enter 4 name");
    for(int i=0;i<4;i++){
            name[i]=sc.next();
       // }
    
       // for(int i=0;i<4-1;i++){
        for(int j=i+1;j<4;j++){

            if(name[i]==name[j] && (i!=0)){
                System.out.println(name[j]+"[duplicacy found....]");
            }
        }
    }
    }
} 












