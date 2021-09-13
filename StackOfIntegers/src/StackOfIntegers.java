//Name: Mandakini Das
//ID:   71776990
//mail: mxd76990@ucmo.edu
public class StackOfIntegers {
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;
	
	public StackOfIntegers() {
		
		this.elements = new int[DEFAULT_CAPACITY];	
	}
	
	
	public StackOfIntegers(int capacity) {
		this.elements = new int[capacity];	
	}
	
	//Check if the stack is empty
	public boolean empty() {
		if (this.size > 0) {
			return false;
		}
		return true;
		
		//another way
		//return this.size==0
	}
	
	//return the uppermost value in the stack
	public int peek() {
		return this.elements[this.size-1];
	}
	
	//push the element
	public void push(int value) {
		if(this.size >= this.elements.length) {
			var newArray=new int[this.elements.length+1];
			for(int i=0;i<this.elements.length; i++) {
				newArray[i]=this.elements[i];		
			}
			this.elements=newArray;
		}	
		this.elements[this.size]=value;
		this.size++;
		}

	//remove the top element and return
	public int pop() {
		var element = this.elements[this.size-1];
		this.elements[this.size-1]=0;
		this.size--;
		return element;
	}
	
	//return size of stack
	public int getSize() {
		return this.size;
	}
}
