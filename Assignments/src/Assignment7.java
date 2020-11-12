import java.util.Scanner;
public class Assignment7 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the over :");
	float a = scan.nextFloat();
	System.out.println("Enter the ball :");
	float b = scan.nextFloat();
	System.out.println("Enter the total overs :");
	float c = scan.nextFloat();
	
	float d = ((a*6+b)/(c*6))*100;
	System.out.println(d);
	if(d>75) {
		System.out.println("Yes");
	}
	else {
		System.out.println("No");
	}
	

	}

}
