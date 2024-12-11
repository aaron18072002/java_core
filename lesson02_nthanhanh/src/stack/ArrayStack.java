package stack;

public class ArrayStack implements Stack {
	
	private Integer[] array;
	private int size;
	private int topIndex;
	
	public ArrayStack(int size) {
		this.size = size;
		this.array = new Integer[size];
		this.topIndex = -1;
	}

	@Override
	public void push(int value) {
		if(!isFull()) {
			this.array[++this.topIndex] = value;
			this.topIndex++;
		}
	}

	@Override
	public int pop() {
		if(!isEmpty()) {
			int value = this.array[this.topIndex];
			this.array[this.topIndex] = null;
			this.topIndex--;
			return value;
		}
		return -1;
	}

	@Override
	public boolean isEmpty() {
		return this.topIndex < 0;
	}

	@Override
	public boolean isFull() {
		return this.topIndex == this.size - 1;
	}

}
