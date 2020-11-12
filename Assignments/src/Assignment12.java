import java.util.Scanner;
public class Assignment12 {
	static int getBigDiff(int[] x) {
		int max = 0;
		int diff;
		for(int i=0;i<x.length;i++) {
			if(x[i]>max) {
				max = x[i];
			//System.out.println(max);
			}
		}
		int min =max;
		for(int j=0;j<x.length;j++) {
			if(x[j]<max) {
				min= x[j];
			}
		}
	return diff = max-min;
}

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the size of two arrays: ");
	int size = scan.nextInt();
	int[] arr = new int[size];
	System.out.println("Enter the array elements:");
	for(int i=0;i<size;i++) {
		arr[i] = scan.nextInt();		
	}
	
	if(size==1) {
		System.out.println(arr[0]);
	}
	else {
	int result = Assignment12.getBigDiff(arr);
	System.out.println(result);
	}
	}

}
