
/**I'm going to use this tester to make sure all of the methods are working correctly
 * My own personal testing will be done after the testing you've asked for
 * @author Steven Banks
 *
 */
public class stackTesterBANKS {

	public static void main(String[] args) throws StacksBANKS.StackOverflow, StacksBANKS.StackUnderflow {
		
		//create a new stack, and all of the clothing items going into the stack
		StacksBANKS newStack = new StacksBANKS();
		clothing blueShirt = new shirt ("L", "Blue");
		clothing redShirt = new shirt("S", "Red");
		clothing greenShirt = new shirt("M", "Green");
		clothing yellowPants = new pants("36", "Yellow");
		clothing purpleSocks = new socks("M", "Purple", true);
		clothing pinkSocks = new socks("M", "Pink", true);
		
		//start adding clothing items
		newStack.push(redShirt);
		newStack.push(greenShirt);
		newStack.push(yellowPants);
		newStack.push(purpleSocks);
		newStack.push(pinkSocks);
		
		//check the stack's contents
		System.out.println();
		newStack.print();
		
		//get the stack's size
		System.out.println("Size of the stack: " + newStack.size() + "\n");
		
		/** I have commented this command out because it throws an exception
		 * StackOverflow, which I have created to avoid throwing an array out of bounds exception
		 * this exception terminates the program
		 */
		//newStack.push(blueShirt);	//expect a StackOverflow exception
		
		//remove a couple elements from the stack
		newStack.pop();
		newStack.pop();
		
		//let's make sure the size of stack didn't decrement
		System.out.println("Size of the stack: " + newStack.size() + "\n");
		
		//pop another item out
		newStack.pop();
		
		//print what remains in the stack, should only be two items
		newStack.print();
		
		//let's see what the top value is
		newStack.peek();
		
		//Empty the stack
		newStack.pop();
		newStack.pop();
		
		//Make sure it's empty
		newStack.print();
		
		//the size still hasn't been changed right?
		System.out.println("Size of the stack: " + newStack.size());
		
		//should return true
		System.out.println("Is empty?" + newStack.isEmpty() + "\n");
		
		
		//Everything after this is additional testing of my own
		StacksBANKS biggerStack = new StacksBANKS(10);
		
		//let's double check to make sure it's the correct size
		System.out.println("Size of the stack: " + biggerStack.size());
		
		//testing the isEmpty() method
		if (biggerStack.isEmpty()) {
			System.out.println("The Stack is empty");
		}
		else {
			System.out.println("You done screwed up somewhere BANKS");
		}
		
		//add some items to the stack
		biggerStack.push(blueShirt);
		biggerStack.push(redShirt);
		biggerStack.push(greenShirt);
		biggerStack.push(yellowPants);
		biggerStack.push(purpleSocks);
		biggerStack.push(pinkSocks);
		
		//check contents of the biggerStack
		System.out.println();
		biggerStack.print();
		
		//peek and make sure the top is pink socks
		System.out.println();
		System.out.println(biggerStack.peek());
		
		//create some new items to add
		clothing slacks = new pants("XL", "Black");
		clothing shorts = new pants("S", "Brown");
		clothing missmatchedSock = new socks("M", "White", false);
		clothing longSleeve = new shirt("L", "Grey");
		
		//let's add these to the stack
		biggerStack.push(slacks);
		biggerStack.push(shorts);
		biggerStack.push(missmatchedSock);
		biggerStack.push(longSleeve);
		
		//print the stack again to make sure it's all there
		System.out.println();
		biggerStack.print();
		
		//Is the stack full?
		System.out.println();
		if(biggerStack.isFull()) {
			System.out.println("The Stack is full" + "\n");
		}
		else {
			System.out.println("Whoops");
		}
		
		//peek at the top
		System.out.println(biggerStack.peek());
		System.out.println();
		
		//I'm going to empty the stack now
		while (!biggerStack.isEmpty()) {
			biggerStack.pop();
		}
		
		//is the stack empty?
		System.out.println();
		if (biggerStack.isEmpty()) {
			System.out.println("The Stack is empty");
		}
		else {
			System.out.println("Try something else");
		}
		
		//let's check my StackUnderflow exception and make sure it's throwing correctly
		//biggerStack.pop(); //And it is throwing correctly
	}
}
