package java24;
// obsoleted
public class GenericPrintTest {
	public static void main(String[] args) {
		GenericPrinter<Powder> powderprinter=new GenericPrinter<Powder>();
		powderprinter.setMaterial(new Powder());
		Powder powder=powderprinter.getMaterial();
		System.out.println(powderprinter);
		System.out.println(powder);
		
		GenericPrinter<Plastic> plasticprinter=new GenericPrinter<Plastic>();
		plasticprinter.setMaterial(new Plastic());
		Plastic plastic=plasticprinter.getMaterial();
		System.out.println(plasticprinter);
		System.out.println(plastic);
		
		/*GenericPrinter<Water> waterprinter=new GenericPrinter<Water>();
		*waterprinter.setMaterial(new Water());
		*Water water=waterprinter.getMaterial();
		*System.out.println(waterprinter);
		*System.out.println(water);*/
	}
}

