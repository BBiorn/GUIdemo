
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
	   JLabel jl = new JLabel("This is a test of java swing");
	   panel.add(jl, BorderLayout.NORTH);
	   
	   frame.add(panel);
	   frame.setVisible(true);	   
   }
}
