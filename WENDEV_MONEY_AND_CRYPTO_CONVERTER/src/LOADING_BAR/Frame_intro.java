package LOADING_BAR;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

import CRYPTO_MENU.CRYPTO_MENU;
import main_menu.Main_menu;



public class Frame_intro extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	ImageIcon bg = new ImageIcon(new ImageIcon("src\\background.png")
			.getImage().getScaledInstance(420, 320, Image.SCALE_SMOOTH));
	ImageIcon logo = new ImageIcon(new ImageIcon("logo.png")
			.getImage().getScaledInstance(289,126, Image.SCALE_SMOOTH));
	
	JLabel bg_label, welcome;
	
	JPanel panel, concept, panel_exit;
	
	JProgressBar load = new JProgressBar(0,100);
	
	JLayeredPane layer;
	
	JButton start;
	
	public Frame_intro() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		
		
		load.setBounds(0, 400, 420, 20);
		load.setValue(0);
		load.setOpaque(false);
		load.setForeground(new Color(178,222,39));
		
		welcome = new JLabel(logo);
		welcome.setBounds(0, 190,289,126);
		welcome.setOpaque(false);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 420, 320);
		panel.setSize(new Dimension(420,320));
		panel.setOpaque(false);
		panel.setLayout(new BorderLayout());
		panel.add(load, BorderLayout.SOUTH);
		
		concept = new JPanel();
		concept.setBounds(0, 100, 420, 320);
		concept.setOpaque(false);
		concept.add(welcome);
		
		bg_label = new JLabel(bg);
		bg_label.setBounds(0, 0, 420, 320);
		bg_label.add(panel);
		
		/*layer = new JLayeredPane();
		layer.setBounds(0,0,420, 320);
		layer.add(bg_label, JLayeredPane.DEFAULT_LAYER);
		layer.add(panel, JLayeredPane.PALETTE_LAYER);
		layer.add(concept, JLayeredPane.MODAL_LAYER); */
		
		add(concept);
		add(panel);
		
		pack();
		setSize(420, 320);
		setLocationRelativeTo(null);
		setVisible(true);
		add(bg_label);
		
		try {
			fill();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void fill() throws InterruptedException, IOException {
		int i = 0;
		while (i<=100) {
			
			load.setValue(i);
			Thread.sleep(20);
			i++;
			
			if (i==100) {
				Main_menu window = new Main_menu();
				window.frmWendevlifemoneyconvertermainmenu.setVisible(true);
				this.dispose();
			}
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}

