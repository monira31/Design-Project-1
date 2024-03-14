package Social;

import javax.swing.*;
import java.awt.*;
public class Splash extends JFrame implements Runnable{
    Thread thread;
    
    Splash(){
        
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/1325157.png"));
        Image i2= i1.getImage().getScaledInstance(1070, 470, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        add(image);
        
        setVisible(true);
        thread = new Thread(this);
        thread.start();
    
    }
    public void run(){
        try{
            Thread.sleep(8000);
            new Login();
           setVisible(false);
           Main t = new Main();
                        t.setVisible(true);
        }catch(Exception e){}
    }
    
    public static void main(String[] args) {
        Splash frame=new Splash();
        int x=1;
        for (int i =1; i < 500; x=x+7, i=i+6) {
            frame.setLocation(750-(x+i)/2,400-(i/2));
            frame.setSize(x+i,i);
            try{
                Thread.sleep(60);
            
            }
            catch(Exception e){
            }
        }
        
                        
        
    }
    
}
