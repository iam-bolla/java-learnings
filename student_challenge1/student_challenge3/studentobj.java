/*program for student in oops  */
package student_challenge1.student_challenge3;
import java.util.*;

import student_challenge1.student_challenge2.pattern1;
class student
{
    public String rollno;
    public String name;
    public String course;
    public int m1,m2,m3;
    public int total()
    {
        return m1+m2+m3;
    }
    public double average()
    {
        return (m1+m2+m3)/3;
    }
   public String grade()
   {
    if(average()>=80){
    return "A";}
    else if (average()<80&&average()>=70){
    return "B";}
    else if (average()<70&&average()>=60){
    return "C";}
    else if (average()<60&&average()>=50){
    return "D";}
    else if (average()<50&&average()>=40){
    return "B";}
    return "not valid";
   }
}
public class studentobj {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        student s=new student();
        s.course=sc.nextLine();
        s.name=sc.nextLine();
        s.rollno=sc.nextLine();
        s.m1=sc.nextInt();
        s.m2=sc.nextInt();
        s.m3=sc.nextInt();
        System.out.println("total "+s.total());
        System.out.println(s.toString());
        System.out.println(s.average());
        System.out.println(s.grade());
    }
}
