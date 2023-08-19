import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WarbixinFrame extends JFrame {
	int pin = 1234;
	private JPanel contentPane;
	private JTextField input2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WarbixinFrame frame = new WarbixinFrame();
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
	public WarbixinFrame() {
		setTitle("Warbixin Kooban");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 326);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Geli Pin-ka si laguu tusiyo dhaqaaqyada uugu ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(91, 67, 333, 21);
		contentPane.add(lblNewLabel_1);
		
		input2 = new JTextField();
		input2.setColumns(10);
		input2.setBounds(147, 145, 144, 20);
		contentPane.add(input2);
		
		JButton btn1 = new JButton("OK");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WarbixinFrame frame = new WarbixinFrame();
				String userinput = input2.getText();
				switch(userinput) {
				case "1234":
					frame.dispose();
					WarbixinFrame2 menu = new WarbixinFrame2();
					menu.setVisible(true);
					break;
				case "0":
					frame.dispose();
					XisaabtadaFrame menue = new XisaabtadaFrame();
					menue.setVisible(true);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Pin-kaagu waa qalad");
				break;
				}
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn1.setBounds(187, 176, 57, 23);
		contentPane.add(btn1);
		
		JLabel subtitlelb = new JLabel("E-Dahab");
		subtitlelb.setForeground(new Color(0, 128, 0));
		subtitlelb.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		subtitlelb.setBounds(159, 16, 118, 49);
		contentPane.add(subtitlelb);
		
		JLabel lblNewLabel_1_1 = new JLabel("danbeeyay");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(185, 98, 92, 21);
		contentPane.add(lblNewLabel_1_1);
	}
}
