/* program finds quadratic equation */
import java.util.*;
public class quadratic {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a,b,c values");
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       double r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
       double r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
       System.out.println("roots are "+r1+" "+r2);
    }
}
