class Item {
	int id;
	String name;
	double price;

	//TODO add variable.
    int A= 18;
    int B= 5;
    int V= 0;
	//TODO constructor

	public Item(int id, String name, double price, int a, int b, int v) {
		this.id = id;
		this.name = name;
		this.price = price;
		A = a;
		B = b;
		V = v;
	}

	//TODO setters and getters

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

	public int getA() {
		return A;
	}

	public void setA(int a) {
		A = a;
	}

	public int getB() {
		return B;
	}

	public void setB(int b) {
		B = b;
	}

	public int getV() {
		return V;
	}

	public void setV(int v) {
		V = v;
	}

	double getTaxReturn (int id, double price) {
		//TODO
		return price * 0.15;
	}
}