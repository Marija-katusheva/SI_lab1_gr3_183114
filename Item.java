class Item {
	int id;
	String name;
	double price;
        
	String tax;
	//TODO add variable.

	//TODO constructor

	//TODO setters and getters

	public double taxReturn() {
		//TODO
		return price * 0.18;
	}

	public Item(int id, String name, double price, String tax) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTax() {
		return tax;
	}

	public void setTax(String tax) {
		this.tax = tax;
	}
}
