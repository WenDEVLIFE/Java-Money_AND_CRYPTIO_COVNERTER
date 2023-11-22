package USD_TO_PHP;

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
import java.awt.Toolkit;
import javax.swing.JTextField;

import MONEY_CONVERTER_MENU.money_menu;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class USD_TO_PHP {

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
					USD_TO_PHP window = new USD_TO_PHP();
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
	public USD_TO_PHP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWendevlifeMoneyConverter = new JFrame();
		frmWendevlifeMoneyConverter.setResizable(false);
		frmWendevlifeMoneyConverter.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\JAVA_ECLIPSE\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\money.png"));
		frmWendevlifeMoneyConverter.setTitle("WENDEVLIFE MONEY CONVERTER USD TO PHP");
		frmWendevlifeMoneyConverter.setFont(new Font("Cambria", Font.PLAIN, 30));
		frmWendevlifeMoneyConverter.getContentPane().setBackground(new Color(71, 74, 104));
		frmWendevlifeMoneyConverter.setBounds(100, 100, 1020, 720);
		frmWendevlifeMoneyConverter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWendevlifeMoneyConverter.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 64));
		panel.setBounds(0, 0, 1004, 79);
		frmWendevlifeMoneyConverter.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WENDEVLIFE MONEY CONVERTER");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblNewLabel.setBounds(86, 0, 425, 79);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\money.png"));
		lblNewLabel_1.setBounds(10, 0, 83, 79);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 64));
		panel_1.setBounds(102, 169, 802, 422);
		frmWendevlifeMoneyConverter.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblUsdToPhp = new JLabel("USD TO PHP");
		lblUsdToPhp.setForeground(Color.WHITE);
		lblUsdToPhp.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblUsdToPhp.setBounds(338, 0, 144, 79);
		panel_1.add(lblUsdToPhp);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\dollar-symbol (1).png"));
		lblNewLabel_2.setBounds(282, -11, 62, 90);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblEnterTheAmount = new JLabel("ENTER THE AMOUNT OF USD");
		lblEnterTheAmount.setForeground(Color.WHITE);
		lblEnterTheAmount.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblEnterTheAmount.setBounds(50, 90, 327, 79);
		panel_1.add(lblEnterTheAmount);
		
		textField = new JTextField("0");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField.setBounds(379, 90, 368, 62);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblPhpValueResult = new JLabel("PHP VALUE RESULT");
		lblPhpValueResult.setForeground(Color.WHITE);
		lblPhpValueResult.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblPhpValueResult.setBounds(153, 192, 224, 79);
		panel_1.add(lblPhpValueResult);
		
		textField_1 = new JTextField("0");
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_1.setColumns(10);
		textField_1.setEditable(false);
		textField_1.setBounds(379, 199, 368, 62);
		panel_1.add(textField_1);
		
		JButton btnNewButton = new JButton("BACK TO MENU");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				money_menu window3 = new money_menu();
				window3.frmWendevlifemoneyconvertermoneymenu.setVisible(true);
				frmWendevlifeMoneyConverter.dispose();
				
			}
		});
		btnNewButton.setBackground(new Color(0, 0, 64));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(570, 326, 177, 67);
		panel_1.add(btnNewButton);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
				textField_1.setText("0");
			}
		});
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnClear.setBackground(new Color(0, 0, 64));
		btnClear.setBounds(319, 326, 177, 67);
		panel_1.add(btnClear);
		
		JButton btnGetTheValue = new JButton("GET THE VALUE");
		btnGetTheValue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==btnGetTheValue) {
					double usd = Double.parseDouble(textField.getText());
					double php = usd * 56.805;
					try {
						File file = new File("src\\php.wav");
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
				
			}
		});
		btnGetTheValue.setForeground(Color.WHITE);
		btnGetTheValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnGetTheValue.setBackground(new Color(0, 0, 64));
		btnGetTheValue.setBounds(76, 326, 177, 67);
		panel_1.add(btnGetTheValue);
	}
}
