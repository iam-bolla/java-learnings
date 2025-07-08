/* program to find radix of a number */
package student_challenge1.student_challenge2;
import java.util.*;
public class radix {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    String str=sc.nextLine();
    if(str.matches("[01]+"))
    {
        System.out.println("radix=2");
    }
    else if(str.matches("[0-9]*[A-F]+"))
    {
        System.out.println("radix=16");
    }
    else if(str.matches("[0-7]+"))
    {
        System.out.println("radix=8");
    }
    else if(str.matches("[0-9]+"))
    {
        System.out.println("radix=10");
    }
    else
    {
        System.out.println("Not valid");
    }
   } 
}
