/*this program  counts no of words */
package student_challenge1;
import java.util.*;
public class wordcount {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    str=str.replaceAll("\\s+", " ").trim();
    String words[]=str.split("\\s");
    System.out.println("word count is "+words.length);
  }  
}
