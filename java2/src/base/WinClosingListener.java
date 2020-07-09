package base;

import java.awt.event.WindowEvent;

public class WinClosingListener extends ListenerClass{

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("종료버튼은 작동되지 않음");
	}
	

}
