package EURO_TO_PHP;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JLabel;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;

import MONEY_CONVERTER_MENU.money_menu;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class EURO_TO_PHP {

	public JFrame frmWendevlifeMoneyConverter;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EURO_TO_PHP window = new EURO_TO_PHP();
					window.frmWendevlifeMoneyConverter.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EURO_TO_PHP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWendevlifeMoneyConverter = new JFrame();
		frmWendevlifeMoneyConverter.getContentPane().setBackground(new Color(71, 74, 104));
		frmWendevlifeMoneyConverter.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\JAVA_ECLIPSE\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\money.png"));
		frmWendevlifeMoneyConverter.setTitle("WENDEVLIFE MONEY CONVERTER POUNDS TO PHP");
		frmWendevlifeMoneyConverter.setBounds(100, 100, 1020, 720);
		frmWendevlifeMoneyConverter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWendevlifeMoneyConverter.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 64));
		panel.setBounds(0, 0, 1004, 69);
		frmWendevlifeMoneyConverter.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\money.png"));
		lblNewLabel.setBounds(10, 0, 88, 76);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("WENDEVLIFE MONEY CONVERTER");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(83, 0, 401, 65);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 160));
		panel_1.setBounds(86, 172, 816, 426);
		frmWendevlifeMoneyConverter.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("EURO TO PHP");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(397, 11, 173, 65);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\icons8-euro-sign-64.png"));
		lblNewLabel_2.setBounds(314, 11, 73, 65);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("ENTER A AMOUNT OF EURO");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblNewLabel_1_1_1.setBounds(93, 102, 321, 65);
		panel_1.add(lblNewLabel_1_1_1);
		
		textField = new JTextField("0");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField.setBounds(418, 107, 315, 52);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("PHP VALUE RESULT");
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblNewLabel_1_1_1_1.setBounds(182, 210, 226, 65);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		textField_1 = new JTextField("0");
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_1.setColumns(10);
		textField_1.setBounds(416, 215, 315, 52);
		panel_1.add(textField_1);
		
		JButton btnNewButton = new JButton("GET THE VALUE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double euro = Double.parseDouble(textField.getText());
				double php = euro * 59.04;
				try {
					File file = new File("src\\EURO.wav");
					AudioInputStream audio = AudioSystem.getAudioInputStream(file);
					Clip clip = AudioSystem.getClip();
					clip.open(audio);
						textField_1.setText(""+php);
						clip.start();
						
						
					
				}
			
				
				catch(LineUnavailableException e1) {
					e1.printStackTrace();			
				}
				catch(UnsupportedAudioFileException e1) {
					e1.printStackTrace();
				}
				catch(IOException e1) {
					e1.printStackTrace();
				}
			
			}
		});
		btnNewButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnNewButton.setBackground(new Color(0, 0, 64));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(63, 335, 173, 57);
		panel_1.add(btnNewButton);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
				textField_1.setText("0");
			}
		});
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnClear.setBackground(new Color(0, 0, 64));
		btnClear.setBounds(334, 335, 173, 57);
		panel_1.add(btnClear);
		
		JButton btnBackToMenu = new JButton("BACK TO MENU");
		btnBackToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				money_menu window3 = new money_menu();
				window3.frmWendevlifemoneyconvertermoneymenu.setVisible(true);
				frmWendevlifeMoneyConverter.dispose();
			}
		});
		btnBackToMenu.setForeground(Color.WHITE);
		btnBackToMenu.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnBackToMenu.setBackground(new Color(0, 0, 64));
		btnBackToMenu.setBounds(587, 335, 173, 57);
		panel_1.add(btnBackToMenu);
	}
}

