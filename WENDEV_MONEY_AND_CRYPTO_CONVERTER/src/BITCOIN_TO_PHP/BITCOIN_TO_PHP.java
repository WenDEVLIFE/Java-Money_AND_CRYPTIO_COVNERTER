package BITCOIN_TO_PHP;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.UIManager;

import CRYPTO_MENU.CRYPTO_MENU;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class BITCOIN_TO_PHP {

	public JFrame frmWendevlifemoneyconverterbtctophp;
	private JTextField textField_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BITCOIN_TO_PHP window = new BITCOIN_TO_PHP();
					window.frmWendevlifemoneyconverterbtctophp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BITCOIN_TO_PHP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmWendevlifemoneyconverterbtctophp = new JFrame();
		frmWendevlifemoneyconverterbtctophp.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Programming\\Eclipseproject\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\money.png"));
		frmWendevlifemoneyconverterbtctophp.setResizable(false);
		frmWendevlifemoneyconverterbtctophp.getContentPane().setBackground(new Color(71, 78, 104));
		frmWendevlifemoneyconverterbtctophp.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(0, 0, 64));
		panel.setBounds(0, 0, 1008, 67);
		frmWendevlifemoneyconverterbtctophp.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\Programming\\Eclipseproject\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\money.png"));
		lblNewLabel.setBounds(10, 11, 105, 56);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("WENDEV MONEY CONVERTER");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(83, 11, 349, 35);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(UIManager.getBorder("DesktopIcon.border"));
		panel_1.setBackground(new Color(255, 128, 64));
		panel_1.setBounds(67, 159, 887, 426);
		frmWendevlifemoneyconverterbtctophp.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("BTC TO USD");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(399, 22, 153, 35);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Programming\\Eclipseproject\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\bitcoin.png"));
		lblNewLabel_2.setBounds(323, 11, 66, 64);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("ENTER YOUR  AMOUNT IN BTC");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblNewLabel_1_1_1.setBounds(53, 95, 365, 35);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("PHP VALUE");
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblNewLabel_1_1_1_1.setBounds(259, 205, 153, 35);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		textField_1 = new JTextField("0");
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_1.setColumns(10);
		textField_1.setEditable(false);
		textField_1.setBounds(422, 196, 320, 64);
		panel_1.add(textField_1);
		
		JButton btnNewButton = new JButton("Get the Value");
		btnNewButton.setBackground(new Color(0, 0, 64));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (e.getSource()==btnNewButton) {
					double b = Double.parseDouble(textField.getText());
					double php = b * 1137678.00;
					try {
						File file = new File("src\\BTC.wav");
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
		btnNewButton.setBounds(53, 326, 235, 77);
		panel_1.add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnClear ) {
					textField.setText("0");
					textField_1.setText("0");
				}
			}
		});
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnClear.setBackground(new Color(0, 0, 64));
		btnClear.setBounds(338, 326, 239, 77);
		panel_1.add(btnClear);
		
		JButton btnBackToMenu = new JButton("Back to menu");
		btnBackToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnBackToMenu) {
					CRYPTO_MENU window = new CRYPTO_MENU();
					window.frmWendevlifemoneyconvertercryptoconverter.setVisible(true);
					frmWendevlifemoneyconverterbtctophp.dispose();
				}
			}
		});
		btnBackToMenu.setForeground(Color.WHITE);
		btnBackToMenu.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnBackToMenu.setBackground(new Color(0, 0, 64));
		btnBackToMenu.setBounds(626, 329, 222, 77);
		panel_1.add(btnBackToMenu);
		
		textField = new JTextField("0");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField.setColumns(10);
		textField.setBounds(422, 86, 320, 64);
		panel_1.add(textField);
		frmWendevlifemoneyconverterbtctophp.setTitle("WENDEVLIFE_MONEY_CONVERTER_BTC_TO_PHP");
		frmWendevlifemoneyconverterbtctophp.setBounds(100, 100, 1024, 720);
		frmWendevlifemoneyconverterbtctophp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
