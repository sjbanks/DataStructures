
/**
 * @author Steven Banks
 *
 */
public class CallStackBANKS {

	public static void main(String[] args) {
		
		System.out.println("In Main Method.");
		
		method1();
		method2();
		method3();
		method4();
		method2();
		method3();
		method1();
		method4();
		method3();
		method2();
		method1();
		
		System.out.println("Exiting Main.");
	}
	
	public static void method1() {
		System.out.println("In Method 1.");
		System.out.println("Exiting Method 1.");
	}
	public static void method2() {
		System.out.println("In Method 2.");
		System.out.println("Exiting Method 2.");
	}
	public static void method3() {
		System.out.println("In Method 3.");
		System.out.println("Exiting Method 3.");
	}
	public static void method4() {
		System.out.println("In Method 4.");
		System.out.println("Exiting Method 4.");
	}
}
