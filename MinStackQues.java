/*
Design a Stack to support an additional operation that returns the minimum element from the stack in constant time. The stack should continue supporting all other operations like push, pop, top, size, empty, etc., with no degradation in these operations’ performance.
*/
class MinStack {
	private int[] stack;
	private int[] auxil;
	private int tops = -1;
	private int topa = -1;
	private int size = -1;

	// Constructor
	public MinStack(int size) {
		this.size = size;
		stack = new int[size];
		auxil = new int[size];
	}

	//Push Operation 
	public void push(int x) {

		if (isFull()) {
			System.out.println("Stack Topped can't Push");
		} else {
			stack[++tops] = x;

			if (topa == -1 || auxil[topa] >= x) {
				auxil[++topa] = x;
			}
		}

	}

	//Pop Operation
	public int pop() {
		int x;
		if (isEmpty()) {
			System.out.println("Stack Clapped can't Pop");
			x = -1;
		} else {
			x = stack[tops];
			tops--;
			if (topa != -1 && x == auxil[topa]) {
				topa--;
			}
		}

		return x;
	}

	//Returns Minimum Element of the Stack
	public int minPeek() {
		return topa != -1 ? auxil[topa] : -1;
	}

	//Returns Top Element of the Stack
	public int peek() {
		return tops != -1 ? stack[tops] : -1;
	}

	//Checks if Main Stack is Empty or Not
	public boolean isEmpty() {
		return tops == -1 ? true: false;
	}

	//Checks if Main Stack is Full or Not
	public boolean isFull() {
		return tops == size - 1 ? true: false;
	}

}

public class MinStackQues {
	public static void main(String[] args) {
		MinStack s = new MinStack(10);

		s.push(6);
		System.out.println(s.minPeek()); // prints 6
		s.push(7);
		System.out.println(s.minPeek()); // prints 6
		s.push(8);
		System.out.println(s.minPeek()); // prints 6
		s.push(5);
		System.out.println(s.minPeek()); // prints 5
		s.push(3);
		System.out.println(s.minPeek()); // prints 3
		s.pop();
		System.out.println(s.minPeek()); // prints 5
		s.push(10);
		System.out.println(s.minPeek()); // prints 5
		s.pop();
		System.out.println(s.minPeek()); // prints 5
		s.pop();
		System.out.println(s.minPeek()); // prints 6

	}
}
