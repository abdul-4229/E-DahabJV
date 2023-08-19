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

public class KaarkahadalkaFrame extends JFrame {

	private JPanel contentPane;
	private JTextField input;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KaarkahadalkaFrame frame = new KaarkahadalkaFrame();
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
	public KaarkahadalkaFrame() {
		setTitle("Kaarka Hadalka");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_6_1 = new JLabel("Press 0 for man");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6_1.setBounds(117, 136, 171, 14);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("0 Previous");
		lblNewLabel_6_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6_1_1.setBounds(117, 153, 171, 14);
		contentPane.add(lblNewLabel_6_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("2.Qof Kale");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(117, 67, 145, 21);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("1.  Aniga");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(117, 43, 145, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Fadlan Dooro:");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblNewLabel.setBounds(148, 11, 172, 21);
		contentPane.add(lblNewLabel);
		
		input = new JTextField();
		input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		input.setColumns(10);
		input.setBounds(96, 174, 224, 26);
		contentPane.add(input);
		
		JButton btnSend = new JButton("SEND");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KaarkahadalkaFrame frame = new KaarkahadalkaFrame();
				int userinput = Integer.parseInt(input.getText());
				switch(userinput) {
				case 0:
					frame.dispose();
					MenueFrame1 menu = new MenueFrame1();
					menu.setVisible(true);
				break;
				case 1:
					frame.dispose();
					AnigaFrame ani = new AnigaFrame();
					ani.setVisible(true);
				break;
				default:
					JOptionPane.showMessageDialog(null, "Invalid");
				break;
			}
			}
		});
		btnSend.setBounds(221, 211, 67, 32);
		contentPane.add(btnSend);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setBounds(117, 211, 95, 32);
		contentPane.add(btnCancel);
	}

}
