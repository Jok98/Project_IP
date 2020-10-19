package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main_frame {
	public Main_frame MN_frm ;
	public static Registration_frame RG_frm = new Registration_frame() ;
	public static JFrame frmIp;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_frame window = new Main_frame();
					window.frmIp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main_frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIp = new JFrame();
		frmIp.setTitle("IP");
		frmIp.setBounds(100, 100, 450, 300);
		frmIp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIp.getContentPane().setLayout(null);
		
		JButton btnLogIn = new JButton("LogIn");
		btnLogIn.setBounds(163, 227, 89, 23);
		frmIp.getContentPane().add(btnLogIn);
		
		JButton btnRegistration = new JButton("Registrazione");
		btnRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RG_frm.frmRegistratione.setVisible(true);
				frmIp.setVisible(false);
			}
		});
		btnRegistration.setBounds(10, 227, 116, 23);
		frmIp.getContentPane().add(btnRegistration);
		
		JButton btnLostPassword = new JButton("Password dimenticata ?");
		btnLostPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnLostPassword.setBounds(279, 227, 145, 23);
		frmIp.getContentPane().add(btnLostPassword);
	}
	
	public static void turn_back() {
		Main_frame.frmIp.setVisible(true);
		RG_frm.frmRegistratione.setVisible(false);
		}
}
