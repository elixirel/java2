package java24;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeDPrinter printer=new ThreeDPrinter();
		Powder p1=new Powder();
		printer.setMaterial(p1);
		
		Powder p2=(Powder)printer.getMaterial();
		
	}


}
