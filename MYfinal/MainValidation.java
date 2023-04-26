import java.util.Scanner;

public class MainValidation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		RegisterACC RA = new RegisterACC ();
		methodValidation MV = new methodValidation();
		char response;
		char responsekoS;
		boolean sanaol = false;
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("****************************************************** Greetings, Technophiles! ****************************************************************");
		System.out.println("************************************************** Welcome to Computer Science Club! ***********************************************************");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Be part of the Most Enthusiastic Group of Progammers, Computer Scientist,Software Developer and Engineer!");
		System.out.println("Want to Sign up or Register? [Y] for Yes [N] for No");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
		
		
		response = in.next().charAt(0);
		
		if(response == 'Y' || response == 'y' ) {
			do {
			RA.EmailChecker();
			MV.Emailvalidation();
			RA.NameofUser();
			RA.PasswordChecker();
			MV.UpandLowChecker();
			RA.RecoveryPhone();
			MV.RecoveryNum();
			MV.Status();
			System.out.println(" ");
			if(RA.Retake == false) {
				System.out.println("=================================================================================================================================");
				System.out.println("Your account is Unsuccessfully registered!");
				System.out.println("Please Try again :) ");
				System.out.println(" ");
			}
			
			}while(!RA.Retake == true);
			
		}else if(response == 'N' || response == 'n') {
			
			System.out.println("Awww, We are hoping you become a part of this growing community, But don't you worry you could always check this program if you are interested! ");
			System.out.println("Have a Good Day! Thank you for checking us!");
			
		}else {
			System.out.println("Error! Please Input 'Y' or 'N' only, Thank you!");
		}
		
		
		
	}
	

}
