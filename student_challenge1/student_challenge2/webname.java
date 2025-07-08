/*program to find type of website and protocol  */
package student_challenge1.student_challenge2;

public class webname {
 public static void main(String[] args) {
    String str1="https://www.udemy.com";
    int i=str1.indexOf(":");
    String type=str1.substring(0, i);
    int str2=str1.lastIndexOf(".");
    String str3=str1.substring(str2+1, str1.length());
    System.out.println("protocol= "+type);
    if(type.matches("https"))
    {
        System.out.println("hyper text transfer protocol");
    }
    else if(type.matches("fttp"))
    {
        System.out.println("file transfer protocol");
    }
    System.out.println(str3);
    if(str3.matches("org"))
    {
        System.out.println("organisation");
    }
   else if(str3.matches("com"))
    {
        System.out.println("communication");
    }
    else if(str3.matches("net"))
    {
        System.out.println("network");
    }
 }   
}
