package student_challenge1;
/*find email id is on email and find domain and username */
public class email {
   public static void main(String[] args) {
    String str="programmer@gmail.com";
    System.out.println(str.contains("gamil"));
    int i=str.indexOf("@");
    String username=str.substring(0, i);
    String domain=str.substring(i+1,str.length());
    System.out.println("username :"+username+" domain: "+domain);
   } 
}
