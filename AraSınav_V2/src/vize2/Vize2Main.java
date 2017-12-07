package vize2;

import java.awt.EventQueue;
import java.util.Random;

import javax.swing.JFrame;

public class Vize2Main extends JFrame {

	private Random random_cervece;
	private int cerceve;
	private int sayi;
	public Vize2Main(){		
		initUI();
	}
	
	public void initUI(){
		
		Surfce panel = new Surfce();
			
		add(panel);
		pack();
		setTitle("Vize 2");
		setSize(550,550);
		setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);				
	}	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {			
			@Override
			public void run() {
				Vize2Main nesne = new Vize2Main();
				nesne.setVisible(true);				
			}
		});
	}
}
