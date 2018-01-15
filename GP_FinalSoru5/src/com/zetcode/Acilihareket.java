package com.zetcode;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints.Key;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Acilihareket extends JFrame {  
    public Acilihareket() {      
        initUI();
        kontroller();
    } 
    private void initUI() {      
        setTitle("Final 5");  
        setSize(400,650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);        
       
    }    
    public void kontroller(){
    	
    	final Surface nesne = new Surface();
    	add(nesne);
    	this.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {				
			}			
			@Override
			public void keyReleased(KeyEvent e) {				
			}			
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode()==KeyEvent.VK_DOWN){
					nesne.y_hareket+=10;
				}
				if(e.getKeyCode()==KeyEvent.VK_UP){
					nesne.y_hareket-=10;
				}
				if(e.getKeyCode()==KeyEvent.VK_LEFT){
					nesne.x_hareket-=5;					
				}
				if(e.getKeyCode()==KeyEvent.VK_RIGHT){
					nesne.x_hareket+=5;	
				}
				
			}
		});
    	
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {        
            @Override
            public void run() {
                Acilihareket cl = new Acilihareket();
                cl.setVisible(true);
            }
        }); 
        
    }
}