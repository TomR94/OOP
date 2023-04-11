
/**
 * @author Tom
 *
 */
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		
//		Product p = new Product ("Mand", 32, 12, false, true);
//		p.length = 12;
//		p.Name = "Plank";
//		p.Electric = false;
//		p.waterresistant = false;
//		p.Price = 32;
//		p.stelnaamin("kleine plank");
//		p.stelprijsin(10);
//		p.stellengtein(11);
//		p.print_name();
//		p.print_price();
//		p.print_length();
//		boolean waterbestendigp = p.ishetwaterbestendig();
//		String namep= p.watisdenaam();
//		int lengtep = p.watisdelengte();
		
		
//		Product p2 = new Product();
//		p2.Name = "grotere plank";
//		p2.length = 13;
//		p2.Electric = false;
//		p2.waterresistant = false;
//		p2.Price = 35;
//		p2.stelnaamin("mega plank");
//		p2.stelprijsin(15);
//		p2.stellengtein(22);
//		p2.print_name();
//		p2.print_price();
//		p2.print_length();
	
		//Product p3 = new Product("TV");
		
		TV p4 = new TV();
<<<<<<< HEAD
		//p4.resolutie = 1920;
		//p4.Name = "Samsung HD";
		p4.setName("Samsung HD");
		System.out.println(p4.getResolutie());
		System.out.println(p4.getName());
		
		Wasmachine p5 = new Wasmachine();
			p5.setPrice(430);
			//p5.setaantalwasprogrammas(5);
		//	System.out.println(p5.getaantalwasprogrammas());
=======
		p4.resolutie = 2040;
		p4.Name = "Samsung HD";
		System.out.println(p4.resolutie);
		System.out.println(p4.Name);
		
		Wasmachine p5 = new Wasmachine();
			p5.Name = "BOSH";
			p5.Price= 430;
			p5.aantalwasprogrammas=5;
			System.out.println(p5.aantalwasprogrammas);
>>>>>>> d888767c22290f3008f7c0de3058a4d8a1bc4426
		
		Frituurpan p6 = new Frituurpan();
			p6.setVolume(2);
			System.out.println(p6.getVolume());
			System.out.println(p6.samenvatting());
			System.out.println(p5.samenvatting());
		System.out.println(p4.samenvatting());
//		System.out.println(p4.samenvatting());
	}

}
