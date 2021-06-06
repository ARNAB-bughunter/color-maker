import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class test{
	public static void main(String[] args) {
		JFrame frame=new JFrame();
    Container c=frame.getContentPane();
     c.setBackground(Color.green);
    frame.setSize(525,710);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     make panel=new make();
     c.setLayout(null);
     c.add(panel);
	}
}

class make extends JPanel implements ChangeListener{
JPanel panel1;
JSlider slider1,slider2,slider3;
int red=250,green=250,blue=250;
public void paint(Graphics g){
super.paint(g);
g.setColor(Color.cyan);
g.setFont(new Font("Arial",Font.BOLD,25));
g.drawString("RESULT COLOR",252,240);
g.drawString("RED VALUE="+String.valueOf(red),250,300);
g.drawString("GREEN VALUE="+String.valueOf(green),250,330);
g.drawString("BLUE VALUE="+String.valueOf(blue),250,360);
g.drawRect(250,10,200,200);
 }
make(){  
 panel1=new JPanel();
 panel1.setBounds(250,10,200,200);  
 slider1=new JSlider(JSlider.VERTICAL,0,250,250);
 slider2=new JSlider(JSlider.VERTICAL,0,250,250);
 slider3=new JSlider(JSlider.VERTICAL,0,250,250);

 slider1.setBounds(0,0,50,600);slider1.setBackground(Color.red);slider1.setForeground(Color.black);
 slider2.setBounds(83,0,50,600);slider2.setBackground(Color.green);slider2.setForeground(Color.black);
 slider3.setBounds(166,0,50,600);slider3.setBackground(Color.blue);slider3.setForeground(Color.black);

slider1.addChangeListener(this);
slider2.addChangeListener(this);
slider3.addChangeListener(this);

slider1.setMinorTickSpacing(10);slider1.setPaintTicks(true);slider1.setPaintTicks(true);slider1.setPaintLabels(true);
slider2.setMinorTickSpacing(10);slider2.setPaintTicks(true);
slider3.setMinorTickSpacing(10);slider3.setPaintTicks(true);

this.setLayout(null);
this.setBounds(5,6,500,660);
this.setBackground(Color.black);
this.add(slider1);
this.add(slider2);
this.add(slider3);
this.add(panel1);
 } 
public void stateChanged(ChangeEvent e){
red=slider1.getValue();
green=slider2.getValue();
blue=slider3.getValue();
panel1.setBackground(new Color(red,green,blue));
repaint();
  }
    }
