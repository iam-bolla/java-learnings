/*program to find area and volume  of cuboid */
import java.util.*;
public class cuboidArea {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter values of a,b,c");
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int totalArea=2*(a*b+b*c+c*a);
      System.out.println("Area "+totalArea);  
      int volume=a*b*c;
      System.out.println("voulme "+volume);
    }
}
