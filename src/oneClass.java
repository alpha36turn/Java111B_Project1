import java.util.Random;
import java.util.Scanner;

public class RaffleStart {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		char keepGoing = 'y';
		final int MIN_NUM_TICKETS = 4;
		final int MIN_TICKET_NUMBER = 0;
		
	while (keepGoing != 'n') {
		System.out.println("Please enter the smallest raffle number:");		
		int min = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Please enter the largest raffle number:");	
		int max = scan.nextInt();
		scan.nextLine();
		
		// Draws 3 winning tickets
		int winner0 = rand.nextInt(max - min) + min; 
		int winner1 = rand.nextInt(max - min) + min;
		int winner2 = rand.nextInt(max - min) + min;
		
		// Draws again if there are duplicate winners
		while (winner0 == winner1 || winner1 ==  winner2 || winner0 == winner2) {
			winner0 = rand.nextInt(max - min) + min;
			winner1 = rand.nextInt(max - min) + min;
			winner2 = rand.nextInt(max - min) + min;
		}
		
		// Print winning numbers
		System.out.println("The winning raffle ticket numbers are:");
		System.out.println("\tTicket 1: " + winner0 + "\n\tTicket 2: " + winner1 +
				"\n\tTicket 3: " + winner2);
		
		System.out.println("Want to tell me your raffle number? (y/n)");
		char tellMe = scan.nextLine().charAt(0);
		if (tellMe == 'y') {
			System.out.println("What was your number?");
			int num = scan.nextInt();
			scan.nextLine();
			
			if (num == winner0 || num == winner1 || num == winner2) {
				System.out.println("You are a winner!");
				}
			}

		System.out.println("Do you want to keep playing? (y/n)");
		keepGoing = scan.nextLine().charAt(0);
			if(keepGoing == 'n') {
				System.out.println("Goodbye!");
				}	
		} //end "keepGoing" while loop		
	} //end main
}

