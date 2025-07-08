/*program to demonstrate name of a day using switch */
package student_challenge1.student_challenge2;
public class swiday {
    public static void main(String[] args) {
        int day=1;
        switch ((day)) {
            case 1:
                System.out.println("sun");
                break;
                case 2:
                System.out.println("mon");
                break;
                case 3:
                System.out.println("tues");
                break;
            default:System.out.println("not valid number");
                break;
        }
    }
}
