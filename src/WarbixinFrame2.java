import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WarbixinFrame2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WarbixinFrame2 frame = new WarbixinFrame2();
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
	public WarbixinFrame2() {
		setTitle("Warbixin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel subtitlelb = new JLabel("E-Dahab");
		subtitlelb.setForeground(new Color(0, 128, 0));
		subtitlelb.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		subtitlelb.setBounds(159, 22, 118, 49);
		contentPane.add(subtitlelb);
		
		JLabel lblNewLabel_1 = new JLabel("U wareejin ta u danbeesay waxaa lacag u dirtay ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(91, 73, 333, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("danbeeyay");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(185, 105, 92, 21);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel = new JLabel("MAHADSANID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(177, 148, 126, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WarbixinFrame2 frame = new WarbixinFrame2();
				frame.dispose();
				XisaabtadaFrame xframe = new XisaabtadaFrame();
				xframe.setVisible(true);
			}
		});
		btnNewButton.setBounds(172, 189, 89, 23);
		contentPane.add(btnNewButton);
	}

}
