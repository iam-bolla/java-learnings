/*program to check leap year */
package student_challenge1.student_challenge2;
import java.util.*;
public class leapyear {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a year");
    int year=sc.nextInt();
  if(year%4==0)
  {
  if(year%100==0)
  {
    if(year%400==0)
    {
        System.out.println("a leap year");
    }
    else
     {
        System.out.println("not a leap year");
     }
  }
  else
  {
    System.out.println("a leap year");
  }
  }
  else
  {
    System.out.println("not a leap year");
  }
  }  
}
