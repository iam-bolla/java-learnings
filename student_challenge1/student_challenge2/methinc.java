/* program to implement call by value */
package student_challenge1.student_challenge2;
public class methinc {
    static  int inc(int a)
    {
        return a++;
        
    }
    public static void main(String args[])
    {
        int b=11;
        b= inc(b);
        System.out.println(b);
    }
}
