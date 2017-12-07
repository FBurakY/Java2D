package turkBayragi;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;

import javax.swing.JPanel;

public class Surface extends JPanel{
	
	//Türk Bayraðý...
	private final double points[][]={{600,285},{675,275},{700,210},{725,275},{800,285},{750,325},{760,390},{700,350},{640,390},{650,325},{600,285}};
	
	public void doDrawing(Graphics g){
		
		Graphics2D g2d = (Graphics2D)g;
		
		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		g2d.setRenderingHints(rh);
		g2d.setPaint(Color.WHITE);
		g2d.translate(150,50);
		
		GeneralPath star = new GeneralPath();
		star.moveTo(points[0][0],points[0][1]);
		
		for(int k = 1 ; k<points.length;k++){
			star.lineTo(points[k][0], points[k][1]);
		}
		
		star.closePath();
		g2d.fill(star);
		
		Area a3 = new Area(new Ellipse2D.Double(250,240,200,200));
		Area a4 = new Area(new Ellipse2D.Double(300,240,200,200));
		
		a3.subtract(a4);
		g2d.fill(a3);
		
		setBackground(Color.RED);
		
	}
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		doDrawing(g);
	}

}
