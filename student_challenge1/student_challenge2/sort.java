/*program for sorting in string */
package student_challenge1.student_challenge2;
public class sort {
   public static void main(String[] args) {
    String str[]={"java","python","c++","php"};
    java.util.Arrays.sort(str);
    for(String s:str)
    {
        System.out.println(s);
    }
   } 
}
