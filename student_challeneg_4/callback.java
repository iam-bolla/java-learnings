/*program to demonstrate call back method to understand interface */
package student_challeneg_4;

import java.util.Arrays;

interface member
{
    void callback();
}
class customer implements member
{  String name;
    customer(String n)
    {
    name =n;
    }
    public void callback(){
  System.out.println("ok will visit "+name);
    }
}
class store{
    member me[]=new member[100];
    int count=0;
    void invite(){
    for(int i=0;i<100;i++)
    {
        me[i].callback();
    }
}
    void register(member m)
    {
          me[count++]=m;
    }
   

}
public class callback {
   public static void main(String[] args) {
    customer c=new customer("rani");
    store s=new store();
    s.register(c);
    s.invite();
   
   } 
}
