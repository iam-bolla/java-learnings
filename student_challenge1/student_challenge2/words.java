/* program to print number in words */
package student_challenge1.student_challenge2;
import java.util.*;
public class words {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int a=sc.nextInt();
    String str=a+"";
    int i=0;
    while(i<str.length())
    {
        switch (str.charAt(i)) {
            case '0':System.out.print("zero ");
                
                break;
            case '1':System.out.print("one ");
                
                break;
            case '2':System.out.print("Two ");
                
                break;
            case '3':System.out.print("Three ");
                
                break;
            case '4':System.out.print("four ");
                
                break; 
            case '5':System.out.print("five ");
                
                break;
            case '6':System.out.print("six ");
                
                break; 
            case '7':System.out.print("seven ");
                
                break; 
            case '8':System.out.print("eight ");
                
                break; 
            case '9':System.out.print("nine ");
                
                break;
            default:
                break;
        }
        i++;
        
    }
   } 
}
