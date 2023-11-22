package ETH_TO_PHP;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;

import CRYPTO_MENU.CRYPTO_MENU;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class ETH_TO_PHP {

	public JFrame frmWendevlifemoneyconverterethtophp;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ETH_TO_PHP window = new ETH_TO_PHP();
					window.frmWendevlifemoneyconverterethtophp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ETH_TO_PHP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWendevlifemoneyconverterethtophp = new JFrame();
		frmWendevlifemoneyconverterethtophp.getContentPane().setBackground(new Color(71, 78, 104));
		frmWendevlifemoneyconverterethtophp.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\JAVA_ECLIPSE\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\money.png"));
		frmWendevlifemoneyconverterethtophp.setTitle("WENDEVLIFE_MONEY_CONVERTER_ETH_TO_PHP");
		frmWendevlifemoneyconverterethtophp.setBounds(100, 100, 1024, 720);
		frmWendevlifemoneyconverterethtophp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWendevlifemoneyconverterethtophp.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 64));
		panel.setBounds(0, 0, 1008, 64);
		frmWendevlifemoneyconverterethtophp.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\money.png"));
		lblNewLabel.setBounds(20, 5, 119, 59);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("WENDEVLIFE MONEY CONVERTER");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(89, 5, 456, 59);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(UIManager.getBorder("SplitPane.border"));
		panel_1.setBackground(new Color(60, 60, 61));
		panel_1.setBounds(104, 156, 804, 424);
		frmWendevlifemoneyconverterethtophp.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("ETH TO PHP");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(360, 11, 152, 59);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\ethereum.png"));
		lblNewLabel_2.setBounds(298, 0, 78, 74);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("ENTER A AMOUNT IN ETH");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblNewLabel_1_1_1.setBounds(94, 90, 303, 59);
		panel_1.add(lblNewLabel_1_1_1);
		
		textField = new JTextField("0");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField.setBounds(398, 96, 314, 59);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("PHP VALUE");
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblNewLabel_1_1_1_1.setBounds(240, 195, 144, 59);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		textField_1 = new JTextField("0");
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_1.setColumns(10);
		textField_1.setBounds(398, 195, 314, 59);
		panel_1.add(textField_1);
		
		JButton btnNewButton = new JButton("GET THE VALUE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==btnNewButton) {
					double eth = Double.parseDouble(textField.getText());
					double php = eth * 84141.80; 
					try {
						File file = new File("src\\ETH.wav");
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
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnNewButton.setBackground(new Color(0, 0, 64));
		btnNewButton.setBounds(71, 324, 183, 74);
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
		btnClear.setForeground(new Color(255, 255, 255));
		btnClear.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnClear.setBackground(new Color(0, 0, 64));
		btnClear.setBounds(320, 324, 183, 74);
		panel_1.add(btnClear);
		
		JButton btnBackToMenu = new JButton("BACK TO MENU");
		btnBackToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==btnBackToMenu) {
					CRYPTO_MENU window = new CRYPTO_MENU();
					window.frmWendevlifemoneyconvertercryptoconverter.setVisible(true);
					frmWendevlifemoneyconverterethtophp.dispose();
				}
			}
		});
		btnBackToMenu.setForeground(new Color(255, 255, 255));
		btnBackToMenu.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnBackToMenu.setBackground(new Color(0, 0, 64));
		btnBackToMenu.setBounds(570, 324, 183, 74);
		panel_1.add(btnBackToMenu);
	}

}
