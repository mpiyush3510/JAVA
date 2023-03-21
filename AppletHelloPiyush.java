import java.applet.*;
import java.awt.*;

/*
 <Applet code=AppletHelloPiyush.class Width=1200 Height=300>
 </Applet> 
 */

public class AppletHelloPiyush extends Applet{
    Font font;
    public void init(){
        setBackground(Color.BLACK);
        setForeground(Color.green);
        font=new Font("Console",Font.BOLD,120);
    }
    public void paint(Graphics g){
        g.setFont(font);
        g.drawString("Hello Piyush !",170,160);
    }
}
