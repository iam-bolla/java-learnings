/*program to print digits of a number */
package student_challenge1.student_challenge2;
import java.util.*;
public class digits {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    while(n>0)
    {
        int digit=n%10;
        System.out.println(digit);
        n=n/10;
    }
  }  
}
