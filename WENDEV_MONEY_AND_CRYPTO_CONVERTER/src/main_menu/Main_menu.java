package main_menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JPanel;

import About_Us.About;
import CRYPTO_MENU.CRYPTO_MENU;
import MONEY_CONVERTER_MENU.money_menu;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main_menu {

	public JFrame frmWendevlifemoneyconvertermainmenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_menu window = new Main_menu();
					window.frmWendevlifemoneyconvertermainmenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main_menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWendevlifemoneyconvertermainmenu = new JFrame();
		frmWendevlifemoneyconvertermainmenu.setResizable(false);
		frmWendevlifemoneyconvertermainmenu.getContentPane().setBackground(new Color(71, 74, 104));
		frmWendevlifemoneyconvertermainmenu.setTitle("WENDEVLIFE_MONEYCONVERTER_MAIN_MENU");
		frmWendevlifemoneyconvertermainmenu.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\JAVA_ECLIPSE\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\money.png"));
		frmWendevlifemoneyconvertermainmenu.setBounds(100, 100, 1023, 720);
		frmWendevlifemoneyconvertermainmenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWendevlifemoneyconvertermainmenu.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 64));
		panel.setBounds(0, 0, 1007, 77);
		frmWendevlifemoneyconvertermainmenu.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("WENDEVLIFE MONEY CONVERTER");
		lblNewLabel_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(99, 0, 472, 77);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\money.png"));
		lblNewLabel_5.setBounds(10, 0, 79, 66);
		panel.add(lblNewLabel_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 64));
		panel_1.setBounds(86, 156, 857, 443);
		frmWendevlifemoneyconvertermainmenu.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBounds(589, 100, 204, 217);
		panel_1.add(panel_2_1_1);
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBackground(new Color(0, 64, 128));
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setBounds(77, 24, 56, 56);
		panel_2_1_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("               ABOUT");
		lblNewLabel_1_2.setBounds(0, 0, 204, 217);
		panel_2_1_1.add(lblNewLabel_1_2);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(69, 24, 63, 56);
		panel_2_1_1.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\icons8-more-info-48.png"));
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			
			public  void setColor (JPanel panel_2_1_1) {
				panel_2_1_1.setBackground(new Color (237, 231, 225));
			}
			public  void resetColor (JPanel pl3) {
				pl3.setBackground(new Color (0, 64, 128));
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				setColor(panel_2_1_1);
				About window = new About();
				window.frame.setVisible(true);
				frmWendevlifemoneyconvertermainmenu.dispose();
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetColor(panel_2_1_1);
			}
		});
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 64, 128));
		panel_2.setBounds(44, 100, 204, 217);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\money.png"));
		lblNewLabel.setBounds(59, 33, 82, 56);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("      Convert Your Money");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			public  void setColor (JPanel panel_2) {
				panel_2.setBackground(new Color (237, 231, 225));
			}
			public  void resetColor (JPanel pl3) {
				pl3.setBackground(new Color (0, 64, 128));
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				setColor(panel_2);
				money_menu window3 = new money_menu();
				window3.frmWendevlifemoneyconvertermoneymenu.setVisible(true);
				frmWendevlifemoneyconvertermainmenu.dispose();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetColor(panel_2);
			}
		});
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(0, 0, 204, 217);
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(new Color(0, 64, 128));
		panel_2_1.setBounds(306, 100, 204, 217);
		panel_1.add(panel_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("      Convert Your Crypto");
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			
			public  void setColor (JPanel panel_2) {
				panel_2.setBackground(new Color (237, 231, 225));
			}
			public  void resetColor (JPanel pl3) {
				pl3.setBackground(new Color (0, 64, 128));
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				CRYPTO_MENU window = new CRYPTO_MENU();
				window.frmWendevlifemoneyconvertercryptoconverter.setVisible(true);
				frmWendevlifemoneyconvertermainmenu.dispose();
				setColor(panel_2_1);
				
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetColor(panel_2_1);
			}
		});
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(0, 23, 194, 194);
		panel_2_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\icons8-bitcoin-47.png"));
		lblNewLabel_4.setBounds(69, 24, 80, 56);
		panel_2_1.add(lblNewLabel_4);
		
	}
}
