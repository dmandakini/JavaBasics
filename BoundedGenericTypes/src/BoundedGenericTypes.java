
public class BoundedGenericTypes {
//GenericSubtype can be specified as a subtype of another type
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec =  new Rectangle(2,4);
		Circle cir = new Circle(3);
		System.out.print(equalArea(rec, cir));

	}
	
	public static <E extends GenericShape> boolean equalArea(E object1, E object2) {
		return object1 == object2;
	}

}
