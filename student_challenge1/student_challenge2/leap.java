/*program to check leap year */
package student_challenge1.student_challenge2;
import java.util.*;
public class leap {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a year");
    // int year=sc.nextInt();
    int year=2000;
    if(year%4==0)
    {
        if(year%100==0)
        {  if(year%400==0){
            System.out.println(" leap year1");}
            else{
                System.out.println(" not leap");
            }
        }
        else{
            System.out.println("leap year");
        }
    }
    else{
        if(year%100==0)
        {
            if(year%400==0)
            {
                System.out.println("leap year");
            }
            else
            {
                System.out.println("not leap year3");
            }
        }
        else
        {
            System.out.println("not leap year2");/* 1st checks if not second means go to 400 not onlt means comin to else 
            this statement executed */
        }
    }
   } 
}
