
public class Circle extends GenericShape{

	private double radius;
	
	public Circle(double radius) {
		this.radius =  radius;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 3.14 * this.radius * this.radius;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * 3.14 * this.radius;
	}
	

}
