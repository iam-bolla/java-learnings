/*program to find reverse of a number and palindrome or not */
package student_challenge1.student_challenge2;
import java.util.*;
public class reverse {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    int rev=0;
    int temp=n;
    while(n>0)
    { 
     int r=n%10;
     rev=rev*10+r;
     n=n/10;
    }
System.out.println("reverse number:"+rev);
if(rev==temp)
{
    System.out.println("palindrome number");
}
else
{
    System.out.println("Not a palindrome number");
}
   } 
}
