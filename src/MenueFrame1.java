import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenueFrame1 extends JFrame {

	private JPanel contentPane;
	private JTextField doorotxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenueFrame1 frame = new MenueFrame1();
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
	public MenueFrame1() {
		setTitle("E-dahab Service");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fadlan Dooro:");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblNewLabel.setBounds(153, 11, 172, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1. Xisaabtaada");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(122, 43, 145, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2. U Wareeji");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(122, 67, 145, 21);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("3. Kaarka Hadalka");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(122, 88, 145, 21);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("4. Ku IIbso");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(122, 113, 145, 21);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("5. Lacag Bixid");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(122, 134, 145, 21);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("6. Dahabshiil Akoon");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(122, 160, 145, 14);
		contentPane.add(lblNewLabel_6);
		
		JButton btn1 = new JButton("OK");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenueFrame1 frame = new MenueFrame1();
				int userinput = Integer.parseInt(doorotxt.getText());
				switch(userinput) {
				case 1:
					frame.dispose();
					XisaabtadaFrame xisaab = new XisaabtadaFrame();
					xisaab.setVisible(true);
					break;
					
					default:
						JOptionPane.showMessageDialog(null, "Invalid");
					break;
				}
			}
		});
		btn1.setBounds(204, 227, 89, 23);
		contentPane.add(btn1);
		
		doorotxt = new JTextField();
		doorotxt.setBounds(180, 196, 144, 20);
		contentPane.add(doorotxt);
		doorotxt.setColumns(10);
	}

}
