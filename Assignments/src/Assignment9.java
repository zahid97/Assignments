import java.util.Scanner;
public class Assignment9 {
	 static int countseven(int n) {
		int count = 0;
		while(n!=0) {
			int b = n%10;
			if(b%7==0) {
				count++;
			}
			n=n/10;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your intger: ");
		int a = scan.nextInt();
		int result = Assignment9.countseven(a);
		System.out.println("Countof seven is: " +result);
		

	}

}
