/*program to sum n natural numbers */
package student_challenge1.student_challenge2;
import java.util.*;
public class sumofnnum {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int ns=0;
    int s=0;
    for(int i=1;i<=n;i++)
    {
     s=s+i;
    }
    System.out.println(s);
  }  
}
