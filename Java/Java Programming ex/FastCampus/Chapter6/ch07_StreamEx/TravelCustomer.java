package ch07_StreamEx;

public class TravelCustomer {

	private int Age, price;
	String name;
	
	public TravelCustomer(int Age, String name, int price) {
		this.Age=Age;
		this.name=name;
		this.price=price;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name: "+name+" age: "+Age+" price : "+price;
	}
	
}
