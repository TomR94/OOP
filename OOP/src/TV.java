
public class TV extends Product{
	public int resolutie;
	public String samenvatting() {
		String samenvatting = "name = " + Name + "Price =" + Price + "electrisch?" + Electric + "waterbestendig?"
				+ waterresistant + "de resolutie is "+ resolutie;
		return samenvatting;
		}
}
