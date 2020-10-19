package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Registration_frame {
	
	public Main_frame MN_frm ;
	public JFrame frmRegistratione;
	private JTextField tf_Nome;
	private JTextField tf_Cognome;
	private JTextField tf_Nickname;
	private JTextField tf_email;
	private JTextField tf_password;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration_frame window = new Registration_frame();
					window.frmRegistratione.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registration_frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistratione = new JFrame();
		frmRegistratione.setTitle("Registratione");
		frmRegistratione.setBounds(100, 100, 450, 300);
		frmRegistratione.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistratione.getContentPane().setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main_frame.turn_back();
			}
		});
		btnBack.setBounds(335, 227, 89, 23);
		frmRegistratione.getContentPane().add(btnBack);
		
		JLabel lblNome = new JLabel("Nome :");
		lblNome.setBounds(10, 11, 46, 14);
		frmRegistratione.getContentPane().add(lblNome);
		
		JLabel lblCognome = new JLabel("Cognome :");
		lblCognome.setBounds(10, 36, 67, 14);
		frmRegistratione.getContentPane().add(lblCognome);
		
		JLabel lblNickname = new JLabel("Nickname :");
		lblNickname.setBounds(10, 61, 67, 14);
		frmRegistratione.getContentPane().add(lblNickname);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setBounds(10, 86, 46, 14);
		frmRegistratione.getContentPane().add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setBounds(10, 111, 67, 14);
		frmRegistratione.getContentPane().add(lblPassword);
		
		tf_Nome = new JTextField();
		tf_Nome.setBounds(76, 11, 86, 20);
		frmRegistratione.getContentPane().add(tf_Nome);
		tf_Nome.setColumns(10);
		
		tf_Cognome = new JTextField();
		tf_Cognome.setBounds(76, 36, 86, 20);
		frmRegistratione.getContentPane().add(tf_Cognome);
		tf_Cognome.setColumns(10);
		
		tf_Nickname = new JTextField();
		tf_Nickname.setBounds(76, 61, 86, 20);
		frmRegistratione.getContentPane().add(tf_Nickname);
		tf_Nickname.setColumns(10);
		
		tf_email = new JTextField();
		tf_email.setBounds(76, 86, 86, 20);
		frmRegistratione.getContentPane().add(tf_email);
		tf_email.setColumns(10);
		
		tf_password = new JTextField();
		tf_password.setBounds(76, 111, 86, 20);
		frmRegistratione.getContentPane().add(tf_password);
		tf_password.setColumns(10);
		
		JButton btnIscriviti = new JButton("Iscriviti");
		btnIscriviti.setBounds(172, 227, 89, 23);
		frmRegistratione.getContentPane().add(btnIscriviti);
	}
}
