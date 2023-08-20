import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class hubiFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hubiFrame frame = new hubiFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public hubiFrame() {
		setTitle("E-Dahab Service");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("[eDahab Service]");
		lblNewLabel.setForeground(new Color(0, 128, 0));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel.setBounds(144, 33, 135, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblFadlanGeliPinkaaga = new JLabel("Fadlan Geli pinkaaga si aad u dirto");
		lblFadlanGeliPinkaaga.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblFadlanGeliPinkaaga.setBounds(66, 70, 358, 24);
		contentPane.add(lblFadlanGeliPinkaaga);
		
		JLabel lblLacagta = new JLabel("Lacagta...");
		lblLacagta.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblLacagta.setBounds(166, 97, 129, 24);
		contentPane.add(lblLacagta);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(125, 132, 164, 32);
		contentPane.add(textField);
		
		JButton btnSend = new JButton("SEND");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int userinput = Integer.parseInt(textField.getText());
				switch (userinput) {
				case 1234:
					
					break;
				}
			}
		});
		btnSend.setBounds(166, 175, 80, 32);
		contentPane.add(btnSend);
	}
}
