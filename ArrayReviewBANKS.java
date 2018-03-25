
/**
 * This program creates an array with ten entries of randomly generated numbers
 * from 1 to 25 and uses three loops to generate and display the information.
 * @author sjbanks
 * 
 */
public class ArrayReviewBANKS {

	public static void main(String[] args) {
		
		//Constants for all the values, since they were given
		final int MAX_SIZE = 10;
		final int SMALLEST = 1;
		final int LARGEST = 25;
		int randomArray[] = new int[MAX_SIZE];
	
		//this loop creates the random numbers between 1 and 25
		for (int i = 0; i < randomArray.length; i++) {
			//went back to look at my randomten array, and noticed I lost a point for doing this incorrectly. 
			//I looked it up on stackoverflow, so I hope this is correct
			int s = SMALLEST + (int) (Math.random() *(LARGEST - SMALLEST) + SMALLEST); 
			randomArray[i] = s;
		}
	
		//enhanced loop to print out the full contents of the array
		System.out.print("Random number array: ");
		for (int element : randomArray) {
			System.out.print(element + " ");
		}
		
		//new line
		System.out.println();
		
		//final loop to display formatted output
		for (int n = 0; n < randomArray.length; n++) {
			System.out.print("randomArray element at index[" + n + "] = " + " " + randomArray[n] + "\n");
		}
	}

}
