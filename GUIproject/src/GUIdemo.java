/**
 * This is my attempt at using Java Swing
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIdemo 
{   
   public static void main(String[] Args)
   {
	   JFrame frame = new JFrame("GUI Demo");//Main UI window
	   frame.setSize(600, 450);
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	   JPanel mainPanel = new JPanel();//main panel for holding all the components
	   mainPanel.setLayout(new BorderLayout());
	   
	   JPanel northGridPanel = new JPanel();//grid layout for the north portion of the BorderLayout
	   northGridPanel.setLayout(new GridLayout(2,1));
	   mainPanel.add(northGridPanel, BorderLayout.NORTH);
	   
	   JPanel centerGridPanel = new JPanel();//grid layout for the center portion of the BorderLayout
	   centerGridPanel.setLayout(new GridLayout(2,2, 1, 180));
	   mainPanel.add(centerGridPanel, BorderLayout.CENTER);
	   
	   JPanel southGridPanel = new JPanel();//grid layout for the south portion of the BorderLayout
	   southGridPanel.setLayout(new GridLayout(1,4));
	   mainPanel.add(southGridPanel, BorderLayout.SOUTH);
	   	   	   
	   //adds components to the north portion of the panel
	   JLabel introJL = new JLabel("This is a test of java swing");
	   JLabel descL = new JLabel("With in this user interface we're going to perform arithmetic on two numbers");
	   northGridPanel.add(introJL);
	   northGridPanel.add(descL);
	   
	   //adds components to the center portion of the panel
	   JLabel secondNumL = new JLabel("Please enter the second integer:");
	   centerGridPanel.add(secondNumL , 0, 0);
	   JTextField secondNumTF = new JTextField();
	   centerGridPanel.add(secondNumTF, 0, 1);
	   JLabel firstNumL = new JLabel("Please enter the first integer:");
	   centerGridPanel.add(firstNumL , 1, 0);
	   JTextField firstNumTF = new JTextField();
	   centerGridPanel.add(firstNumTF, 1, 1);
	   
	   //adds buttons to the south portion of the main panel
	   JButton addBtn = new JButton("Add");
	   JButton subBtn = new JButton("Subtract");
	   JButton multBtn = new JButton("Multiply");
	   JButton divBtn = new JButton("Divide");
	   
	   ActionListener btnListener = new ActionListener()//Action Listener for the buttons
	   {
          public void actionPerformed(ActionEvent e)
          {
        	  int num1 = Integer.parseInt(firstNumTF.getText());//parses UI data into an int
        	  int num2 = Integer.parseInt(secondNumTF.getText());
        	  Calc numCalc = new Calc(num1, num2);//creates calc object used to calculate the result
        	  String res;//stores the result of the calculation
        	  
          	  if(e.getActionCommand().equals("Add"))
           	  {
                 res = numCalc.sum();
           	  }
           	  else if(e.getActionCommand().equals("Subtract"))
           	  {
           		 res = numCalc.diff();
           	  }
           	  else if(e.getActionCommand().equals("Multiply"))
           	  {
           		 res = numCalc.mult();
           	  }
           	  else
           	  {
           		 res = numCalc.div();
           	  }
          	  secondNumL.setText("Result: ");
          	  secondNumTF.setText(res);
          }
		};
	   
	   addBtn.addActionListener(btnListener);
	   subBtn.addActionListener(btnListener);
	   multBtn.addActionListener(btnListener);
	   divBtn.addActionListener(btnListener);
	   
	   southGridPanel.add(addBtn);
	   southGridPanel.add(subBtn);
	   southGridPanel.add(multBtn);
	   southGridPanel.add(divBtn);
	   
	   
	   frame.add(mainPanel);
	   frame.setVisible(true);	   
   }   
}
