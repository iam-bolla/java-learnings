/*This is scanner programmer and setting the radix of our choice */
import java.util.*;
public class radix {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       sc.useRadix(2);
       System.out.println("Enter a number");
       int a=sc.nextInt();
       System.out.println("The number is "+a); 
    }
}
