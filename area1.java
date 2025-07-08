/* program to calculate area of triangle */
import java.util.*;
public class area1 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter base and height of a triangle");
      int base =sc.nextInt();
      int height=sc.nextInt();
      float area=(float)1/2f*base*height;
      /*This is because 1/2 gives 0 so typecasted  */
      System.out.println("area "+area);  
    }
}
