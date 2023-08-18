import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class main {
	int pin = 1234;
	double balance = 120.2; 
	private JFrame frmEdahabServices;
	private JTextField txtcode;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.frmEdahabServices.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEdahabServices = new JFrame();
		frmEdahabServices.setTitle("E-Dahab Services");
		frmEdahabServices.setBounds(100, 100, 450, 300);
		frmEdahabServices.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEdahabServices.getContentPane().setLayout(null);
		
		JLabel subtitlelb = new JLabel("E-Dahab");
		subtitlelb.setForeground(new Color(0, 128, 0));
		subtitlelb.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		subtitlelb.setBounds(160, 21, 118, 49);
		frmEdahabServices.getContentPane().add(subtitlelb);
		
		txtcode = new JTextField();
		txtcode.setBounds(141, 103, 147, 20);
		frmEdahabServices.getContentPane().add(txtcode);
		txtcode.setColumns(10);
		
		JButton sendbtn1 = new JButton("OK");
		sendbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String code;
				code = txtcode.getText();
				if (code.equals("*111#")) {
					frmEdahabServices.dispose();
					MenueFrame menu = new MenueFrame();
					menu.setVisible(true);
				}else if(code.equals("*711#")) {
					frmEdahabServices.dispose();
					HaraaFrame haraa = new HaraaFrame();
					haraa.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Wrong Valid");
					
				}
				
			}
		});
		sendbtn1.setBounds(173, 134, 89, 23);
		frmEdahabServices.getContentPane().add(sendbtn1);
		
		JLabel lblNewLabel = new JLabel("Fadlan Gali Code Ka Aqoonsiga");
		lblNewLabel.setBounds(160, 81, 107, 14);
		frmEdahabServices.getContentPane().add(lblNewLabel);
	}
}
