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

public class AnigaFrame extends JFrame {

	private JPanel contentPane;
	private JTextField Input;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnigaFrame frame = new AnigaFrame();
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
	public AnigaFrame() {
		setTitle("Kaarka hadalka | Aniga");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Dooro Lambarka Operator-ka");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(117, 38, 275, 21);
		contentPane.add(lblNewLabel_1);
		
		Input = new JTextField();
		Input.setColumns(10);
		Input.setBounds(106, 165, 224, 26);
		contentPane.add(Input);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("0 Previous");
		lblNewLabel_6_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6_1_1.setBounds(127, 144, 171, 14);
		contentPane.add(lblNewLabel_6_1_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("Press 0 for man");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6_1.setBounds(127, 127, 171, 14);
		contentPane.add(lblNewLabel_6_1);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setBounds(127, 202, 95, 32);
		contentPane.add(btnCancel);
		
		JButton btnSend = new JButton("SEND");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AnigaFrame frame = new AnigaFrame();
				int userinput = Integer.parseInt(Input.getText());
				switch(userinput) {
				case 0:
					frame.dispose();
					KaarkahadalkaFrame menu = new KaarkahadalkaFrame();
					menu.setVisible(true);
				break;
				case 1:
					frame.dispose();
					LacaghadalFrame ani = new LacaghadalFrame();
					ani.setVisible(true);
				break;
				default:
					JOptionPane.showMessageDialog(null, "Invalid");
				break;
			}
			}
		});
		btnSend.setBounds(231, 202, 67, 32);
		contentPane.add(btnSend);
		
		JLabel lblNewLabel_1_1 = new JLabel("1.  RECHARGEEOPT");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(114, 75, 145, 21);
		contentPane.add(lblNewLabel_1_1);
	}

}
