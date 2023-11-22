package DOGE_TO_PHP;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;

import CRYPTO_MENU.CRYPTO_MENU;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class DOGE_TO_PHP {

	public JFrame frmWendevlifemoneyconverterdogetophp;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DOGE_TO_PHP window = new DOGE_TO_PHP();
					window.frmWendevlifemoneyconverterdogetophp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DOGE_TO_PHP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWendevlifemoneyconverterdogetophp = new JFrame();
		frmWendevlifemoneyconverterdogetophp.setTitle("WENDEVLIFE_MONEY_CONVERTER_DOGE_TO_PHP");
		frmWendevlifemoneyconverterdogetophp.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\JAVA_ECLIPSE\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\money.png"));
		frmWendevlifemoneyconverterdogetophp.getContentPane().setBackground(new Color(71, 78, 104));
		frmWendevlifemoneyconverterdogetophp.setBounds(100, 100, 1024, 720);
		frmWendevlifemoneyconverterdogetophp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWendevlifemoneyconverterdogetophp.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 64));
		panel.setBounds(0, 0, 1008, 74);
		frmWendevlifemoneyconverterdogetophp.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\money.png"));
		lblNewLabel.setBounds(20, 11, 64, 63);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("WENDEVLIFE MONEY CONVERTER");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(94, 0, 474, 74);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(225, 179, 3));
		panel_1.setBounds(145, 158, 794, 440);
		frmWendevlifemoneyconverterdogetophp.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("DOGE TO PHP");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(297, 0, 188, 74);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\dogecoin.png"));
		lblNewLabel_2.setBounds(230, 11, 77, 58);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("ENTER THE AMOUNT OF DOGE");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblNewLabel_1_1_1.setBounds(10, 88, 355, 74);
		panel_1.add(lblNewLabel_1_1_1);
		
		textField = new JTextField("0");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField.setBounds(367, 93, 331, 58);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField("0");
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_1.setColumns(10);
		textField_1.setBounds(367, 204, 331, 58);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("PHP VALUE");
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblNewLabel_1_1_1_1.setBounds(214, 190, 142, 74);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		JButton btnNewButton = new JButton("GET THE VALUE");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 64));
		btnNewButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==btnNewButton) {
					double doge = Double.parseDouble(textField.getText());
					
					double php = doge * 4.64;
					try {
						File file = new File("src\\DOGE.wav");
						AudioInputStream audio = AudioSystem.getAudioInputStream(file);
						Clip clip = AudioSystem.getClip();
						clip.open(audio);
						if (e.getSource()==btnNewButton) {
							textField_1.setText(""+php);
							clip.start();
							
							
							
						}
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
			}
		});
		btnNewButton.setBounds(78, 335, 181, 74);
		panel_1.add(btnNewButton);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==btnClear) {
					textField.setText("0");
					textField_1.setText("0");
				}
			}
		});
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnClear.setBackground(new Color(0, 0, 64));
		btnClear.setBounds(325, 335, 181, 74);
		panel_1.add(btnClear);
		
		JButton btnBackToMenu = new JButton("BACK TO MENU");
		btnBackToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==btnBackToMenu) {
					CRYPTO_MENU window = new CRYPTO_MENU();
					window.frmWendevlifemoneyconvertercryptoconverter.setVisible(true);
					frmWendevlifemoneyconverterdogetophp.dispose();
				}
				
			}
		});
		btnBackToMenu.setForeground(Color.WHITE);
		btnBackToMenu.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnBackToMenu.setBackground(new Color(0, 0, 64));
		btnBackToMenu.setBounds(571, 335, 181, 74);
		panel_1.add(btnBackToMenu);
	}

}
