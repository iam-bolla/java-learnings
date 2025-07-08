/* program to add numbers */
package student_challenge1.student_challenge2;
import java.util.*;
public class cmdsum {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
   String str=sc.nextLine();
   double s=0;
   for(String a:args){
   if(str.matches("[a-zA-z\\W]*"))
   {
    System.out.println("invalid");
   }
   else
   {
     s=s+Double.parseDouble(str);
   }
   System.out.println("sum is"+s);
}

  }  
}
