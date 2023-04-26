public class methodValidation extends RegisterACC {
	
	public static boolean capitalLetter = false;
	public static boolean lowerCase = false;
	public static boolean numPass = false;
	//public static char[] a = new char[]{'!', '@', '#','$','%','^','&','*','(',')'};
	public static String[] b = new String[]{"!", "@", "#","$","%","^","&","*","(",")","_","-","=","<",">","?","/","{","}","[","]",";",":","|","~"};
	public static boolean haveChar = false;
	public static boolean UPcase = false;
	public static boolean LOWcase = false;
	public static boolean Mlenght = false;
	public static boolean exceed = false;
	public static char check;
	public static boolean Havenum = false;
	
	
	public static char firstDigit;
	public static boolean CheckerForNum = false;
	public static boolean CheckerForNum2 = false;
	public static boolean RNisValid = false;
	public static char responseko;
	
	
	
	public static void Emailvalidation() {
		if(emaila.endsWith("@ama.edu.ph") && emaila.length() > 12) {
			EmailisValid = true;
			System.out.println("This email is qualified and available!");
			System.out.println(" ");
		}
		else if(emaila.endsWith("@ama.edu.ph")){
			System.out.println("The Email Address is valid but it doesn't contain a username!");
			System.out.println(" ");
			EmailisValid = false;
		}else if(emaila.isBlank()) {
			System.out.println("Email address cannot be Empty!");
			EmailisValid = false;
		}
		else {
			EmailisValid = false;
			System.out.println("The Email address is unavailable!");
			System.out.println("(Make sure you use the email address '@ama.edu.ph' so it would successfully register your account!)");
			System.out.println(" ");
		}
	}
		
		public static boolean UpandLowChecker() {
			
			CharacterChecker();
			
			for(int i = 0; i < passwords.length(); i++) {
					
				
			
				check = passwords.charAt(i);
				
				if(Character.isUpperCase(check)){
					UPcase = true;
				}if(Character.isDigit(check)) {
					Havenum = true;
				}
				if(Character.isLowerCase(check)) {
					LOWcase = true;
				}
				if(passwords.length() >= 10) {
					Mlenght = true;
				}
				//
				
			}
					//
					
				
				if(UPcase == true && LOWcase == true && haveChar == true && Mlenght == true && Havenum == true) {
					System.out.println("(Looking good! It contains Symbol, Upper, and Lower case, and Numbers!)");
					
					PasswordisValid = true;
				}else if(UPcase == true && LOWcase == true && haveChar == true && Havenum == true ) {
					System.out.println("(Warning! The password only contains Character symbol, numbers, upper, and lower case!)");

					//exceed = false;
					UPcase = false;
					LOWcase = false;
					haveChar = false;
					Havenum = false;
					
					
					PasswordisValid = false;
					
					//System.out.println("Enter Password: ");
					//passwords = in.nextLine();
					
					//UpandLowChecker();
					
				}
				else if(UPcase == true && LOWcase == true && haveChar == true ) {
					System.out.println("(Warning! The password only contains Character symbol, upper, lower case!)");
					
					//exceed = false;
					UPcase = false;
					LOWcase = false;
					haveChar = false;
					
					
					PasswordisValid = false;
					
					//System.out.println("Enter Password: ");
					//passwords = in.nextLine();
					//UpandLowChecker();
					
				}else if(UPcase == true && haveChar == true && Havenum == true) {
					System.out.println("(Warning! The password only contains Character Symbol, numbers and Upper case letter!)");
	
					UPcase = false;
					haveChar = false;
					Havenum = false;
					
					PasswordisValid = false;
				}
				else if(UPcase == true && haveChar == true) {
					System.out.println("(Warning! The password only contains Character symbol and upper case letter!)");
					
					UPcase = false;
					haveChar = false;
					
					PasswordisValid = false;
					
				}else if(haveChar == true && Havenum == true) {
					System.out.println("(Warning! The password only contains Character symbol, and numbers!)");
					
					haveChar = false;
		
					
					PasswordisValid = false;
				}
				
				else if(haveChar == true) {
					System.out.println("(Warning! The password only contains Character symbol!)");
					
					haveChar = false;
		
					
					PasswordisValid = false;
				}
				else if(LOWcase == true && haveChar == true) {
					System.out.println("(Warning! The password only contains Character and lower case!)");
					
					haveChar = false;
					LOWcase = false;
					
					
					PasswordisValid = false;
				}
				else if(LOWcase == true && haveChar == true && Havenum == true) {
					System.out.println("(Warning! The password only contains Character, numbers and lower case!)");
					
					haveChar = false;
					LOWcase = false;
					Havenum = false;
					
					
					PasswordisValid = false;
					
					
				}else if(UPcase == true && LOWcase == true && Havenum == true) {
					System.out.println("(Warning! The password only contains Numbers, upper and lower case!)");
					
					UPcase = false;
					LOWcase = false;
					Havenum = false;
					//exceed = false;
					
					PasswordisValid = false;
					
					
				}else if(UPcase == true && LOWcase == true) {
					System.out.println("(Warning! The password only contains Upper and Lower case!)");
					
					UPcase = false;
					LOWcase = false;
					
					//exceed = false;
					
					PasswordisValid = false;
					
					
				}else if(UPcase == true && Havenum == true) {
					System.out.println("(Warning! The password only contains Numbers, and upper case!)");
					
					UPcase = false;
					Havenum = false;
					//exceed = false;
					
					PasswordisValid = false;
					
					
				}
				else if(UPcase == true) {
					System.out.println("(Warning! The password only contains Upper case!)");
					UPcase = false;
					//exceed = false;
					
					PasswordisValid = false;
					
					
				}else if(LOWcase == true && Havenum == true) {
					System.out.println("(Warning! The password only contains Numbers and lower case!");
					LOWcase = false;
					Havenum = false;
					
					

					PasswordisValid = false;
					
					
				}else if(Havenum == true) {
					System.out.println("(Warning! The password only contains Number!)");
					Havenum = false;
					
					
					PasswordisValid = false;
					
				}
				else if(LOWcase == true) {
					System.out.println("(Warning! The password only contains Lower case!)");
					LOWcase = false;
					
					
					PasswordisValid = false;
					
				}
				else if(passwords.isEmpty()) {
					System.out.println("(Warning! It doesn't contain anything!)");
					
					PasswordisValid = false;
					
				}
				else {
					System.out.println("(Warning! Please Include At least 1 Upper Case, Lower Case, Number and Character Symbol!)");
					
					PasswordisValid = false;
					
				}
				
				if(Mlenght == true) {
					System.out.println("Great! The Password length is more than 9 values!");
					System.out.println(" ");
				}else if(Mlenght == false) {
					System.out.println("(Remember! The minimum Input for Password is 10 values!");
					System.out.println(" ");
				}
				
				
				return false;
		}
		
		public static boolean CharacterChecker() {
			for(int i = 0; i < b.length; i++ ) {
				if(passwords.contains(b[i])) {
					haveChar = true;
				}
			}
			return haveChar;
		}
		
		public static void RecoveryNum() {
			//I've deleted some of the way in converting int to string and int to char and my answer it is not  worth it!
			//numberFirst = Integer.toString(recoverynum);
			
			
			//checkRecov = numberFirst.charAt(0);
			
			for(int j = 0; j < recoverynum.length(); j++) {
				firstDigit =recoverynum.charAt(j);
				
				if(!Character.isDigit(firstDigit)) {
					CheckerForNum2 = true;
				}
				if(Character.isDigit(firstDigit)) {
					CheckerForNum = true;
				}
				
			}
			if(CheckerForNum && !CheckerForNum2) {
				RNisValid = true;
			}
			
			
			
			/* Condition in inputing the recovery numbers! Make sure it doesn't contain any string values! Patay ka kay sir jemar
			if(CheckerForNum && !CheckerForNum2 ) 
				
			
			else if(CheckerForNum2) 
				
			*/
			
			// The way(condition) to print out the message
			// should start with '0' and 11 in length!

			if(recoverynum.startsWith("0") && recoverynum.length() == 11 && RNisValid == true) {
				RecoveryNumisValid = true;
				System.out.println("The Recovery number is valid!");
				
				System.out.println(" ");
				
			}else if(recoverynum.startsWith("0") && RNisValid == true) {
				System.out.println("The Recovery number must be 11 digits!");
				
				System.out.println(" ");
				RNisValid = false; 
				
				RecoveryNumisValid = false;
				
			}else if(!recoverynum.startsWith("0") && RNisValid == true) {
				System.out.println("The Recovery number must start with the number '0' and must be 11 digits!");
				
				RNisValid = false;
				System.out.println(" ");
				RecoveryNumisValid = false;
			}else if(recoverynum.isEmpty()) {
				System.out.println("Please input some numbers! It doesn't contain anything!");
				
				RNisValid = false;
				System.out.println(" ");
				RecoveryNumisValid = false;
			}
			
			else {
				System.out.println("Please input numbers only and must be 11 digits!");
				RNisValid = false;
				System.out.println(" ");
				RecoveryNumisValid = false;
			}
		}
}
