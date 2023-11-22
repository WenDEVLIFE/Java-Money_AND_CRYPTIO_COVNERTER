package Yen_To_Php;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

import MONEY_CONVERTER_MENU.money_menu;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Yen_To_Php {

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
					Yen_To_Php window = new Yen_To_Php();
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
	public Yen_To_Php() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWendevlifeMoneyConverter = new JFrame();
		frmWendevlifeMoneyConverter.setResizable(false);
		frmWendevlifeMoneyConverter.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\JAVA_ECLIPSE\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\money.png"));
		frmWendevlifeMoneyConverter.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 30));
		frmWendevlifeMoneyConverter.setTitle("WENDEVLIFE MONEY CONVERTER YEN TO PHP");
		frmWendevlifeMoneyConverter.getContentPane().setBackground(new Color(71, 74, 104));
		frmWendevlifeMoneyConverter.setBounds(100, 100, 1024, 720);
		frmWendevlifeMoneyConverter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWendevlifeMoneyConverter.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 64));
		panel.setBounds(0, 0, 1008, 77);
		frmWendevlifeMoneyConverter.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WENDEVLIFE MONEY CONVERTER ");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblNewLabel.setBounds(81, 0, 387, 77);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\money.png"));
		lblNewLabel_1.setBounds(10, 0, 73, 66);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(189, 155, 25));
		panel_1.setBounds(84, 173, 838, 439);
		frmWendevlifeMoneyConverter.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblYenToPhp = new JLabel("YEN TO PHP");
		lblYenToPhp.setBounds(409, 11, 159, 34);
		lblYenToPhp.setForeground(Color.WHITE);
		lblYenToPhp.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		panel_1.add(lblYenToPhp);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\coin.png"));
		lblNewLabel_2.setBounds(337, 0, 73, 64);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblEnterAAmount = new JLabel("ENTER A AMOUNT IN YEN");
		lblEnterAAmount.setForeground(Color.WHITE);
		lblEnterAAmount.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblEnterAAmount.setBounds(89, 90, 312, 34);
		panel_1.add(lblEnterAAmount);
		
		textField = new JTextField("0");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField.setBounds(395, 89, 343, 48);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField("0");
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(395, 179, 343, 48);
		panel_1.add(textField_1);
		
		JLabel lblPhpValueResult = new JLabel("PHP VALUE RESULT");
		lblPhpValueResult.setForeground(Color.WHITE);
		lblPhpValueResult.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblPhpValueResult.setBounds(157, 180, 229, 34);
		panel_1.add(lblPhpValueResult);
		
		JButton btnNewButton = new JButton("GET THE VALUE");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double yen = Double.parseDouble(textField.getText());
				double php = yen * 0.42;
				try {
					File file = new File("src\\yen.wav");
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
		btnNewButton.setBackground(new Color(0, 0, 64));
		btnNewButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnNewButton.setBounds(119, 359, 178, 54);
		panel_1.add(btnNewButton);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
				textField_1.setText("0");
			}
		});
		btnClear.setForeground(new Color(255, 255, 255));
		btnClear.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnClear.setBackground(new Color(0, 0, 64));
		btnClear.setBounds(370, 359, 178, 54);
		panel_1.add(btnClear);
		
		JButton btnBackToMenu = new JButton("BACK TO MENU");
		btnBackToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				money_menu window3 = new money_menu();
				window3.frmWendevlifemoneyconvertermoneymenu.setVisible(true);
				frmWendevlifeMoneyConverter.dispose();
			}
		});
		btnBackToMenu.setForeground(new Color(255, 255, 255));
		btnBackToMenu.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnBackToMenu.setBackground(new Color(0, 0, 64));
		btnBackToMenu.setBounds(615, 359, 178, 54);
		panel_1.add(btnBackToMenu);
	}

}
