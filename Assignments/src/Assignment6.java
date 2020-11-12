import java.util.Scanner;
public class Assignment6 {
	String y = "yes";
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Is Coach Present?");
	String Useranswer = scan.nextLine();
	//System.out.println(Useranswer.toLowerCase());
	if(Useranswer.toLowerCase().equals("yes")) {
		System.out.println("Keeping");
	}
	else if(Useranswer.toLowerCase().equals("no")){
		System.out.println("Batting");
	}
	else {
		System.out.print("Invalid Input");
	}
	}

}
