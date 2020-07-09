package base;
import java.awt.*;
import javax.swing.*;

public class MyFrame extends Frame{
	public MyFrame() {
		setBounds(500,200,400,400);
		setVisible(true);

	}
	public static void main(String[] args) {
		MyFrame fr=new MyFrame();
		fr.setBackground(Color.black);
		fr.setTitle("³×¹øÂ°");
	}
}
