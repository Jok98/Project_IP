package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Lost_password {

	private JFrame frmLostpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lost_password window = new Lost_password();
					window.frmLostpassword.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Lost_password() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLostpassword = new JFrame();
		frmLostpassword.setTitle("Lost_Password");
		frmLostpassword.setBounds(100, 100, 450, 300);
		frmLostpassword.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
