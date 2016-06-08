package Vehicles;

public class Color {
	private int red, green, blue;

	public Color(int red, int green, int blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public int getBlue() {
		return this.blue;
	}

	public int getRed() {
		return red;
	}

	public int getGreen() {
		return green;
	}

	@Override
	public boolean equals(Object obj){
		if (!(obj instanceof Color)) return false;
		Color other = ((Color)obj);
		return (this.red == other.getRed()
				&& this.getGreen() == other.getGreen()
				&& this.getBlue() == other.getBlue() );
	}
	
	@Override
	public String toString(){
		return "("+ red +"," + green + "," + blue + ")";
	}
}
