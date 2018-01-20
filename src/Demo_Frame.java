import javax.swing.*;

public class Demo_Frame {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame ("Demo For Layout Managers");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane selections = new JTabbedPane();
		selections.addTab("Introduction", new Intro_Panel());
		selections.addTab("Flow Layout", new FlowLayout_Panel());
		selections.addTab("Border Layout", new BorderLayout_Panel());	
		selections.addTab("Grid Layout", new GridLayout_Panel());
		selections.addTab("Box Layout", new BoxLayout_Panel());
		
		frame.getContentPane().add(selections);
		frame.pack();
		frame.setVisible(true);
	}

}
