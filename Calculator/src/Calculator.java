
public class Calculator {
	String color;
	String model;
	String company;
	int max_speed;
	int fuel;
	
	public Calculator(){};
	
	public Calculator(String color, String model, String company, int max_speed, int fuel) {
		this.color = color;
		this.model = model;
		this.company = company;
		this.max_speed = max_speed;
		this.fuel = fuel;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getMax_speed() {
		return max_speed;
	}
	public void setMax_speed(int max_speed) {
		this.max_speed = max_speed;
	}
	public int getFuel() {
		return fuel;
	}
	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

}
