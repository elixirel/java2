package java2;

public class SmartPhone {
	private String company;
	private String os;
	SmartPhone(String com, String os) {
		company=com;
		this.os=os;
	}
	
	public String toString() {
		return("["+company+","+os+"]");
	}
}
