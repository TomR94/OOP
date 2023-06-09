
public abstract class Product {
	protected String Name;
	protected int Price;
	protected boolean Electric;
	protected boolean waterresistant;
	protected int length;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public boolean isElectric() {
		return Electric;
	}

	public void setElectric(boolean electric) {
		Electric = electric;
	}

	public boolean isWaterresistant() {
		return waterresistant;
	}

	public void setWaterresistant(boolean waterresistant) {
		this.waterresistant = waterresistant;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void print_name() {
		System.out.println(Name);
	}

	public void print_price() {
		System.out.println(Price + " Euro");
	}

	public void print_length() {
		System.out.println(length + " cm");
	}

	public void stelprijsin(int Price) {
		this.Price = Price;
	};

	public void stellengtein(int length) {
		this.length = length;
	};

	public void stelnaamin(String name) {
		this.Name = name;
	};

	public String watisdenaam() {
		return Name;
	}

	public int watisdelengte() {
		return length;
	}

	public boolean ishetwaterbestendig() {
		return waterresistant;
	}

	public String alleeigenschappen() {
		return Name;
	}

	public abstract String samenvatting();

	//public Product() {
		//System.out.println("In Constructor");
	//}

	//public Product(String Name, int Price, int length, boolean waterresistant, boolean Electric) {
	//	this.Name= Name;
	//	this.Price= Price;
	//	this.length= length;
	//	this.waterresistant= waterresistant;
	//	this.Electric= Electric;
	//}
	//public Product(String Name) {
	//	System.out.println("Product is " + Name);
	//}

	
	
}
