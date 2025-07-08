/*program to find area method overloading */
package student_challenge1.student_challenge2;
public class methodoverloadarea {
    static int area(int l,int b)
    {
        return l*b;
    }
    static double area(int r)
    {
        return Math.PI*r*r;
    }
    public static void main(String[] args) {
        System.out.printf("Area is %.2f",area(5));
    }
}
