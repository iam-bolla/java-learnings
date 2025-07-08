package student_challeneg_4;
class share
{  
   static long price =8777;
   static
   {
    System.out.println("st");
   }
  static double pr;
   static double pri(String city)
   {
     switch (city) {
        case "ke":pr=price*0.1;
            
            break;
     
        default:
            break;
     }
     return pr;
   }
}
public class dou {

    static
    {
        System.out.println("s");
    }
    static void display()
    {
        System.out.println("hi");
    }    public static void main(String[] args) {

    }
}
