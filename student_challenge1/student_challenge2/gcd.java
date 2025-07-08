/*program to find gcd of number */
package student_challenge1.student_challenge2;
import java.util.*;
public class gcd {
    static int gcd(int m,int n)
    {
        while(m!=n)
        {
            if(m>n)
            m=m-n;
            else
            n=n-m;
        }
        return m;
    }
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter m and n value");
    int m=sc.nextInt();
    int n=sc.nextInt();
System.out.println("G.C.D is"+gcd(m, n));
 }   
}
