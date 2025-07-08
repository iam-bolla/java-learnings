/*program to write method overloading */
package student_challenge1.student_challenge2;
public class methodoverloading {
    static int max(int x,int y)
    {
        return x>y?x:y;
    }
    static float max(float x,float y)
    {
        return x>y?x:y;
    }
   public static void main(String[] args) {
    System.out.println(max(10,5));
   } 
}
