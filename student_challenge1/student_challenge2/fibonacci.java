/*program to find fibonacci series */
package student_challenge1.student_challenge2;
import java.util.*;
public class fibonacci {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int i=1;
    System.out.println("Enter n value");
    int n=sc.nextInt();
    int a=0;
    System.out.print(a+",");
    int b=1;
    System.out.print(b+",");
    while(i<=n)
    {
    int c=a+b;
     System.out.print(c+",");
     a=b;
     b=c;
     i++;
    }
 }   
}
