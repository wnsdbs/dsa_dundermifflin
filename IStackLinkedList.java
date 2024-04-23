public interface IStackLinkedList {
	public boolean empty();			// returns true if the stack is empty, false otherwise
	public void clear();			// removes all the integers from the stack
	public int search(int k);		// returns the offset from the top of the stack of the first occurrence of the specified integer, or -1 if the stack does not contain that integer
	public int peek();				// returns the first integer of the stack or throws an error if the list is empty
	public int pop();				// returns the first integer of the stack and removes it from the list, or throws an error if the list is empty
	public void push(int k);		// puts the specified integer on the top of the stack
	public void print();			// prints the stack beginning with "[", then the integers with spaces separating each, then a "]", and prints [] if the stack is empty
	public void printReverse();		// prints the stack beginning with "[", then the integers in reverse order with spaces separating each, then a "]", and prints [] if the stack is empty
}
