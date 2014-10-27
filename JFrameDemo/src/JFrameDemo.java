
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JFrameDemo extends JFrame implements ActionListener {
	JTextField jtxUsername;
	JPasswordField jpwPassword;
	JButton jbtLogin; 
	JButton jbtReset;
	JPanel jpaButton;
	
	public JFrameDemo() {
		jpaButton = new JPanel();
		jpaButton.setBackground(Color.PINK);
		
		jtxUsername = new JTextField(20);
		jpwPassword = new JPasswordField(20);
		
		jbtLogin = new JButton("Login");
		jbtReset = new JButton("Reset");
		jpaButton.add(jbtReset);
		jpaButton.add(jbtLogin);
		
		jbtLogin.addActionListener(this);
		jbtReset.addActionListener(this);
		
		add(jtxUsername, BorderLayout.NORTH);
		add(jpwPassword);
		add(jpaButton, BorderLayout.SOUTH);
		
		setVisible(true);
		//setSize(new Dimension(50,100));

		pack();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equalsIgnoreCase("Login"))
			JOptionPane.showMessageDialog(null, "FAIL AUTHENTICATION");
		else if(e.getActionCommand().equalsIgnoreCase("Reset")) {
			jtxUsername.setText("");
			jpwPassword.setText("");
		}
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JFrameDemo();
	}

}
