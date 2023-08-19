import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class DaryeelFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DaryeelFrame frame = new DaryeelFrame();
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
	public DaryeelFrame() {
		setTitle("Daryeel Macaamiil");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Wac daryeel Macaamiil 152");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel.setBounds(106, 67, 274, 70);
		contentPane.add(lblNewLabel);
		
		JLabel lblMahadsanid = new JLabel("MAHADSANID");
		lblMahadsanid.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblMahadsanid.setBounds(170, 103, 274, 70);
		contentPane.add(lblMahadsanid);
	}

}
