/*program to demonstrate menu driven program */
package student_challenge1.student_challenge2;
import java.util.*;
public class menu {
    public static void main(String[] args) {
        System.out.println("options");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter your option");
        sc.nextLine();
        String str=sc.nextLine();
        str=str.toUpperCase();
        // System.out.println("enter a and b");
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        switch (str) {
            case "ADD":
                System.out.println(a+b);
                break;
                case "SUB":
                System.out.println(a-b);
                break;
                case "DIV":
                System.out.println(a/b);
                break;
                case "MUL":
                System.out.println(a*b);
                break;
            default:System.out.println("not valid");
                break;
        }
    }
}
