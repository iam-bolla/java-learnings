/* program to search an elemsnt in an array */
package student_challenge1.student_challenge2;
import java.util.*;
public class search {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int search=sc.nextInt();
    int a[]={3,2,2,1};
    int flag=0;
    for(int i=0;i<a.length;i++)
    {
        if(search==a[i])
        {
            flag=1;
        }
    }
    if(flag==1)
    {
        System.out.println("Element is found");
    }
    else
    {
        System.out.println("Element is not found");
    }
  }  
}
