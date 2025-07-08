/*program to validate name and age of a person */
package student_challenge1.student_challenge2;
public class validate {
    static boolean validate(String name)
    {
    //    return name.matches("\\d*||\\W*");=>neither alpahebets
    return name.matches("[a-zA-z\\s]*");
    }
    static boolean validate(int age)
    {
        return age>=15&&age<=50;
    }
   public static void main(String[] args) {
    System.out.println(validate(24));
    System.out.println(validate("rani"));
   } 
}
