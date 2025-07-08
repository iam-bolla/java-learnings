/* this program removes all the special characters present */
package student_challenge1;
public class spe {
public static void main(String[] args) {
    String str="a@$3vbh";
    System.out.println(str.replaceAll("\\W", ""));
    String str1="  aa      jjh   ll      ";
    System.out.println(str1.replaceAll("\\s+", " ").trim());
}
    
}
