package Vize3;

import java.awt.EventQueue;
import java.util.Random;

import javax.swing.JFrame;

public class Vize3 extends JFrame{
	
	private int frame_genislik;
	private int frame_yukselik;
	
	public Vize3(){
		
		Surface cvp = new Surface();
		add(cvp);
		randomFrame();
		
		setTitle("Vize 3 ");		
		setSize(frame_genislik,frame_yukselik);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}	
	private void  randomFrame(){
		
		Random f_random = new Random();
		this.frame_genislik=f_random.nextInt(255);
		this.frame_yukselik=f_random.nextInt(255);
		
	}
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				
				Vize3 cevap = new Vize3();
				cevap.setVisible(true);
			}
		});
	}

}
