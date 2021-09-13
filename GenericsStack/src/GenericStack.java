import java.util.ArrayList;

public class GenericStack<T> {
	
	private ArrayList<T> arrayList = new ArrayList<>();
	
	public int getSize() {
		return arrayList.size();
	}
	
	public T peek() {
		return arrayList.get(getSize()-1);
	}
	
	public void push(T value) {
		arrayList.add(value);
	}
	
	public T pop() {
		T popValue = arrayList.get(getSize()-1);
		arrayList.remove(getSize()-1);
		return popValue;
	}
	
	public boolean isEmpty() {
		return arrayList.isEmpty();
	}
	
	@Override
	public String toString() {
		return "Stack Values: " + arrayList.toString();
	}

}
