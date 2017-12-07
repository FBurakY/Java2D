package Vize3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Surface extends JPanel implements ActionListener{
	//Fadýl Burak Yurtsever Grafik Programlama Vize3 Soru Çözümü ...
	private Timer timer;
	private Random random;
	private final int DELAY =100;
	
	private int Red;
	private int Green;
	private int Blue;
	
	private int genislik;
	private int yukseklik;
	private int En;
	private int Boy;
	
	public Surface(){		
		
		startRandom();
		startTimer();		
		
	}
	private void doDrawing(Graphics g){
		
		Graphics2D g2d = (Graphics2D) g.create();
		
		this.genislik=getWidth();
		this.yukseklik=getHeight();
		
		//20 Sütün ... 2x döndüðü için :) 10 Yazýyorum 
		this.En=getHeight()/10;
		//10 Satýr ...
		this.Boy=getHeight()/10;		
		
		for(int i = 0 ; i<yukseklik ; i+=Boy){				
			for(int j = 0 ;j<genislik ; j+=En){					
				
				g2d.drawRect(j,i,this.En,this.Boy);				
				g2d.fillRect(j+15,i+15,this.En/2,this.Boy/2);
				g2d.setColor(new Color(Red, Green, Blue));
			}	
				startRandom();
		}		
	}	
	private void startTimer(){		
		timer = new Timer(DELAY, this);
		timer.start();		
	}	
	private void startRandom(){		
		random = new Random();
		this.Red = random.nextInt(255);
		this.Blue = random.nextInt(255);
		this.Green = random.nextInt(255);
			
	}
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		doDrawing(g);
	}
	@Override
	public void actionPerformed(ActionEvent e){
		repaint();
	}	
}
