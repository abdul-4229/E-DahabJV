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

public class XisaabtadaFrame extends JFrame {

	private JPanel contentPane;
	private JTextField input1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					XisaabtadaFrame frame = new XisaabtadaFrame();
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
	public XisaabtadaFrame() {
		setTitle("xisaabtaada");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fadlan Dooro:");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblNewLabel.setBounds(140, 11, 172, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1.  I tus Haraaga");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(109, 43, 145, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2. Warbixin Kooban");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(109, 67, 145, 21);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("3. Badel PIN ka");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(109, 88, 145, 21);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("4. Badel Luuqada");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(109, 113, 145, 21);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("5. Liiska Magacyada");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(109, 134, 145, 21);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("6. Daryeelka Macaamiisha");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(109, 160, 171, 14);
		contentPane.add(lblNewLabel_6);
		
		input1 = new JTextField();
		input1.setColumns(10);
		input1.setBounds(171, 227, 144, 20);
		contentPane.add(input1);
		
		JButton btn1 = new JButton("OK");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XisaabtadaFrame frame = new XisaabtadaFrame();
				int userinput = Integer.parseInt(input1.getText());
				switch(userinput) {
				case 0:
					frame.dispose();
					MenueFrame1 menue = new MenueFrame1();
					menue.setVisible(true);
					
					break;
				case 1:
					  frame.dispose();
					  HaraaFrame haraa = new HaraaFrame();
					  haraa.setVisible(true);
					break;
					
					
				default:
					JOptionPane.showMessageDialog(null, "Invalid");
				break;
				
				}
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn1.setBounds(218, 258, 57, 23);
		contentPane.add(btn1);
		
		JLabel lblNewLabel_6_1 = new JLabel("Press 0 for man");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6_1.setBounds(109, 185, 171, 14);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("0 Next");
		lblNewLabel_6_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6_1_1.setBounds(109, 202, 171, 14);
		contentPane.add(lblNewLabel_6_1_1);
	}

}
