package Deadman;

public class Cat {

	public String name;
	public int age;
	private int height;
	private String color;
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

		public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public Cat(String Name, String Age, String Height, String Color ) {
		name = Name;
		age = 15;
		height = 125;
		color = Color;
		
			
	}
}
