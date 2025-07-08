/*program to count digits of a number */
package student_challenge1.student_challenge2;
import java.util.*;
public class countdigit {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    int count =0;
    while(n>0)
    {
        int digit=n%10;
        ++count;
        n=n/10;
    }
    System.out.println(count);
 }   
}
