package Vize4;

import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Vize4 extends JFrame {	
	
	public Vize4(){		
		initUI();
		kontroller();
	}		
	private void initUI(){
		
		setTitle("Vize 4");
		setSize(650,650);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	
	}
	
	private void kontroller(){
		
		final Surface nesne = new Surface();		
		add(nesne);
		this.addKeyListener(new KeyListener()
        {
            @Override 
              public void keyPressed(KeyEvent e)
              {	
            	  //Sað Klavye Bastýðý Zaman ...
                  if(e.getKeyCode()==KeyEvent.VK_RIGHT ){
                	     nesne.aci+=12;
                  }                        
                  //Sol Klavye Bastýðý Zaman ...
                  else if(e.getKeyCode()==KeyEvent.VK_LEFT ){                	  
                	  	nesne.aci-=25;
                  } 
                  //Yukarý Klavye Basýldýðý Zaman ...
                  else if(e.getKeyCode()==KeyEvent.VK_UP){
                	  	nesne.ebat+=10;
                  }
                  //Aþaðý Klavye Basýldýðý Zaman ... 
                  else if(e.getKeyCode()==KeyEvent.VK_DOWN){
                	  	nesne.ebat-=2;
                  }
              }
              @Override
              public void keyReleased(KeyEvent e){               
              }            
              @Override
              public void keyTyped(KeyEvent e){              
              }        
        });
        this.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(final MouseEvent e){
				
				//Sað Týk Yaptýðý zaman ...
				if (SwingUtilities.isRightMouseButton(e) || e.isControlDown()){
					
				}
				//Sol Týk Yaptýðý zaman ...
				if (SwingUtilities.isLeftMouseButton(e) || e.isControlDown()){
					
				}				
				
			}
		});
        
	}
	public static void main(String[] args) {	
		EventQueue.invokeLater(new Runnable() {			
			@Override
			public void run() {
				
				Vize4 vize4_cevap = new Vize4();
				vize4_cevap.setVisible(true);				
			}
		});
	}
}
