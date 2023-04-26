import java.util.Scanner;

	public class RegisterACC {
		
		
	public static Scanner in = new Scanner(System.in);
	public static String emaila = "";
	public static String name = "";
	public static String passwords = "";
	public static String recoverynum = "";
	public static boolean EmailisValid = false;
	public static boolean PasswordisValid = false;
	public static boolean NameisValid = false;
	public static boolean RecoveryNumisValid = false;
	public static boolean Retake = false;
	public static String Confirmpass = "";
	public static String Confirmrecoverynum = "";
	
		
	
	
	public static void EmailChecker() {
		System.out.println("=================================================================================================================================");
		System.out.println("[NOTE! The only email address available in registering your account is the email address '@ama.edu.ph']");
		System.out.println("Enter Email Address: ");
		emaila = in.nextLine();
		System.out.println("=================================================================================================================================");
	}
	
	public static void NameofUser() {
		System.out.println("=================================================================================================================================");
		System.out.println("Enter your Name: ");
		name = in.nextLine();
		System.out.println("=================================================================================================================================");
		if(!name.isBlank()) {
			 NameisValid = true;
			 System.out.println(name+", such a wonderful name!");
			 System.out.println(" ");
			
		}
		else if(name.isBlank()) {
			System.out.println("You can't leave nothing in your name!");
			System.out.println("Please input your name!");
			System.out.println(" ");
			NameofUser();
		}
		else if(name.isEmpty()) {
			System.out.println("You can't leave nothing in your name!");
			System.out.println("Please input your name!");
			System.out.println(" ");
			NameofUser();
		}
	}
	public static void PasswordChecker() {
		System.out.println("=================================================================================================================================");
		System.out.println("[Making the password strong it must contains lower, upper case, symbol, number and the length must be at least 10 values!]");
		System.out.println("Enter Password: ");
		passwords = in.nextLine();
		System.out.println("=================================================================================================================================");
		ConfirmPass();
	}
	
	public static void RecoveryPhone() {
		//Using int in inputing the value could have problem in finding the first digit "0" 
		//I've wasted a lot of time finding a way out in comparing the value(Recovery number) using int but it turns out it's fucking annoying I suggest you use String
		System.out.println("=================================================================================================================================");
		System.out.println("[Recovery number must start at 0 and the length must be exactly 11!]");
		System.out.println("Enter Recovery Number: ");
		recoverynum = in.nextLine();
		System.out.println("=================================================================================================================================");
		
		ConfirmPhone();
		/*System.out.println("Enter Recovery Number: ");
		recoverynum = in.nextInt();
		*/
	}
	public static void Status() {
		
	if(EmailisValid == true) {
		System.out.println("=================================================================================================================================");
		System.out.println("[True]The Email is Eligible! ");
	}
	else if(EmailisValid == false) {
		System.out.println("[False]The Email is not Eligible or it does not meet the given conditions! ");
	}
	
	
	if(NameisValid == true) {
		System.out.println("[True]The Name is Eligible!");
	}
	else if(NameisValid == true){
	System.out.println("[False] The Name is not Eligible!");
	}
	
	if(PasswordisValid == true){
		System.out.println("[True]The Password is strong and valid! ");
	}
	else if(PasswordisValid == false) {
		System.out.println("[False]The Password is not valid or it does not meet the given requirements!");
	}
	
	if(RecoveryNumisValid == true) {
		System.out.println("[True]The Recovery phone satisfies the condition therefore it is valid! ");
	}
	else if(RecoveryNumisValid == false) {
		System.out.println("[False]The Recovery phone did not satisfies the condition therefore it is not valid!");
	}
	
	if(RecoveryNumisValid == true && PasswordisValid == true && EmailisValid == true && NameisValid == true) {
		Retake = true;
	}
	else {
		Retake = false;
	}
	System.out.println("=================================================================================================================================");
	}
	
	public static void ConfirmPass() {
		System.out.println("Please enter again to confirm your password: ");
		Confirmpass = in.nextLine();
		System.out.println("=================================================================================================================================");
		
		if(Confirmpass.equals(passwords)) {
			System.out.println("Password Match!");
		}else if(!Confirmpass.equals(passwords)){
			System.out.println("The confirmation password you input doesn't Match!");
			System.out.println(" ");
			ConfirmPass();
		}else {
			System.out.println("System Error!");
			System.exit(0);
		}
		
		
	}
	public static void ConfirmPhone() {
		System.out.println("Please enter again to confirm your recovery number: ");
		Confirmrecoverynum = in.nextLine();
		
		System.out.println("=================================================================================================================================");
		
		if(Confirmrecoverynum.equals(recoverynum)){
			System.out.println("Great! The recovery number Match!");
		}
		else if(!Confirmrecoverynum.equals(recoverynum)) {
			System.out.println("Oh no! The recovery doesn't Match, Please try again!");
			System.out.println(" ");
			ConfirmPhone();
		}
		else {
			System.out.println("System Error!");
			System.exit(0);
		}
	
}
	}
	
