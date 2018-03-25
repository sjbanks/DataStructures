import java.util.Scanner;
/**This program will simulate the towers of Hanoi puzzle game
 * and returns the minimum number of moves required to solve
 * @author Steven Banks
 *
 */
public class towersOfHanoiBANKS {

	public static void main(String[] args) {
		
	int n;	//n is the number of disks
	Scanner in = new Scanner(System.in);	//allows for user input
	
	System.out.print("Enter number of disks: ");	//prompt user for input
	n = in.nextInt();	//store input in int variable n
	
	solve(n, "A", "B", "C"); //calls the solve method and names the towers A B and C
	System.out.println(n + " disks requires " + moves + " moves.");	//returns minimum moves required to solve puzzle
	
	in.close();	//close that scanner!
	}
	
	static int moves = 0;	//have to initialize the variable outside of the recursion
	/**This method solves the puzzle in the least possible moves
	 * @param n		is the user-input number of disks in the puzzle
	 * @param start	is the first tower
	 * @param spare	is the third tower
	 * @param dest	is the middle tower and where we need to move the disks
	 */
	public static void solve(int n, String start, String spare, String dest) {
	
		if (n == 1) {	//if the top disk is the smallest, move it
			moves++;
		}
		else {
			solve(n - 1, start, dest, spare);	//step 1
			moves++;							//step 2
			solve(n - 1, spare, start, dest);	//step 3
		}
	}
}
