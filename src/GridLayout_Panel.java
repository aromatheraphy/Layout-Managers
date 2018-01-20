import java.awt.*;
import javax.swing.*;

public class GridLayout_Panel extends JPanel{
	
	public GridLayout_Panel() {
		
		setLayout(new GridLayout(3,2));
	
		setBackground(Color.RED);
		
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
