package tuto;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Exemple {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws Exception{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//apllique un look
					UIManager.setLookAndFeel(new NimbusLookAndFeel());
					Exemple window = new Exemple();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Exemple() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		//frame.setBounds(100, 100, 450, 300);
		frame.setSize(600,400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLayout(null);
		JPanel contentPane = (JPanel) frame.getContentPane();
		
		JButton btnZe =new JButton("0");
		contentPane.add(btnZe);
		
		contentPane.add(new JTextField("Edit me"));
		contentPane.add(new JButton("1"));
		contentPane.add(new JButton("2"));
		contentPane.add(new JButton("3"));
		contentPane.add(new JButton("4"));
		contentPane.add(new JButton("5"));
		contentPane.add(new JButton("6"));
		contentPane.add(new JButton("7"));
		contentPane.add(new JButton("8"));
		contentPane.add(new JButton("9"));
		contentPane.add(new JButton("+"));
		contentPane.add(new JButton("-"));
		
	}

}
