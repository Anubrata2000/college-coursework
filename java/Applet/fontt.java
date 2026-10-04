    import java.awt.*;    
    import java.applet.*;    
        
    public class fontt extends Applet    
     {    
       Font f1,f2,f3;    
        
       public void  init()    
        {    
           f1 = new Font("Arial",Font.BOLD,18);    
           f2 = new Font("Forte",Font.PLAIN,24);    
           f3 = new Font("Elephant",Font.ITALIC,28);    
        }    
              
       public void  paint(Graphics g)    
       {    
          g.drawString("Bishal",50,50);    
        
          g.setFont(f1);     
          g.drawString("Himangshu",50,80);    
        
              
          g.drawString("Anubrata",50,110);  
				g.setFont(f2);   
        
          //g.setFont(f3);     
          g.drawString("Manisha",50,140);    
       }    
     }    
        
    /* <applet code = "fontt.class" height = 500 width =500>  
       </applet> */