
public class Frituurpan extends Product{
	public int volume;
	public String samenvatting() {
		String samenvatting = "name = " + Name + "Price =" + Price + "electrisch?" + Electric + "waterbestendig?"
				+ waterresistant + "het volume is "+ volume;
		return samenvatting;
}
}

