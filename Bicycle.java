package shopApp; 

class Bicycle{
	private String name = "";
	private String model = "";
	private String maunfacturer;
	private int price ;
	public Bicycle(String name, String maunfacturer  , String model,int price){
		this.name = name;
		this.model = model;
		this.price = price;
		this.maunfacturer = maunfacturer;
	}

	public void changeName(String name){
		this.name = name;
	}

	public String getName (){
		// System.out.println("This bike Currently belong to -> " + this.name);
		return this.name;
	}

	public String getModel() {
		return model;
	}
	public String getMaunfacturer() {
		return maunfacturer;
	}

	public int getPrice() {
		return price;
	}

}