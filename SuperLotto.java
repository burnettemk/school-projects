/*
 * Mark Burnette
 */


import java.util.Random;
import java.util.Scanner;

/**
 * This program prints lottery tickets for its current user
 * @author Mark Burnette
 *
 */
public class SuperLotto {

	/**
	 * Asks for name and number of lottery tickets user would like
	 * @param args
	 */
	public static void main(String[] args) {
		final int NUM_ELEMENTS = 6;
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		boolean endProgram = false;
		
		while(endProgram == false) {
			System.out.println("Hello, welcome to 7/11. What is your name?");
			String userName = scan.next();
			
			System.out.println("Hi " + userName + ". Ok so how many Super Lotto tickets would you like?");
			int userLottoNum = scan.nextInt();
			
			int[] lottoNumbers;
			
			for(int j = 0; j < userLottoNum; j++) {
				lottoNumbers = quickPick(userLottoNum, NUM_ELEMENTS, rand);
				for(int i = 0; i < lottoNumbers.length; i++) {
					if(i < lottoNumbers.length - 1) {
						System.out.print(lottoNumbers[i] + " ");
					} else {
						System.out.print("(MEGA: " + lottoNumbers[i] + ") ");
					}
				}
				System.out.println();
			}
			
			System.out.println("Thank you for playing! Would you like to run the program again?");
			String rerunProgram = scan.next();
			switch(rerunProgram) {
			case "YES":
			case "Yes":
			case "yes":
				endProgram = false;
				break;
			default:
				endProgram = true;
				System.out.println("Bye.");
				break;
			}
		}

	}

	/**
	 * This method choosing 5 random non duplicate numbers for the lottoNumbers array and adds a six number at the end
	 * @param userLottoNum
	 * @param NUM_LOTTO_NUMBERS
	 * @param rand
	 * @return lottoNumbers
	 */
	public static int[] quickPick(int userLottoNum, int NUM_ELEMENTS, Random rand) {
		int[] lottoNumbers = new int[NUM_ELEMENTS];
		boolean isDuplicate = false;
		int arraySize = 0;
		
		for(int i = 0; i < lottoNumbers.length; i++) {
			if (i < lottoNumbers.length - 1) {
				lottoNumbers[i] = rand.nextInt(47) + 1;
				
				arraySize++;
				if ((i < lottoNumbers.length - 1) && (i > 0)) {
					isDuplicate = checkArray(lottoNumbers, lottoNumbers[i], arraySize, i);
					
					if(isDuplicate == true) {
						//do {
							//lottoNumbers[i] = rand.nextInt(6);
							//isDuplicate = checkArray(lottoNumbers, lottoNumbers[i], arraySize, i);
						//} while(isDuplicate == true);
						
						while(isDuplicate == true) {
							lottoNumbers[i] = rand.nextInt(6);
							isDuplicate = checkArray(lottoNumbers, lottoNumbers[i], arraySize, i);
						}
					}
				}
			} else if(i == lottoNumbers.length - 1) {
				lottoNumbers[i] = rand.nextInt(27) + 1;
			}
		}

		return lottoNumbers;
	}

	/**
	 * This method checks the first 5 numbers in the lottoNumbers array and sees if any are duplicates of each other
	 * @param array
	 * @param testNumber
	 * @param arraySize
	 * @param j
	 * @return isDuplicate
	 */
	private static boolean checkArray(int[] array, int testNumber, int arraySize, int j) {
		boolean isDuplicate = false;
		
		for(int i = 0; i < arraySize; i++) {
			if(i != j) {
				if(testNumber == array[i]) {
					isDuplicate = true;
					break;
				} else {
					isDuplicate = false;
				}
			}
		}
		
		return isDuplicate;
	}
	

}
