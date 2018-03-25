
/**This creates the class stacks, and implements both public and private methods
 * in an effort to hide certain information
 * @author Steven Banks
 *
 */
public class StacksBANKS extends clothing{
	
	//create variables
	private int stackSize = 5; //default stack size
	private int top; //the top element of the stack
	private clothing[] clothingStack; //the array used in the stack
	
	/**
	 * the default constructor sets the size to 5
	 */
	public StacksBANKS() {
		clothingStack = stack(stackSize);
	}
	/**
	 * @param size user defined size of stack
	 */
	public StacksBANKS(int size) {
		clothingStack = stack(size);
	}
	
	/**
	 * @return the size of stack
	 */
	public int getStackSize() {
		return stackSize;
	}
	/**
	 * @param stackSize set the size of the stack
	 */
	public void setStackSize(int size) {
		this.stackSize = size;
	}
	
	
	/**
	 * @param size takes user defined size from constructor
	 * @return	creates a new empty array
	 */
	private clothing[] stack(int size) {		
		stackSize = size;
		top = -1;
		return clothingStack = new clothing[size];
	}
	/**
	 * @return the size of the stack
	 */
	public int size() {
		return stackSize;
	}
	/**
	 * prints all of the elements currently in the stack
	 */
	public void print() {
		printStack();
	}
	/**this method uses a private method to hide data
	 * @param item  must be a clothing object
	 * @throws StackOverflow if trying to push onto a full stack
	 */
	public void push(clothing item) throws StackOverflow{
		addElement(item);
	}
	/**this method uses a private method to hide data
	 * @return a message stating which clothing item was removed from stack
	 * @throws StackUnderflow  if trying to pop an empty array
	 */
	public clothing pop() throws StackUnderflow{
		return removeElement();
	}
	/**this method utilizes a private method to hide data
	 * @return	the top element of the stack
	 */
	public clothing peek() {
		return top();
	}
	/**
	 * @return true if stack is empty
	 */
	public boolean isEmpty() {
		return (top == -1);
	}
	/**
	 * @return true if stack is full
	 */
	public boolean isFull() {
		return (top == stackSize-1);
	}
	
	/**
	 * @param item	a clothing object
	 * @throws StackOverflow	if trying to push on a full stack
	 */
	private void addElement(clothing item) throws StackOverflow {
		if (!isFull()) {
			clothingStack[++top] = item; //as long as stack is not full, increment top and add item
		}
		else {
			throw new StackOverflow("Stack Overflow");
		}
	}
	/**
	 * @return	a message stating what item was removed from stack
	 * @throws StackUnderflow	if trying to pop an empty stack
	 */
	private clothing removeElement() throws StackUnderflow {
		if (isEmpty()) {
			throw new StackUnderflow("Stack Underflow");
		}
		else {
			System.out.println("You've removed " + clothingStack[top] + " from the stack."); //easier to see in action in the tester
			return clothingStack[top--];
		}
	}
	/**
	 * @return	return the top element of the stack
	 * Since I have it return a clothing object, I set the default (empty) value
	 * to null, so it wouldn't throw an exception that could give away that I'm using an array
	 */
	private clothing top()  {
		if (top >= 0) {
			//System.out.println(top);
			return clothingStack[top];
		}
		else {
			return null;
		}
	}
	/**
	 * private method that returns all values held in the stack from top to bottom
	 */
	private void printStack() {
		for (int i = top; i >= 0; i--) {
			System.out.println(clothingStack[i]); 
		}
	}
	

	/**
	 * @author Steven Banks
	 *	these are custom exceptions that are thrown to avoid overly-descriptive exceptions in the main
	 */
	public class StackOverflow extends Exception{
		public StackOverflow(String overflow) {
		}
	}
	public class StackUnderflow extends Exception{
		public StackUnderflow(String underflow) {			
		}
	}
}

	
