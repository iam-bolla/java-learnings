public class strmet2 {
    public static void main(String[] args) {
        String str="www.udemy.com";
        String str1="java";
        String str2="Java";
        System.out.println(str.startsWith("www"));//startsWith
        System.out.println(str.endsWith("com"));//endsWith
        System.out.println(str.charAt(1));//charAt
        System.out.println(str.indexOf("udemy"));//indexOf
        System.out.println(str.lastIndexOf(".",9));//lastIndexOf
        System.out.println(str1.equals(str2));//equals
        System.out.println(str2.compareTo(str1));//compareTo
        System.out.println(str.contains("www"));//contains
    }
}
