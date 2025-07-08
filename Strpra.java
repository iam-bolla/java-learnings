
/* This program demonstrates about string */
public class Strpra {
    public static void main(String[] args) {
        char c[]={'q','o','i'};
       String str=new String(c);
       byte b[]={85,90};
       String str1=new String(b);
       System.out.println(str);
       System.out.println(str1);
       String str2="java";
       String str3="java";
       System.out.println(str2==str3);
       String str4=new String("java");
       System.out.println(str4==str3);
    }
}
