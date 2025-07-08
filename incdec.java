
/* program to demonstrate increment and decrement
 * post increment/decrement=complete the task and then assign 
 * pre increment/decrement =assign then complete the task
 */
public class incdec {
    public static void main(String[] args) {
       int a=5,b=7;
       int c=a++;
       int d=++b;
       System.out.println(c+" "+a);
       System.out.println(d+" "+b);
    }
}
