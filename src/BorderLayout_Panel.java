import java.awt.*;
import javax.swing.*;

public class BorderLayout_Panel extends JPanel{
	
	public BorderLayout_Panel() {
		
		setLayout(new BorderLayout());
		
		setBackground(Color.WHITE);
		
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");
		JButton button4 = new JButton("Button 4");
		JButton button5 = new JButton("Button 5");
		
		add(button1,BorderLayout.CENTER);
		add(button2,BorderLayout.SOUTH);
		add(button3,BorderLayout.NORTH);
		add(button4,BorderLayout.WEST);
		add(button5,BorderLayout.EAST);
	}

}
