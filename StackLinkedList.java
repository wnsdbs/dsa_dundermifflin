public class StackLinkedList implements IStackLinkedList {
	// Node definition for stack linked list
    public class Node{
        int data;                   // holds the integer
        Node next;                  // acts as the pointer to the next member of the stack
        Node prev;                  // acts as the pointer to the next member of the stack
        public Node(int data) {        // constructor for the new node
            this.data = data;       // having this as the only line ensures the next and prev values will be null by default
        }
    }   
    
    // initially head and tail pointers point to null
    private Node head = null;
    private Node tail = null;
    private int length = 0;
        
    // returns true if the stack is empty, false otherwise
	public boolean empty() {
		return length == 0;
	}
    
    // removes all the integers from the list
	public void clear() {	 
		head = null;
	    tail = null;
	    length = 0;
	}
	
	// returns the index in the list of the first occurrence of the specified integer, or -1 if the list does not contain that integer
	public int search(int k) {	
		// start at the beginning of the list
		Node point = head;
		// initialize an index variable to store the current position 
	    int index = 0;
	    // while loop through the list until the end is reached
	    while (point != null) {
	    	// if the current node contains k
	    	if (point.data == k) {
	    		 // return the offset index from the top of the stack 
	    		return length - index - 1;
	    	}
	    	// move to the next node in the list
	    	point = point.next;
	    	// increment the index by 1
	    	index++;
	    }
	    // if k was not found, return -1
	    return -1;
	}
	
	// returns the first integer of the stack or throws an error if the list is empty
	public int peek() {			
		// if the list is empty
	    if (tail == null) {
            throw new IllegalStateException("List is empty, try again.");
        }
	    // return the first integer of the stack
		return tail.data;
	}
		
	// returns the first integer of the stack and removes it from the list, or throws an error if the list is empty
	public int pop() {	
		// if the list is empty
		if (head == null) {
			throw new IllegalStateException("List is empty, try again.");
		}	
	    // store the value of the last element
	    int value = tail.data;
	    // if there is only one element in the list
	    if (head == tail) {
	    	// set head and tail to null
	    	head = null;
	    	tail = null;
	    } else {
	    	// update tail to the previous node
	    	tail = tail.prev;
	    	// set next pointer of the new tail to null
	    	if (tail != null) {
	    		tail.next = null;
	    	}
	    }
	    // decrement the list length by 1
	    length--;
	    // return the removed value
	    return value;
	}
	
	// puts the specified integer on the top of the stack
	public void push(int k) {
		Node kNode = new Node(k);
	    // verifying if the list is empty
	    if (head == null) {
	        // set head to k
	        head = kNode;
	        // set tail to head;
	        tail = kNode;
	    } else {
	        // set tail's next pointer to k
	        tail.next = kNode;
	        kNode.prev = tail;
	        // set tail to its next pointer
	        tail = tail.next;
	    }
	    // increment list length by 1
	    length++;
	}
	
	
	// prints the stack beginning with "[", then the integers with spaces separating each, then a "]", and prints [] if the stack is empty
    public void print() {
    	System.out.print("[");
 		// start at the beginning of the list
        Node point = head;
        while (point != null) {
            System.out.print(point.data);
            // move to the next node in the list
            point = point.next;
            // if there is another value in the list, print a space
            if (point != null) {
            	System.out.print(" ");
            }
        }
        System.out.println("]");
    }   
    
    // prints the stack beginning with "[", then the integers in reverse order with spaces separating each, then a "]", and prints [] if the stack is empty
 	public void printReverse() {				
 		if (tail == null) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        Node point = tail;
        while (point != null) {
            System.out.print(point.data);
            point = point.prev;
            if (point != null) {
                System.out.print(" ");
            }
        }
        System.out.println("]");
 	}

	public void unloadBoxes(StackLinkedList boxStack) {
	}

    public void assignBox(StackLinkedList boxStack) {
    }
 	
}
