package base;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
//set event with clicked x-button
public class FrameTest5 {
	public static void main(String[] args) {
		
		MyFrame fr=new MyFrame();
		fr.setBackground(Color.green);
		fr.setTitle("´Ù¼¸¹øÂ°");
		fr.setVisible(true);
		
		//eventlistener is MyEventListener which implements WindowListener
		//fr.addWindowListener(new MyEventListener());
		fr.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {

				super.windowClosing(e);
			}
			
		});
	}
}
