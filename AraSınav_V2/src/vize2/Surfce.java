package vize2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Surfce extends JPanel implements ActionListener {

	private final int DELAY=25;
	
	private int Red;
	private int Blue;
	private int Green;
	
	private Random random;
	private Timer zaman;
	
	private int b_cizgi=1;
	private int k_cizgi=50;
	
	public Surfce(){
		starTime();		
	}
	public void starTime(){		
		zaman = new Timer(DELAY,this);
		zaman.start();
	}
	
	public void startRandomColor(){
		
		random     = new Random();
		this.Red   = random.nextInt(255);
		this.Blue  = random.nextInt(255);
		this.Green = random.nextInt(255);
	}
	
	public void doDrawing(Graphics g){
		
		Graphics2D g2d = (Graphics2D)g.create();
		
		//Burada ki kodlar ise elipsin daha net oluþmasýný saðlýyor ...
		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
				   	   rh.put(RenderingHints.KEY_RENDERING,RenderingHints.VALUE_RENDER_QUALITY);
		
		//Çizgi Kalýnlýðý için ...
		BasicStroke lineSettings  = new BasicStroke((1+k_cizgi+b_cizgi), BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
		g2d.setStroke(lineSettings);	
		
		//Ekranýn bilgisini çekiyorum ... 
		Dimension size = getSize();
		       double genislik = size.getWidth();
		       double yukseklik = size.getHeight();
		       
		g2d.setPaint(new Color(Red, Green, Blue));				
		g2d.drawOval((int)genislik/2,(int)yukseklik/2,15,15);
	
		
	}	
	public void up(){	b_cizgi++;	}
	public void down(){	k_cizgi--;	}
		
	@Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);     
        doDrawing(g);
    }
	@Override
    public void actionPerformed(ActionEvent e) { 	   
		
		Dimension size = getSize();
	    double genislik = size.getWidth();   
	    
		if(b_cizgi < (genislik/1.2)){ up(); }
		else if(b_cizgi >= 0 ){ down(); }
		else { zaman.stop(); } 
		startRandomColor();        
        repaint();    
    }
}
