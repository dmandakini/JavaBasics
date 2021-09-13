import java.util.Date;

public abstract class GenericShape {
	private String color;
	private boolean filled;
	private Date dateCreated;
	
	protected GenericShape() {
		this.dateCreated = new Date();
	}
	
	protected GenericShape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		this.dateCreated = new Date();
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public Date  getDateCreated() {
		return this.dateCreated;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
	
	
}
