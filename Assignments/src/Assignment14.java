import java.util.Scanner;
public class Assignment14 {
	static int validPassword(String n){
		if(n.matches(".*[0-9]{1,}.*") && n.matches(".*[@#$]{1,}.*") && n.length()>=6 && n.length()<=20) {
			return 1;
		}
		else {
			return -1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Password: ");
		String a = scan.nextLine();
		int pass = Assignment14.validPassword(a);
		if(pass==1) {
			System.out.println("Valid Password");
		}
		else {
			System.out.println("Invalid Password");
		}

	}

}
