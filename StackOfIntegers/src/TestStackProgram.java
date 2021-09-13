//Name: Mandakini Das
//ID:   71776990
//mail: mxd76990@ucmo.edu

public class TestStackProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackOfIntegers  stack = new  StackOfIntegers(3);
		System.out.println(stack.getSize());
		System.out.println(stack.empty());
		
		stack.push(4);
		stack.push(3);
		stack.push(1);
		stack.push(32);
		
		System.out.println(stack.getSize());
		
		System.out.println(stack.empty());
		System.out.println(stack.peek());
		
		System.out.println(stack.pop());
		System.out.println(stack.getSize());
		System.out.println(stack.peek());
			

	}

}
