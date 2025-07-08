/*program to demonstrate phone interface */
package student_challeneg_4;
class phone{
    void msg(){System.out.println("msg");}
    void call(){System.out.println("call");}
}
 interface  camera {
void click();
void record();
}
 interface musicplayer {
void play();
void sound();    
}
class smartphone extends phone implements camera,musicplayer
{
    void videocall(){System.out.println("video");}
   public void click(){System.out.println("click");}
   public  void record(){System.out.println("record");}
   public void play(){System.out.println("play");}
   public void sound(){System.out.println("sound");}
}
public class phonein {
    public static void main(String[] args) {
        smartphone sp=new smartphone();
        musicplayer p=sp;
        p.play();
    }
}
