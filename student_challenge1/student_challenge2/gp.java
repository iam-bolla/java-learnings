/*program to find g.p series */
package student_challenge1.student_challenge2;
import java.util.*;
public class gp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
   System.out.println("Enter a,n,d");
   int a=sc.nextInt();
   int n=sc.nextInt();
   int d=sc.nextInt();
   int i=1;
   int term=a;
   while(i<=n)
   {
    System.out.print(term+",");
    term=term*d;
    i++;
   }
    }
}
