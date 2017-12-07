package Vize4;

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
import java.awt.geom.Rectangle2D;

import javax.swing.Box.Filler;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Surface extends JPanel implements ActionListener{
	//Fadýl Burak Yurtsever Vize 4 Soru ...
	private Timer timer;
	private final int DELAY=100;
	public int aci=0;
	public int ebat=0;	

	public Surface(){
		
		startTimer();
	}	
	private void startTimer(){
		
		timer = new Timer(DELAY, this);
		timer.start();		
	}	
	public void doDrawing(Graphics g){
		
		Graphics2D g2d = (Graphics2D)g.create();
		//Burada ki kodlar ise elipsin daha net oluþmasýný saðlýyor ...
		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		   			   rh.put(RenderingHints.KEY_RENDERING,RenderingHints.VALUE_RENDER_QUALITY);
		g2d.setRenderingHints(rh);

		
		//Ekranýn bilgisini çekiyorum ... 
		Dimension size = getSize();
        double genislik = size.getWidth();
        double yukseklik = size.getHeight();
       
        //Elipsi Oluþturuyorum ... 
        //Klavye Up-Down tuþlarýyla Büyümesi-Küçülmesi için +ebat yazýyorum ...
        Ellipse2D e = new Ellipse2D.Double(0,0,50+ebat,30+ebat);
        
        //Ekranýn Merkezinde Oluþmasýný istiyorum ilgili kod ...
        AffineTransform at =AffineTransform.getTranslateInstance(genislik/ 2, yukseklik / 2);
						at.rotate(Math.toRadians(aci));
		//Renginin siyah olmasýný istiyorum ... 				
		g2d.setPaint(Color.BLACK);
		//Benden içi boþ elips istediði için draw kullandým dolu olmasýný isteseydi fill();
		g2d.draw(at.createTransformedShape(e));
		
		
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
