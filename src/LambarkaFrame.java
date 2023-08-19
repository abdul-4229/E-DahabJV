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

public class LambarkaFrame extends JFrame { 

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	main first = new main();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LambarkaFrame frame = new LambarkaFrame();
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
	public LambarkaFrame() {
		setTitle("Geli Lmabarka aad lacagta u dirir rabto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Fadlan Buuxi Lambarka Iyo lacagta");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(83, 23, 275, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("1. Lambarka");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(80, 60, 145, 21);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(83, 80, 224, 26);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("2. Lacagta");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(83, 108, 145, 21);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(86, 128, 224, 26);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_6_1 = new JLabel("Press 0 for man");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6_1.setBounds(93, 165, 171, 14);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("0 Previous");
		lblNewLabel_6_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6_1_1.setBounds(93, 182, 171, 14);
		contentPane.add(lblNewLabel_6_1_1);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setBounds(115, 207, 95, 32);
		contentPane.add(btnCancel);
		
		JButton btnSend = new JButton("SEND");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LacaghadalFrame frame = new LacaghadalFrame();
				String phone = (textField_1.getText());
				String money = (textField_2.getText());
				if (phone.isEmpty()&& money.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Fadlan Geli Lacagta Iyo Number ka");
				}else if (phone.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Fadlan Geli  Number ka");
				}else if (money.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Fadlan Geli  Lacagta ka");
				}else {
					double amount = Double.parseDouble(money);
					if (amount > first.balance) {
						JOptionPane.showMessageDialog(null, "Haraagaagu Kuma Filna" );
						textField_1.setText("");
						textField_2.setText("");
					}else if(amount <= 0) {
						JOptionPane.showMessageDialog(null, " Waan ku xunahay isticmaalkaagu waa qalad" );
						textField_1.setText("");
						textField_2.setText("");
					}else {
						double result = first.balance-amount;
						JOptionPane.showMessageDialog(null, "Waad Ku Guuleeyasaty in aad dirto" + phone  +" Lacag Dhan $" + money + " Haraagaagu waa " + result );
						textField_1.setText("");
						textField_2.setText("");
					}
					
				}	
				
			}
		});
		btnSend.setBounds(219, 207, 67, 32);
		contentPane.add(btnSend);
	}

}
