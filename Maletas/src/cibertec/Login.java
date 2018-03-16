package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class Login extends JDialog implements ActionListener, MouseListener {
	private JTextField txtUser;
	private JButton btnIniciar;
	private JLabel lblMensaje;
	private JSeparator separator;
	private JSeparator separator_1;
	private JPasswordField txtPass;
	private JLabel label;
	private JLabel label_1;
	private JLabel lblLogin;
	private JLabel lblolvidoContraea;
	private JLabel label_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login dialog = new Login();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Login() {
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().setBackground(new Color(255, 255, 255));
		setBounds(100, 100, 529, 338);
		getContentPane().setLayout(null);
		
		txtUser = new JTextField();
		txtUser.setBounds(185, 92, 86, 20);
		getContentPane().add(txtUser);
		txtUser.setColumns(10);
		txtUser.setBorder(null);
		txtUser.setOpaque(false);
		
		btnIniciar = new JButton("Iniciar");
		btnIniciar.setForeground(new Color(240, 255, 255));
		btnIniciar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnIniciar.setBackground(new Color(0, 128, 0));
		btnIniciar.addActionListener(this);
		btnIniciar.setBounds(367, 199, 97, 32);
		getContentPane().add(btnIniciar);
		
		lblMensaje = new JLabel("");
		lblMensaje.setForeground(new Color(128, 128, 128));
		lblMensaje.setBounds(159, 199, 176, 20);
		getContentPane().add(lblMensaje);
		
		separator = new JSeparator();
		separator.setForeground(new Color(128, 128, 128));
		separator.setBounds(185, 183, 163, 2);
		getContentPane().add(separator);
		
		separator_1 = new JSeparator();
		separator_1.setForeground(new Color(128, 128, 128));
		separator_1.setBounds(185, 110, 163, 2);
		getContentPane().add(separator_1);
		
		
		txtPass = new JPasswordField();
		txtPass.setBounds(185, 162, 86, 20);
		getContentPane().add(txtPass);
		txtPass.setBorder(null);
		txtPass.setOpaque(false);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(Login.class.getResource("/imagenes/user-.png")));
		label.setBounds(133, 80, 46, 32);
		getContentPane().add(label);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Login.class.getResource("/imagenes/pass.png")));
		label_1.setBounds(133, 147, 46, 41);
		getContentPane().add(label_1);
		
		lblLogin = new JLabel("Login");
		lblLogin.addMouseListener(this);
		lblLogin.setForeground(new Color(128, 128, 128));
		lblLogin.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
		lblLogin.setBounds(185, 11, 86, 34);
		getContentPane().add(lblLogin);
		
		lblolvidoContraea = new JLabel("\u00BFOlvido Contrae\u00F1a?");
		lblolvidoContraea.addMouseListener(this);
		lblolvidoContraea.setForeground(new Color(0, 128, 0));
		lblolvidoContraea.setBounds(367, 240, 117, 20);
		getContentPane().add(lblolvidoContraea);
		
		label_2 = new JLabel("");
		label_2.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 12));
		label_2.setForeground(new Color(0, 0, 0));
		label_2.setBounds(367, 257, 134, 20);
		getContentPane().add(label_2);

	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnIniciar) {
			actionPerformedBtnIniciar(arg0);
		}
	}
	protected void actionPerformedBtnIniciar(ActionEvent arg0) {
			
		String pass=txtPass.getText();
		String user= txtUser.getText();
		
			if ((user.equals(BaseDatos.admin))&&(pass.equals(BaseDatos.passAdmin))){
				MenuSuperAdmin ven = new MenuSuperAdmin();
				ven.setVisible(true);
				setVisible(false);
				
			}
			else{
					if ((user.equals(BaseDatos.superAdmin))&&(pass.equals(BaseDatos.passSuperAdmin))){
						MenuSuperAdmin ven = new MenuSuperAdmin();
						ven.setVisible(true);
						setVisible(false);
						}
					else{
						if ((user.equals(BaseDatos.vendedor1))&&(pass.equals(BaseDatos.passVendedor1))){
							MenuAdmin ven = new MenuAdmin();
							ven.setVisible(true);
							setVisible(false);							
						}
						else {
							if ((user.equals(BaseDatos.vendedor2))&&(pass.equals(BaseDatos.passVendedor2))){
								MenuAdmin ven = new MenuAdmin();
								ven.setVisible(true);
								setVisible(false);
								}
							else{
								lblMensaje.setText("No son los datos correctos.");
							}
						}
						
					}
				}
			}
		
	public void mouseClicked(MouseEvent arg0) {
		if (arg0.getSource() == lblolvidoContraea) {
			mouseClickedLblolvidoContraea(arg0);
		}
	}
	public void mouseEntered(MouseEvent arg0) {
		if (arg0.getSource() == lblLogin) {
			mouseEnteredLblLogin(arg0);
		}
		if (arg0.getSource() == lblolvidoContraea) {
			mouseEnteredLblLogin(arg0);
			lblolvidoContraea.setForeground(new Color(0, 0, 0));
			lblolvidoContraea.setOpaque(false);
		}
	}
	public void mouseExited(MouseEvent arg0) {
		if (arg0.getSource() == lblolvidoContraea) {
			mouseEnteredLblLogin(arg0);
			lblolvidoContraea.setForeground(new Color(0, 128, 0));
			lblolvidoContraea.setOpaque(true);
		}
	}
	public void mousePressed(MouseEvent arg0) {
	}
	public void mouseReleased(MouseEvent arg0) {
	}
	protected void mouseClickedLblolvidoContraea(MouseEvent arg0) {
		label_2.setText("Llamanos:    01 345 776");
	}
	protected void mouseEnteredLblLogin(MouseEvent arg0) {
	}
	}

