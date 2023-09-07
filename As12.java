/*Q.12 a) Write a statement that declares a string array initialized with the
 following strings:"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", 
 "Friday" and "Saturday".b) Write a loop that displays the contents of each
  element in the array that you declared.
*/public class As12 {
    public static void main(String[] args) {
        String days[] = {"monday","tuesday","wednesday","thursday","friday",
        "saturday","sunday"};
       // System.out.println(days); out:-[Ljava.lang.String;@2f92e0f4
       for(String day:days){
       System.out.println(day);
    }
    }
}
