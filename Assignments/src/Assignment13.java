import java.util.Scanner;
public class Assignment13 {
	static int validateNumber(String s1) {
		if(s1.matches("[0-9]{3}[-][0-9]{3}[-][0-9]{4}")) {
			return 1;
		}
	
	else {
		return -1;}
	}	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n1=scan.nextLine();
		int c=Assignment13.validateNumber(n1);
		if(c==1)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}

}
