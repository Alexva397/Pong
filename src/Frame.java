import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame{
	
	GamePanel panel;
	
	Frame(){
		panel = new GamePanel();
		this.add(panel);
		this.setTitle("Pong");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}