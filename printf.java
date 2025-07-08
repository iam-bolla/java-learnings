 /* program to demonstrate aboout printf */
 class printf1 {
    public static void main(String[] args) {
    int a=9;
    float b=18.77f;
    char c='h';
    System.out.printf("%1$d %3$c %2$f\n",a,b,c);
    System.out.printf("%2d\n",a);
    System.out.printf("%+d\n",a);
    System.out.printf("%06.2f\n",b);
    System.err.printf("%03d\n",a);
}
}
