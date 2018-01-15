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
		setTitle("Final 3");		
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
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
