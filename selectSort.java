// selectSort.java
// demonstrates selection sort
// to run this program: C>java SelectSortApp
////////////////////////////////////////////////////////////////
class ArraySel {
	private long[] a; // ref to array a
	private int nElems; // number of data items
	// --------------------------------------------------------------

	public ArraySel(int max) // constructor
	{
		a = new long[max]; // create the array
		nElems = 0; // no items yet
	}

	// --------------------------------------------------------------
	public void insert(long value) // put element into array
	{
		a[nElems] = value; // insert it
		nElems++; // increment size
	}

	// --------------------------------------------------------------
	public void display() // displays array contents
	{
		for (int j = 0; j < nElems; j++) // for each element,
			System.out.print(a[j] + " "); // display it
		System.out.println("");
	}

	// --------------------------------------------------------------
	public void selectionSort() {
		int out, in, min;
		for (out = 0; out < nElems - 1; out++) // outer loop
		{
			min = out; // minimum
			for (in = out + 1; in < nElems; in++) // inner loop
				if (a[in] < a[min]) // if min greater,
					min = in; // we have a new min
			swap(out, min); // swap them
		} // end for(out)
	} // end selectionSort()
		// --------------------------------------------------------------

	private void swap(int one, int two) {
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
	// --------------------------------------------------------------
} // end class ArraySel
	////////////////////////////////////////////////////////////////

class SelectSortApp {
	public static void main(String[] args) {
		int maxSize = 220000; // array size
		int maxNum = 100; //again, for some reason won't display anything in my console if I set the RNG to maxSize - 1
		ArraySel arr; // reference to array
		arr = new ArraySel(maxSize); // create the array
		
		for(int j=0; j<maxSize; j++) // fill array with
		{ // random numbers
		  long n = (long)( java.lang.Math.random()*(maxNum-1) );
		  arr.insert(n);
		}
		
		//arr.display(); // display items
		//System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~SORT~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		long time1 = System.nanoTime();
		arr.selectionSort(); // selection-sort them
		long time2 = System.nanoTime();
		long timeTaken = time2 - time1;
		double timeSeconds = timeTaken * .000000001;
		System.out.println("Sort took: " + timeTaken + " nano seconds.");
		System.out.println("Sort took: " + timeSeconds + " seconds.");
		//arr.display(); // display them again
	} // end main()
} // end class SelectSortApp
	////////////////////////////////////////////////////////////////
