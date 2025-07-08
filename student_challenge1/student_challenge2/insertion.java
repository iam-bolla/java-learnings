/*program to insert an element */
package student_challenge1.student_challenge2;
import java.util.*;
public class insertion {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int index=sc.nextInt();
    int value=sc.nextInt();
    int a[]=new int[10];
    for(int i=0;i<6;i++)
    {
        a[i]=sc.nextInt();
    }
    for(int i=n;i<index;i++)
{
    a[i]=a[i-1];
}
a[index]= value;
for(int x:a)
{
    System.out.println("values:"+x);
}
 }  
}
