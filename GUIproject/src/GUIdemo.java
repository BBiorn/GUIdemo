
import java.awt.BorderLayout;
import javax.swing.*;

public class GUIdemo 
{
   public static void main(String[] Args)
   {
	   JFrame frame = new JFrame("GUI Demo");
	   frame.setSize(600, 450);
	   
	   JPanel panel = new JPanel();
	   panel.setLayout(new BorderLayout());
	   JTextField tf = new JTextField("This is a test of java swing");
	   panel.add(tf, BorderLayout.NORTH);
	   
	   frame.add(panel);
	   frame.setVisible(true);	   
   }
}
