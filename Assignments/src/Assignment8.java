import java.util.Scanner;
public class Assignment8 {
	static int sumOfSquaresOfEvenDigits(int n) {
	int	sum = 0;
		while(n!=0) {
		int	b = n%10;
			if(b%2==0) {
				sum += (b*b);
			}
		n =n/10;
		}
		return sum;
	}


	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter an integer:");
	int a = scan.nextInt();
	int result = Assignment8.sumOfSquaresOfEvenDigits(a);
	System.out.println("Sum of square of even digits is: " + result );

	}

}
