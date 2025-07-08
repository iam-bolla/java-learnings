import java.util.*;
public class cmdsum {
  public static void main(String[] args) {
   double s=0;
   for(String a:args){
   if(a.matches("[a-zA-z\\W]*"))
   {
    System.out.println("invalid");
   }
   else
   {
     s=s+Double.parseDouble(a);
   }
   System.out.println("sum is"+s);
}

  }  
}