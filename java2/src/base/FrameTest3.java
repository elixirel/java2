package base;

import java.awt.*;
import javax.swing.*;

//set window on the center of the screen
public class FrameTest3 {
	public static void main(String[] args) {
		
		//화면 중앙에 프레임 위치시키기
		//1.실행중인 모니터의 해상도를 알아야 함
		//2. 모니터의 중앙 좌표를 알아야 함
		//3. 프레임의 좌우 크기를 중앙좌표에서 빼준다
		
		//x:모니터 중앙 좌표값-내가 만들려는 프레임의 width/2
		//y:모니터 중앙 좌표값-내가 만들려는 프레임의 height/2
		JFrame fr=new JFrame("세번째");
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
