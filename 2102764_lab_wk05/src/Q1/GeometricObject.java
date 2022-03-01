package Q1;

import java.util.Date;

public class GeometricObject {

	private String color = "white";
	private boolean	filled = false;
	private Date dateCreated;

	public GeometricObject() {
		getDateCreated();
	}

	public GeometricObject(String color, boolean filled) {
		getDateCreated();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreated() {
		this.dateCreated = new Date();
		return dateCreated;
	}

	public String toString(){
		String date = "created on " + this.dateCreated.toString() + "\ncolor: " + this.color + " and filled: " + this.filled;
		return date;
	}

}
