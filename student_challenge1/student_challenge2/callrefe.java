/*program to represent call by reference */
package student_challenge1.student_challenge2;
public class callrefe {
   static String update(String name)
   {
\    return name;
   } 
 public static void main(String[] args) {
    String name="victoria";
    System.out.println(update(name).length());
 }   
}
