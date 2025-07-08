/*program to print pattern */
package student_challenge1.student_challenge2;
public class pattern5 {
   public static void main(String[] args) {
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=5;j++)
        {
         if(i+j>=6)
         {
            System.out.print("*");
         }
         else{
          System.out.print(" ");
         }
        }
         for(int k=1;k<=5;k++)
         {
            if(i>      k)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print("");
            }
         }
        
        System.out.println("");
    }
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=5;j++)
        {
            if(j>i)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }
        for(int k=1;k<=3;k++)
        {
            if(i+k<=4)
            {
            System.out.print("*");
            }
            else
            {
                System.out.print("");
            }
        }
        System.out.println("");
   } 
}
}
