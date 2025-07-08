/* program to demonstrate multiplication table */
package student_challenge1.student_challenge2;
import java.util.*;
public class multiplication {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your number");
    int n=sc.nextInt();
    int i=1;
    while(i<=10)
    {
        System.out.println(n+"X"+i+"="+n*i);
        i++;
    }
  }  
}
