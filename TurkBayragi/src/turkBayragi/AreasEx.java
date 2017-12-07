package turkBayragi;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class AreasEx extends JFrame {
	
	public AreasEx(){
		initUI();
	}
	private void initUI(){
		add(new Surface());
		setTitle("Bayrak");
		setSize(600,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				
				AreasEx ex = new AreasEx();
				ex.setVisible(true);
				
			}
		});

	}

}
