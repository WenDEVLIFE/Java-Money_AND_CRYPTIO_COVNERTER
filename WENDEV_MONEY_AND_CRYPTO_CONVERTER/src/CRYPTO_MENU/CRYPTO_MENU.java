package CRYPTO_MENU;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import BITCOIN_TO_PHP.BITCOIN_TO_PHP;
import DOGE_TO_PHP.DOGE_TO_PHP;
import ETH_TO_PHP.ETH_TO_PHP;
import MONEY_CONVERTER_MENU.money_menu;
import main_menu.Main_menu;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CRYPTO_MENU {

	public JFrame frmWendevlifemoneyconvertercryptoconverter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CRYPTO_MENU window = new CRYPTO_MENU();
					window.frmWendevlifemoneyconvertercryptoconverter.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CRYPTO_MENU() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWendevlifemoneyconvertercryptoconverter = new JFrame();
		frmWendevlifemoneyconvertercryptoconverter.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\JAVA_ECLIPSE\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\money.png"));
		frmWendevlifemoneyconvertercryptoconverter.setTitle("WENDEVLIFE_MONEY_CONVERTER_CRYPTO_CONVERTER");
		frmWendevlifemoneyconvertercryptoconverter.getContentPane().setBackground(new Color(71, 78, 104));
		frmWendevlifemoneyconvertercryptoconverter.setBounds(100, 100, 1024, 720);
		frmWendevlifemoneyconvertercryptoconverter.setResizable(false);
		frmWendevlifemoneyconvertercryptoconverter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWendevlifemoneyconvertercryptoconverter.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 64));
		panel.setBounds(0, 0, 1008, 69);
		frmWendevlifemoneyconvertercryptoconverter.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WENDEVLIFE MONEY CONVERTER");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblNewLabel.setBounds(93, 11, 413, 57);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\money.png"));
		lblNewLabel_1.setBounds(20, 0, 95, 68);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 0));
		panel_1.setBounds(78, 163, 854, 424);
		frmWendevlifemoneyconvertercryptoconverter.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 64, 128));
		panel_2.setBounds(36, 90, 174, 187);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\bitcoin.png"));
		lblNewLabel_2.setBounds(47, 11, 94, 64);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("    BITCOIN TO PHP");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			public  void setColor (JPanel panel_2) {
				panel_2.setBackground(new Color (237, 231, 225));
			}
			public  void resetColor (JPanel pl3) {
				panel_2.setBackground(new Color (0, 64, 128));
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				setColor(panel_2);
				BITCOIN_TO_PHP window = new BITCOIN_TO_PHP();
				window.frmWendevlifemoneyconverterbtctophp.setVisible(true);
				frmWendevlifemoneyconvertercryptoconverter.dispose();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetColor(panel_2);
			}
		});
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(0, 0, 174, 187);
		panel_2.add(lblNewLabel_3);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(0, 64, 128));
		panel_2_1.setBounds(239, 90, 174, 187);
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\dogecoin.png"));
		lblNewLabel_4.setBounds(55, 11, 75, 66);
		panel_2_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3_1 = new JLabel("    DOGECOIN TO PHP");
		lblNewLabel_3_1.addMouseListener(new MouseAdapter() {
			public  void setColor (JPanel panel_2_1 ) {
				panel_2_1 .setBackground(new Color (237, 231, 225));
			}
			public  void resetColor (JPanel pl3) {
				panel_2_1 .setBackground(new Color (0, 64, 128));
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				setColor(panel_2_1);
				DOGE_TO_PHP window = new DOGE_TO_PHP();
				window.frmWendevlifemoneyconverterdogetophp.setVisible(true);
				frmWendevlifemoneyconvertercryptoconverter.dispose();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetColor(panel_2_1);
			}
		});
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		lblNewLabel_3_1.setBounds(0, 0, 174, 187);
		panel_2_1.add(lblNewLabel_3_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(new Color(0, 64, 128));
		panel_2_2.setBounds(447, 90, 174, 187);
		panel_1.add(panel_2_2);
		panel_2_2.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\ethereum.png"));
		lblNewLabel_5.setBounds(53, 0, 75, 95);
		panel_2_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("    ETHERIUM TO PHP");
		lblNewLabel_3_1_1.addMouseListener(new MouseAdapter() {
			public  void setColor (JPanel panel_2_2 ) {
				panel_2_2 .setBackground(new Color (237, 231, 225));
			}
			public  void resetColor (JPanel pl3) {
				panel_2_2 .setBackground(new Color (0, 64, 128));
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				setColor(panel_2_2);
				ETH_TO_PHP window = new ETH_TO_PHP();
				window.frmWendevlifemoneyconverterethtophp.setVisible(true);
				frmWendevlifemoneyconvertercryptoconverter.dispose();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetColor(panel_2_2);
			}
		});
		lblNewLabel_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		lblNewLabel_3_1_1.setBounds(0, 0, 174, 187);
		panel_2_2.add(lblNewLabel_3_1_1);
		
		JPanel panel_2_2_1 = new JPanel();
		panel_2_2_1.setBackground(new Color(0, 64, 128));
		panel_2_2_1.setBounds(652, 90, 174, 187);
		panel_1.add(panel_2_2_1);
		panel_2_2_1.setLayout(null);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("       BACK TO MENU");
		lblNewLabel_3_1_1_1.addMouseListener(new MouseAdapter() {
			public  void setColor (JPanel panel_2_2_1 ) {
				panel_2_2_1 .setBackground(new Color (237, 231, 225));
			}
			public  void resetColor (JPanel pl3) {
				panel_2_2_1 .setBackground(new Color (0, 64, 128));
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				setColor(panel_2_2_1);
				
				// FRAME OF YOUR CURRENT WINDOW
				Main_menu window = new Main_menu();
				window.frmWendevlifemoneyconvertermainmenu.setVisible(true);
				frmWendevlifemoneyconvertercryptoconverter.dispose();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetColor(panel_2_2_1);
			}
		});
		lblNewLabel_3_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		lblNewLabel_3_1_1_1.setBounds(0, 0, 174, 187);
		panel_2_2_1.add(lblNewLabel_3_1_1_1);
	}

}
