/*program to find factorial */
package student_challenge1.student_challenge2;
import java.util.*;
public class fact {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int f=1;
        for(int i=1;i<=n;i++)
        {
         f=f*i;
        }
        System.out.println(f);
    }
}
