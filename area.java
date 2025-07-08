
/* program to find area of triangle */
import java.util.*;
public class area {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a,b,c values");
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       float s=0.5f*(a+b+c);
       double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
       System.out.println("area "+area); 
    }
}
