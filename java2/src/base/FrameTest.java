package base;

import java.awt.*;
import javax.swing.*;
public class FrameTest {
	public static void main(String[] args) {
		Frame frame=new Frame("ù ������");
		
		frame.setBounds(800,100,400,300); // x��ǥ, y��ǥ, �ʺ�, ����
		
		System.out.println(frame.getBounds().getWidth());
		System.out.println(frame.getBounds().getHeight());
		
		frame.setBackground(Color.blue);
		
		frame.setVisible(true);
	}
}
