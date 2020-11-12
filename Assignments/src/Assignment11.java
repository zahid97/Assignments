import java.util.Scanner;
public class Assignment11 {
	static int getSumOfIntersection(int[] x , int[] y) {
		int sum = 0;
		for(int i=0;i<x.length;i++) {
			int a = x[i];
			for(int j=0;j<y.length;j++) {
				int b = y[j];
				if(a==b) {
					int c = b;
					sum += c;
				}
			}
		}
		return sum;
	}
	

	public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the size of two arrays: ");
	int size1 = scan.nextInt();
	int size2 = scan.nextInt();
	int[] arr1 = new int[size1];
	int[] arr2 = new int[size2];
	System.out.println("Enter the array elements:");
	for(int i=0;i<size1;i++) {
		arr1[i] = scan.nextInt();		
	}
	for(int i=0;i<size2;i++) {
		arr2[i] = scan.nextInt();		
		}
	int result = Assignment11.getSumOfIntersection(arr1, arr2);
		if(result==0) {
			System.out.println("No matching element found");
		}
		else {
			System.out.println("The sum is: " +result);
		}
	}

}
