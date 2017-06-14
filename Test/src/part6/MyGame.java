package part6;
import java.util.Scanner;

public class MyGame {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		int player1 = 0;
		int player2 = 0;
		int countPlayer1 = 0;
		int countPlayer2 = 0;
		
		String player1Name = "";
		String player2Name = "";
		
		System.out.println("MineSweeper GAME \n" 
				+ "there are 30 cells and some of them contain bombs \n"
				+ "7 is the maximum movement a player can make"
				+ "each time you hit a bomb you go back to the begnning \n" 
				//TODO + "if two players hit the same cell they both return to cell 0 \n"
				+ "who pass cell 30 first wins \n"
				+ "click Start to begin the game");
		
		startGame(input, player1Name, player2Name, player1, player2, countPlayer1, countPlayer2);

				input.close();
	}
	
	public static void startGame(Scanner input,String player1Name,String player2Name,
			int player1, int player2, int countPlayer1, int countPlayer2) {
		String start = input.nextLine();
		if (start.equalsIgnoreCase("start")) {
			System.out.print("What's palyer1 name?");
			 player1Name = input.nextLine();
			 
			System.out.print("What's palyer2 name?");
			 player2Name = input.nextLine();
		}
		
		else {
			System.out.println("Click start");
			startGame(input, player1Name, player2Name, player1, player2, countPlayer1, countPlayer2);
		}
		while (player1Name.equalsIgnoreCase(player2Name)) {
			System.out.println("invalid name, enter a different one");
			player2Name = input.nextLine();		
	}
		System.out.println("Now let's start, \n"
				 +" each player should type a number of cells they want to move not bigger than 7 in their turn");
			
		
		while (countPlayer1 <= 30 || countPlayer2 <= 30) {
		System.out.println(player1Name + ", enter a number not bigger 7");
		player1 = input.nextInt();
		
		
		switch (player1) {
		case (1) :
			countPlayer1 += 1;
			break;
		case (2) :
			countPlayer1 += 2;
			break;
		case (3) :
			countPlayer1 += 3;
			break;
		case (4) :
			countPlayer1 += 4;
			break;
		case (5) :
			countPlayer1 += 5;
			break;
		case (6) :
			countPlayer1 += 6;
			break;
		case (7) :
			countPlayer1 += 7;
			break;
			
			default :
				System.out.println("type a number between 1-7");
				player1 = input.nextInt();
				}
		switch (countPlayer1) {
		case (3) :
			countPlayer1 = 0;
		System.out.println("ooops! you hit a bomb");
		break;
		case (5) :
			countPlayer1 = 0;
		System.out.println("ooops! you hit a bomb");
		break;
		case (9) :
			countPlayer1 = 0;
		System.out.println("ooops! you hit a bomb");
		break;
		case (12) :
			countPlayer1 = 0;
		System.out.println("ooops! you hit a bomb");
		break;
		case (15) :
			countPlayer1 = 0;
		System.out.println("ooops! you hit a bomb");
		break;
		case (17) :
			countPlayer1 = 0;
		System.out.println("ooops! you hit a bomb");
		break;
		case (20) :
			countPlayer1 = 0;
		System.out.println("ooops! you hit a bomb");
		break;
		case (22) :
			countPlayer1 = 0;
		System.out.println("ooops! you hit a bomb");
		break;
		case (27) :
			countPlayer1 = 0;
		System.out.println("ooops! you hit a bomb");
		break;
		case (30) :
			countPlayer1 = 0;
		System.out.println("ooops! you hit a bomb");
		break;
		
			
			
		}
		

		System.out.println(player1Name +" is now at cell " + countPlayer1);
			
			System.out.println(player2Name +" enter a number not bigger than 7");
			player2 = input.nextInt();
			
			
			switch (player2) {
			case (1) :
				countPlayer2 += 1;
				break;
			case (2) :
				countPlayer2 += 2;
				break;
			case (3) :
				countPlayer2 += 3;
				break;
			case (4) :
				countPlayer2 += 4;
				break;
			case (5) :
				countPlayer2 += 5;
				break;
			case (6) :
				countPlayer2 += 6;
				break;
			case (7) :
				countPlayer2 += 7;
				break;
				
				default :
					System.out.println("type a number between 1-7");
					player2 = input.nextInt();

					
			}
			switch (countPlayer2) {
			case (3) :
				countPlayer2 = 0;
				System.out.println("ooops! you hit a bomb");
			break;
			case (5) :
				countPlayer2 = 0;
			System.out.println("ooops! you hit a bomb");
			break;
			case (9) :
				countPlayer2 = 0;
			System.out.println("ooops! you hit a bomb");
			break;
			case (12) :
				countPlayer2 = 0;
			System.out.println("ooops! you hit a bomb");
			break;
			case (15) :
				countPlayer2 = 0;
			System.out.println("ooops! you hit a bomb");
			break;
			case (17) :
				countPlayer2 = 0;
			System.out.println("ooops! you hit a bomb");
			break;
			case (20) :
				countPlayer2 = 0;
			System.out.println("ooops! you hit a bomb");
			break;
			case (22) :
				countPlayer2 = 0;
			System.out.println("ooops! you hit a bomb");
			break;
			case (27) :
				countPlayer2 = 0;
			System.out.println("ooops! you hit a bomb");
			break;
			case (30) :
				countPlayer2 = 0;
			System.out.println("ooops! you hit a bomb");
			break;
			
				
				
			}
			System.out.println(player2Name + " is now at cell " + countPlayer2);
			
			
		
		}	

		if (countPlayer1 > 30) {
			System.out.println(player1Name + " Won!");
		}
		if (countPlayer2 > 30) {
			System.out.println(player2Name + " Won!");
		}
		
		
		 
		
	}
	
	

}
