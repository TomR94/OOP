
public class Frituurpan extends Product{
	private int volume;
	
	
	
	public int getVolume() {
		return volume;
	}



	public void setVolume(int volume) {
		this.volume = volume;
	}



	public String samenvatting() {
		String samenvatting = "name = " + Name + "Price =" + Price + "electrisch?" + Electric + "waterbestendig?"
				+ waterresistant + "het volume is "+ volume;
		return samenvatting;
}
}

