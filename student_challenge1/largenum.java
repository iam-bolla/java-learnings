/* program to find the larger number */
package student_challenge1;
import java.util.*;
public class largenum {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the numbers");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if(a>b&&a>c)
    {
        System.out.println(" a is larger");
    }
    else
    {
        if(b>c)
        {
            System.out.println(" b is larger");
        }
        else
        {
            System.out.println("c is larger");
        }
    }
  }  
}
