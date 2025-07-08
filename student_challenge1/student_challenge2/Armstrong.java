/* program to find  a number armstrong or not */
package student_challenge1.student_challenge2;
import java.util.*;
public class Armstrong {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    int temp=n;
    int arm=0;
    while(n>0)
    {
        int r=n%10;
        arm=arm+r*r*r;
        n=n/10;
    }
    System.out.println(arm);
    if(arm==temp)
    {
        System.out.println("armstrong number");
    }
    else
    {
        System.out.println("not a armstrong number");
    }
 }   
}
