package base;

import java.awt.*;
import javax.swing.*;

//set window on the center of the screen
public class FrameTest3 {
	public static void main(String[] args) {
		
		//ȭ�� �߾ӿ� ������ ��ġ��Ű��
		//1.�������� ������� �ػ󵵸� �˾ƾ� ��
		//2. ������� �߾� ��ǥ�� �˾ƾ� ��
		//3. �������� �¿� ũ�⸦ �߾���ǥ���� ���ش�
		
		//x:����� �߾� ��ǥ��-���� ������� �������� width/2
		//y:����� �߾� ��ǥ��-���� ������� �������� height/2
		JFrame fr=new JFrame("����°");
		fr.setSize(400,400);
		
		Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension di=tk.getScreenSize();
		
		int monitorw=di.width;
		int monitorh=di.height;
		
		int x=monitorw/2-fr.getWidth()/2;
		int y=monitorh/2-fr.getHeight()/2;
		fr.setLocation(x,y);
		fr.setVisible(true);
		
	}
}
