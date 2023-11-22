package MONEY_CONVERTER_MENU;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;

import EURO_TO_PHP.EURO_TO_PHP;
import POUNDS_TO_PHP.POUNDS_TO_PHP;
import RINGGIT_TO_PHP.RINGGIT_TO_PHP;
import TWD_TO_PHP.TWD_TO_PHP;
import USD_TO_PHP.USD_TO_PHP;
import YUAN_TO_PHP.YUAN_TO_PHP;
import Yen_To_Php.Yen_To_Php;
import main_menu.Main_menu;

import javax.swing.border.BevelBorder;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class money_menu {

	public JFrame frmWendevlifemoneyconvertermoneymenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					money_menu window3 = new money_menu();
					window3.frmWendevlifemoneyconvertermoneymenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public money_menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWendevlifemoneyconvertermoneymenu = new JFrame();
		frmWendevlifemoneyconvertermoneymenu.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\JAVA_ECLIPSE\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\money.png"));
		frmWendevlifemoneyconvertermoneymenu.setTitle("WENDEVLIFE_MONEY_CONVERTER_MONEY_MENU");
		frmWendevlifemoneyconvertermoneymenu.setResizable(false);
		frmWendevlifemoneyconvertermoneymenu.getContentPane().setBackground(new Color(71, 78, 104));
		frmWendevlifemoneyconvertermoneymenu.setBounds(100, 100, 1024, 720);
		frmWendevlifemoneyconvertermoneymenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWendevlifemoneyconvertermoneymenu.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 64));
		panel.setBounds(0, 0, 1008, 71);
		frmWendevlifemoneyconvertermoneymenu.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WENDEVLIFE MONEY CONVERTER");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(79, 11, 508, 49);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\money.png"));
		lblNewLabel_1.setBounds(10, 11, 64, 60);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 128, 0), new Color(0, 128, 0), new Color(0, 128, 0), new Color(0, 128, 0)));
		panel_1.setBackground(new Color(0, 128, 0));
		panel_1.setBounds(60, 147, 878, 448);
		frmWendevlifemoneyconvertermoneymenu.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 64, 128));
		panel_2.setBounds(26, 23, 159, 155);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\dollar-symbol (1).png"));
		lblNewLabel_2.setBounds(47, 11, 75, 53);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("    USD TO PHP");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			public  void setColor (JPanel panel_2) {
				panel_2.setBackground(new Color (237, 231, 225));
			}
			public  void resetColor (JPanel pl3) {
				pl3.setBackground(new Color (0, 64, 128));
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				setColor(panel_2);
				USD_TO_PHP window = new USD_TO_PHP();
				window.frmWendevlifeMoneyConverter.setVisible(true);
				frmWendevlifemoneyconvertermoneymenu.dispose();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetColor(panel_2);
			}
		});
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(0, 0, 159, 155);
		panel_2.add(lblNewLabel_3);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(0, 64, 128));
		panel_2_1.setBounds(237, 23, 159, 155);
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\coin.png"));
		lblNewLabel_4.setBounds(49, 11, 75, 57);
		panel_2_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3_1 = new JLabel("    YEN TO PHP");
		lblNewLabel_3_1.addMouseListener(new MouseAdapter() {
			public  void setColor1 (JPanel panel_2_1) {
				panel_2_1.setBackground(new Color (237, 231, 225));
			}
			public  void resetColor1 (JPanel pl3) {
				pl3.setBackground(new Color (0, 64, 128));
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				setColor1(panel_2_1);
				Yen_To_Php window = new Yen_To_Php();
				window.frmWendevlifeMoneyConverter.setVisible(true);
				frmWendevlifemoneyconvertermoneymenu.dispose();

				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetColor1(panel_2_1);
			}
		});
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_1.setBounds(0, 0, 159, 155);
		panel_2_1.add(lblNewLabel_3_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(new Color(0, 64, 128));
		panel_2_2.setBounds(451, 23, 159, 155);
		panel_1.add(panel_2_2);
		panel_2_2.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\yuan (1).png"));
		lblNewLabel_5.setBounds(48, 0, 64, 67);
		panel_2_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("    YUAN TO PHP");
		lblNewLabel_3_1_1.addMouseListener(new MouseAdapter() {
			public  void setColor2 (JPanel panel_2_2) {
				panel_2_2.setBackground(new Color (237, 231, 225));
			}
			public  void resetColor2 (JPanel pl3) {
				panel_2_2.setBackground(new Color (0, 64, 128));
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				setColor2(panel_2_2);
				System.out.println("Hi");
				YUAN_TO_PHP window = new YUAN_TO_PHP();
				window.frmWendevlifeMoneyConverter.setVisible(true);
				frmWendevlifemoneyconvertermoneymenu.dispose();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetColor2(panel_2_2);
			}
		});
		lblNewLabel_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_1_1.setBounds(0, 0, 159, 155);
		panel_2_2.add(lblNewLabel_3_1_1);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBackground(new Color(0, 64, 128));
		panel_2_3.setBounds(664, 23, 159, 155);
		panel_1.add(panel_2_3);
		panel_2_3.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\pound-sterling (1).png"));
		lblNewLabel_6.setBounds(46, 0, 90, 64);
		panel_2_3.add(lblNewLabel_6);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("  POUNDS TO PHP");
		lblNewLabel_3_1_1_1.addMouseListener(new MouseAdapter() {
			public  void setColor3 (JPanel panel_2_3) {
				panel_2_3.setBackground(new Color (237, 231, 225));
			}
			public  void resetColor3 (JPanel pl3) {
				panel_2_3.setBackground(new Color (0, 64, 128));
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				setColor3(panel_2_3);
				POUNDS_TO_PHP window = new POUNDS_TO_PHP();
				window.frmWendevlifeMoneyConverter.setVisible(true);
				frmWendevlifemoneyconvertermoneymenu.dispose();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetColor3(panel_2_3);
			}
		});
		lblNewLabel_3_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_1_1_1.setBounds(0, 0, 159, 155);
		panel_2_3.add(lblNewLabel_3_1_1_1);
		
		JPanel panel_2_4 = new JPanel();
		panel_2_4.setBackground(new Color(0, 64, 128));
		panel_2_4.setBounds(26, 232, 159, 155);
		panel_1.add(panel_2_4);
		panel_2_4.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\icons8-taiwan-dollar-64.png"));
		lblNewLabel_7.setBounds(46, 0, 64, 64);
		panel_2_4.add(lblNewLabel_7);
		
		JLabel lblNewLabel_3_2 = new JLabel("    TWD TO PHP");
		lblNewLabel_3_2.addMouseListener(new MouseAdapter() {
			public  void setColor4 (JPanel panel_2_4) {
				panel_2_4.setBackground(new Color (237, 231, 225));
			}
			public  void resetColor4 (JPanel pl3) {
				panel_2_4.setBackground(new Color (0, 64, 128));
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				setColor4(panel_2_4);
				TWD_TO_PHP window = new TWD_TO_PHP();
				window.frmWendevlifeMoneyConverter.setVisible(true);
				frmWendevlifemoneyconvertermoneymenu.dispose();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetColor4(panel_2_4);
			}
		});
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_2.setBounds(0, 0, 159, 155);
		panel_2_4.add(lblNewLabel_3_2);
		
		JPanel panel_2_5 = new JPanel();
		panel_2_5.setBackground(new Color(0, 64, 128));
		panel_2_5.setBounds(237, 232, 159, 155);
		panel_1.add(panel_2_5);
		panel_2_5.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\malaysian-ringgit (1).png"));
		lblNewLabel_8.setBounds(49, 0, 64, 62);
		panel_2_5.add(lblNewLabel_8);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("    RINGGIT TO PHP");
		lblNewLabel_3_2_1.addMouseListener(new MouseAdapter() {
			public  void setColor5 (JPanel panel_2_5) {
				panel_2_5.setBackground(new Color (237, 231, 225));
			}
			public  void resetColor5 (JPanel pl3) {
				panel_2_5.setBackground(new Color (0, 64, 128));
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				setColor5(panel_2_5);
				RINGGIT_TO_PHP window = new RINGGIT_TO_PHP();
				window.frmWendevlifeMoneyConverter.setVisible(true);
				frmWendevlifemoneyconvertermoneymenu.dispose();
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetColor5(panel_2_5);
			}
		});
		lblNewLabel_3_2_1.setForeground(Color.WHITE);
		lblNewLabel_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3_2_1.setBounds(0, 0, 159, 155);
		panel_2_5.add(lblNewLabel_3_2_1);
		
		JPanel panel_2_6 = new JPanel();
		panel_2_6.setBackground(new Color(0, 64, 128));
		panel_2_6.setBounds(451, 232, 159, 155);
		panel_1.add(panel_2_6);
		panel_2_6.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\WENDEV_MONEY_AND_CRYPTO_CONVERTER\\src\\icons8-euro-sign-64.png"));
		lblNewLabel_9.setBounds(51, 0, 86, 69);
		panel_2_6.add(lblNewLabel_9);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("      EURO TO PHP");
		lblNewLabel_3_2_1_1.addMouseListener(new MouseAdapter() {
			public  void setColor6 (JPanel panel_2_6) {
				panel_2_6.setBackground(new Color (237, 231, 225));
			}
			public  void resetColor6 (JPanel pl3) {
				panel_2_6.setBackground(new Color (0, 64, 128));
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				setColor6(panel_2_6);
				EURO_TO_PHP window = new EURO_TO_PHP();
				window.frmWendevlifeMoneyConverter.setVisible(true);
				frmWendevlifemoneyconvertermoneymenu.dispose();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetColor6(panel_2_6);
			}
		});
		lblNewLabel_3_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3_2_1_1.setBounds(0, 0, 159, 155);
		panel_2_6.add(lblNewLabel_3_2_1_1);
		
		JPanel panel_2_7 = new JPanel();
		panel_2_7.setBackground(new Color(0, 64, 128));
		panel_2_7.setBounds(664, 232, 159, 155);
		panel_1.add(panel_2_7);
		panel_2_7.setLayout(null);
		
		JLabel lblNewLabel_3_2_1_1_1 = new JLabel("     BACK TO MENU");
		lblNewLabel_3_2_1_1_1.addMouseListener(new MouseAdapter() {
			public  void setColor7 (JPanel panel_2_7) {
				panel_2_7.setBackground(new Color (237, 231, 225));
			}
			public  void resetColor7 (JPanel pl3) {
				panel_2_7.setBackground(new Color (0, 64, 128));
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				setColor7(panel_2_7);
			
				
				// FRAME OF YOUR CURRENT WINDOW
				Main_menu window = new Main_menu();
				window.frmWendevlifemoneyconvertermainmenu.setVisible(true);
				frmWendevlifemoneyconvertermoneymenu.dispose();
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetColor7(panel_2_7);
			}
		});
		lblNewLabel_3_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3_2_1_1_1.setBounds(0, 0, 159, 155);
		panel_2_7.add(lblNewLabel_3_2_1_1_1);
	}
}
