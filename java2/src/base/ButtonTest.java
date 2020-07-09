package base;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest {
	public static void main(String[] args) {
		Frame f=new Frame("버튼 테스트");
		f.setBounds(200,200,400,400);;
		
		f.setLayout(null);//자동배치를 끈다
		//그순간 frame에 추가되는 각 컴포넌트는 고유의 size와 location을 가져야 함
		Button btnOK=new Button("확인");
		btnOK.setBounds(70,90,100,50);
		
		Button btnClose=new Button("닫기");
		btnClose.setBounds(btnOK.getBounds());
		btnClose.setLocation(btnOK.getX()+btnOK.getWidth()+20,btnOK.getY());
		f.add(btnOK);
		f.add(btnClose);
		
		
		f.setVisible(true);
		
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
	}
}
