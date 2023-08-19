import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KuiibsoFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KuiibsoFrame frame = new KuiibsoFrame();
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
	public KuiibsoFrame() {
		setTitle("Ku iibso");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fadlan Dooro:");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblNewLabel.setBounds(132, 11, 172, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1. Ku iibso");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(116, 43, 145, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2. Bixi fee ama biil");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(116, 67, 145, 21);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Press 0 for main menu and * for previous menu");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(65, 126, 301, 21);
		contentPane.add(lblNewLabel_2_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(116, 158, 172, 36);
		contentPane.add(textField);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setBounds(116, 205, 95, 32);
		contentPane.add(btnCancel);
		
		JButton btnSend = new JButton("SEND");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KuiibsoFrame frame = new KuiibsoFrame();
				int userinput = Integer.parseInt(textField.getText());
				switch(userinput) {
				case 0:
					frame.dispose();
					MenueFrame1 xisaab = new MenueFrame1();
					xisaab.setVisible(true);
					break;
				case 1:
					frame.dispose();
					Ku_iibso_sendFrame send = new Ku_iibso_sendFrame();
					send.setVisible(true);
					break;
				case 2:
					frame.dispose();
					Ku_iibso_sendFrame send2 = new Ku_iibso_sendFrame();
					send2.setVisible(true);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Invalid");
				break;
			}
			}		
		});
		btnSend.setBounds(220, 205, 67, 32);
		contentPane.add(btnSend);
	}

}
