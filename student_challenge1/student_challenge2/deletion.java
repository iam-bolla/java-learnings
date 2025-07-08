/*program to find deletion of element  in an array */
package student_challenge1.student_challenge2;
import java.util.*;
public class deletion {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int index=sc.nextInt();
    int a[]={8,5,4,3};
    for(int i=index;i<a.length-1;i++)
    {
        a[i]=a[i+1];
    }
    for(int i=0;i<a.length-1;i++)
    {
        System.out.println(a[i]);
    }
 }   
}
