
public class Wasmachine extends Product {
	private int toerental;
	private int aantalwasprogrammas;

	
	public String samenvatting() {
		String samenvatting = "name = " + Name + "Price =" + Price + "electrisch?" + Electric + "waterbestendig?"
				+ waterresistant + "het aantal toeren is "+ toerental +"het aantal wasprogrammas:"+ aantalwasprogrammas;
		return samenvatting;
	}
}
