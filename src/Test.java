
import java.util.Scanner;


	public class Test {

		
		
	// EXAMPLE 1
		public static int ex1(int[] a) {
			int max = a[0];
			for(int i=0;i<a.length;i++) {
				if(a[i]>max) {
					max = a[i];
				}
				else {
					continue;
				}
			}
			return max;
		}
		
		
	// EXAMPLE 2
		public static boolean isPrime(int n) {
			if(n<2) {
				return false;
			}
			for(int i=2; i<n; i++) {
				if(n%i == 0) {
					return false;
				}
			}
			return true;
		}
		public static int[] ex2(int n) {
			int[] primes = new int[n];
			int check = 2;
			for(int i=0; i<n; i++) {
				if(isPrime(check)) {
					primes[i] = check;
					check++;
				}
				else {
					check++;
					i -= 1;
					continue;
				}
			}
			return primes;
		}
		

	// EXAMPLE 3
		public static int[] ex3(int[] ls) {
			int[] temp = new int[ls.length];
			temp[0] = ls[ls.length-1];
			for(int i=0; i<(ls.length-1); i++) {
				temp[i+1] = ls[i];
			}
			return temp;
		}

		
	// EXAMPLE 4
		public static int[] ex4(int[] ls) {
			int first = ls[ls.length-1];
			for(int i=ls.length-1;i>0;i--) {
				ls[i] = ls[i-1];
			}
			ls[0] = first;
			return ls;
		}
		
		
	// EXAMPLE 5
		public static int[] getInterOne(int[] a, int[] b) {
			int size = 0;
			for(int i = 0; i<a.length; i++) {
				for(int j = 0; j<b.length; j++) {
					if(a[i] == b[j]) {
						size++;
						break;
					}
				}
			}
			int[] c = new int[size];
			int n2=0;
			for(int i = 0; i<a.length; i++) {
				for(int j = 0; j<b.length; j++) {
					if(a[i] == b[j]) {
						c[n2]= a[i];
						n2++;
					}
				}
			}
		return c;
		}

	


		

	  

  
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);                                      // Create Instance of input to gather information
		
		System.out.print("Enter Size of Array1 where 0 is your first position: ");  //Choosing size of array
		int n = in.nextInt(); //getting user input  for size
		int[] myarray1 = new int[n];  //creating my array
		System.out.print("Enter Size of Array2 where 0 is your first position: ");
		int k = in.nextInt(); //getting user input  for size
		int[] myarray2 = new int[k];  //creating my array
		System.out.print("Enter Value for  the indicies of the array1 starting at 0: ");  //enter values for the array, first value entered is at index 0
		
		
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			myarray1[i] = x;
			System.out.println("index " + i + " of the array stores the value: " + x);     //Prints value corresponding to index iz
		}
		
		System.out.print("Enter Value for  the indicies of the array2 starting at 0: ");  //enter values for the array, first value entered is at index 0
		
		
		for (int i = 0; i < k; i++) {
			int x = in.nextInt();
			myarray2[i] = x;
			System.out.println("index " + i + " of the array stores the value: " + x);     //Prints value corresponding to index iz
		}
		
		System.out.println("This is Array 1:");
		for (int i = 0; i < myarray1.length; i++) {
			System.out.print(myarray1[i]);
			System.out.print(", ");
		}
		System.out.println("");
		System.out.println("This is Array 2:");
			for (int i = 0; i < myarray2.length; i++) {
				System.out.print(myarray2[i]);
				System.out.print(", ");
			}
			System.out.println("");
	    System.out.println("This is the intersected array:");
	    int[]intersection=getInterOne(myarray1, myarray2);
		for (int i = 0; i < intersection.length; i++) {
			System.out.print(intersection[i]);
			System.out.print(", ");
		}

	}

}

