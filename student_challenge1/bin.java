/* program to find number is binary or not and hexadecimal*/
package student_challenge1;
import java.util.*;
public class bin {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter");
    // String str=String.valueOf(b);
    String str=sc.nextLine();
    System.out.println(str.matches("[01]*"));
    String str1=sc.nextLine();
    System.out.println(str1.matches("[0-9A-F]*"));
    String str2="1-2-2005";
    System.out.println(str2.matches("[0-3]*[0-9]+-[0-1]*[0-9]-[0-9]{4}"));
 }   
}
