/*program  to represent product in data hiding and constructor */
package student_challenge1.student_challenge3;
class product{
    private int itemno;
    private String name;
    private double price;
    private double qty;
    public product(int itemno,String name)
    {
        this.itemno=itemno;
        this.name=name;
    }
    public void setpq(double price,double qty)
    {
        this.price=price;
        this.qty=qty;
    }
    public String toString()
    {
      return "name of item "+name+"\n"+"itemno is "+itemno+"\n"+"qty is "+qty+"\n"+"price is "+price;
    }
}
public class productdata {
    public static void main(String[] args) {
        product p=new product(123, "chocolate");
        p.setpq(100, 80);
        System.out.println(p);
    }
}
