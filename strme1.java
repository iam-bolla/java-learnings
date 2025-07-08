public class strme1 {
    public static void main(String[] args) {
        String str="   java   ";
        int len=str.length();//length
        System.out.println(len);
        String str1=str.toUpperCase();//uppercase
        System.out.println(str1);
        String str2=str.trim();//trim
        System.out.println(str2);
        String str3="java program";
        str3=str3.substring(3);//substring
        System.out.println(str3);
        String str4=str3.substring( 0,5);//substring  
        System.out.println(str4);
        String str5=str.replace('a', 'e');//replace
        System.out.println(str5);
    }
}
