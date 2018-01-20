import java.awt.*;
import javax.swing.*;

public class FlowLayout_Panel extends JPanel{
	
	public FlowLayout_Panel() {
		
		setLayout(new FlowLayout());
		
		setBackground(Color.GREEN);
		
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");
		JButton button4 = new JButton("Button 4");
		JButton button5 = new JButton("Button 5");
		
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
	}
}
