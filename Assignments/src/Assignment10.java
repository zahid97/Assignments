import java.util.Scanner;
public class Assignment10 {
	static boolean compareLastDigit(int a,int b) {
		a = a %10;
		b = b%10;
		return (a==b);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.println("result:" +compareLastDigit(x,y));
		

	}

}
