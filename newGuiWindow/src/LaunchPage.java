import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LaunchPage implements ActionListener   {

	JFrame frame = new JFrame();
	JButton button = new JButton();
	
	LaunchPage(){
		
		button.setBounds(200, 0200, 0200, 0100);
		button.setText("New Window");
	    button.setFocusable(false);
		button.addActionListener(this);
		frame.add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == button);
		
		NewWindow window = new NewWindow();
		
	}
}
