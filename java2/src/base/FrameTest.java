package base;

import java.awt.*;
import javax.swing.*;
public class FrameTest {
	public static void main(String[] args) {
		Frame frame=new Frame("첫 프레임");
		
		frame.setBounds(800,100,400,300); // x좌표, y좌표, 너비, 높이
		
		System.out.println(frame.getBounds().getWidth());
		System.out.println(frame.getBounds().getHeight());
		
		frame.setBackground(Color.blue);
		
		frame.setVisible(true);
	}
}
