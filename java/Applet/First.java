import java.applet.Applet;  
//import java.awt.Graphics;  
import java.awt.*;

public class First extends Applet{  
  public void init() {
setBackground(Color.gray);
setForeground(Color.red);
//setFontsize(10);
}
public void paint(Graphics g){ 
Font myFont = new Font("TimesRoman", Font.BOLD, 22); 
g.setFont(myFont); 
g.drawString("Welcome",150,150);
 
}    
}  