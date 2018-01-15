package com.zetcode;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

class Surface extends JPanel implements ActionListener {
	
    private final int DELAY =300;
    private Timer timer;
    
    int pos_x=150;
    int pos_y=-50;
    int aci=90;
    
    int x_hareket;
    int y_hareket;
    
    private Image top;
    
    double radyan=deg2rad(aci);
    double hiz=8;
    double xvel=Math.cos(radyan)*hiz;
    double yvel=Math.sin(radyan)*hiz;
    
    
    public Surface() {    	
        initTimer();
        loadImage();
    }
    private void loadImage() {

        ImageIcon ii = new ImageIcon("src/top.png");
        top = ii.getImage();
    }
    private void initTimer() {
        timer = new Timer(DELAY, this);
        timer.start();
    } 
    
    private void drawBall(Graphics g) {

        g.drawImage(top,pos_x+x_hareket,pos_y+y_hareket, this);
        Toolkit.getDefaultToolkit().sync();
        
    }   
    @Override
    public void paintComponent(Graphics g) {      
        super.paintComponent(g);        
        drawBall(g);
    }  
    private void hareket() {
        pos_x+=xvel;
        pos_y+=yvel;     
    }
    private double deg2rad(double derece)
    {
        return derece*(Math.PI/180);
    }    
    @Override
    public void actionPerformed(ActionEvent e) { 
    	cycle();
        hareket();
        repaint();
    }    
    private void cycle() {

        pos_x += 1;
        pos_y += 1;

        if (pos_y >600) {

            pos_y =-50;
            pos_x =150;
        }
    }	
}
