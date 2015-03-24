import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import Admin.AdminHome;
import HCP.HCPHome;
import patient.PatientHome;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frmInteractivePatientCare;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnNewButton;
	private JButton btnSystemAdminAccess;
	private JButton btnHealthCareProvider;
	private JButton btnLogin;
	private JLabel lblHealthCareProvider;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmInteractivePatientCare.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInteractivePatientCare = new JFrame();
		frmInteractivePatientCare.setTitle("Interactive Patient Care System Login");
		frmInteractivePatientCare.setBounds(100, 100, 650, 500);
		frmInteractivePatientCare.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInteractivePatientCare.getContentPane().setLayout(null);
		
		JLabel lblInteractivePatiientCare = new JLabel("Interactive Patient Care System Login");
		lblInteractivePatiientCare.setForeground(Color.GREEN);
		lblInteractivePatiientCare.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblInteractivePatiientCare.setBounds(125, 34, 450, 71);
		frmInteractivePatientCare.getContentPane().add(lblInteractivePatiientCare);
		
		textField = new JTextField();
		textField.setVisible(false);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(202, 288, 200, 50);
		frmInteractivePatientCare.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(202, 210, 200, 50);
		frmInteractivePatientCare.getContentPane().add(passwordField);
		
		JLabel lblUsername = new JLabel("Username: ");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUsername.setBounds(90, 146, 139, 39);
		frmInteractivePatientCare.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel(" Password: ");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPassword.setBounds(90, 221, 139, 39);
		frmInteractivePatientCare.getContentPane().add(lblPassword);
		
		btnNewButton = new JButton("Patient Access");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblHealthCareProvider.setVisible(false);
				textField.setVisible(false);
			}
		});
		btnNewButton.setBounds(100, 90, 180, 33);
		frmInteractivePatientCare.getContentPane().add(btnNewButton);
		
		btnSystemAdminAccess = new JButton("System Admin Login");
		btnSystemAdminAccess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminHome adminHome = new AdminHome();
				adminHome.setVisible(true);
			}
		});
		btnSystemAdminAccess.setBounds(412, 367, 180, 33);
		frmInteractivePatientCare.getContentPane().add(btnSystemAdminAccess);
		
		btnHealthCareProvider = new JButton("Health Care Provider Access\r\n");
		btnHealthCareProvider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblHealthCareProvider.setVisible(true);
				textField.setVisible(true);
			}
		});
		btnHealthCareProvider.setBounds(329, 90, 180, 33);
		frmInteractivePatientCare.getContentPane().add(btnHealthCareProvider);
		
		btnLogin = new JButton("Patient Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PatientHome patientHome = new PatientHome();
				patientHome.setVisible(true);
			}
		});
		btnLogin.setBounds(32, 367, 180, 33);
		frmInteractivePatientCare.getContentPane().add(btnLogin);
		
		lblHealthCareProvider = new JLabel("     HCP ID:");
		lblHealthCareProvider.setVisible(false);
		lblHealthCareProvider.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblHealthCareProvider.setBounds(90, 293, 139, 39);
		frmInteractivePatientCare.getContentPane().add(lblHealthCareProvider);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(202, 135, 200, 50);
		frmInteractivePatientCare.getContentPane().add(textField_1);
		
		JButton btnHealthCareProvider_1 = new JButton("Health Care Provider Login\r\n");
		btnHealthCareProvider_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HCPHome hcpHome = new HCPHome();
				hcpHome.setVisible(true);
			}
		});
		btnHealthCareProvider_1.setBounds(222, 367, 180, 33);
		frmInteractivePatientCare.getContentPane().add(btnHealthCareProvider_1);
		
		JButton btnForgotPassword = new JButton("Forgot Password?");
		btnForgotPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ForgotPass forgotPass = new ForgotPass();
				forgotPass.setVisible(true);
			}
		});
		btnForgotPassword.setBounds(222, 417, 180, 33);
		frmInteractivePatientCare.getContentPane().add(btnForgotPassword);
	}
}
