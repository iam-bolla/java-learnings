/*program to know number is prime or not */
package student_challenge1.student_challenge2;
import java.util.*;
public class primenum {
   static boolean isprime(int n)
    {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number"); 
       int n=sc.nextInt();
       if(isprime(n)==false)
       System.out.println("It is not a prime number");
       else
       System.out.println("It is  a prime number");
    }
}
