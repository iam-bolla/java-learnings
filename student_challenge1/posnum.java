/* program to find number is positive or negative */
package student_challenge1;
import java.util.*;
public class posnum {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int a=sc.nextInt();
    if(a>=0)
    {
        System.out.println("positive");
    }
    else{
        System.out.println("Negative");
    }
   } 
}
