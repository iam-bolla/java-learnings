/*program to find type of website using switch case */
package student_challenge1.student_challenge2;
import java.util.*;
public class switypewebsite {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a website");
    String str=sc.nextLine();
    int i=str.lastIndexOf(".");
    String str1=str.substring(i+1, str.length());
    switch(str1)
    {
        case "com":System.out.println("commericial");
        break;
        case "org":System.out.println("organisation");
        break;
        case "net":System.out.println("network");
        break;
        default:System.out.println("not a valid");
        break;
    }
}
}
