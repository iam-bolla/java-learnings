/*program to find grade of a student */
package student_challenge1.student_challenge2;
import java.util.*;
public class grade {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter marks of student");
    int m1=sc.nextInt();
    int m2=sc.nextInt();
    int m3=sc.nextInt();
    int m4=sc.nextInt();
    int m5=sc.nextInt();
    float average=(m1+m2+m3+m4+m5)/5;
    System.out.println(average);
    if(average>=80)
    {
        System.out.println("A");
    }
    else if(average<80&&average>=70)
    {
        System.out.println("B");
    }
    else if(average<70&&average>=60)
    {
        System.out.println("c");
    }
    else if(average<60&&average>=50)
    {
        System.out.println("D");
    }
    else if(average<5040&&average>=40)
    {
        System.out.println("E");
    }
    else
    {
        System.out.println("not valid");
    }
   } 
}
