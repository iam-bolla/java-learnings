/*program to demonstrate name of a day */
package student_challenge1.student_challenge2;
import java.util.*;
public class dayname {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the day");
       int day=sc.nextInt();
       if(day==1)
       {
        System.out.println(
            "sun"
        );
       } 
        else if(day==2)
       {
        System.out.println(
            "mon"
        );
       } 
       else if(day==3)
       {
        System.out.println(
            "tues"
        );
       } 
       else if(day==4)
       {
        System.out.println(
            "wed"
        );
       } 
       else if(day==5)
       {
        System.out.println(
            "Thurs"
        );
       } 
       else if(day==6)
       {
        System.out.println(
            "fri"
        );
       } 
       else if(day==7)
       {
        System.out.println(
            "sat"
        );
       } 
    }
}
