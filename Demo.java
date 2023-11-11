/*
 * Mark Burnette
 */

import java.util.ArrayList;

/**
 * This program lists 4 games, their genres, completion times, and review scores and whether they are multiplayer or not
 * @author Mark Burnette
 *
 */
public class Demo {

	/**
	 * Creates 4 objects of the class Game and prints out their fields
	 * @param args
	 */
	public static void main(String[] args) {
		double[] times = {4.5, 19.1, 32.7, 8.6};
		String[] genres = {"Shmup", "Adventure", "RPG", "Platformer"};
		String[] names = {"Sol Gun X", "The Dragon Within the Hollow Mine", "War in the Cosmos", "Lightspeed Run"};
		boolean[] players = {true, false, true, true};
		int[] reviews = {93, 35, 87, 95};
		String gameName1 = names[2];
		String gameName2 = names[3];
		String gameGenre1 = genres[2];
		String gameGenre2 = genres[3];
		int review1 = reviews[2];
		int review2 = reviews[3];
		double completionTime1 = times[2];
		double completionTime2 = times[3];
		boolean multiplayer1 = players[2];
		boolean multiplayer2 = players[3];
		int i = 0;
		int numReviews = 0;
		
		Game game1 = new Game();
		Game game2 = new Game();
		Game game3 = new Game(gameName1, gameGenre1, review1, completionTime1, multiplayer1);
		Game game4 = new Game(gameName2, gameGenre2, review2, completionTime2, multiplayer2);
		
		ArrayList<Game> allGames= new ArrayList<Game>();
		
		allGames.add(game1);
		allGames.add(game2);
		allGames.add(game3);
		allGames.add(game4);	
		
		for (Game game: allGames) { //reassigns same values for objects 3 and 4
			game.setCompletionTime(times[i]);
			game.setGameGenre(genres[i]);
			game.setGameName(names[i]);
			game.setMultiplayer(players[i]);
			game.setReviewScore(reviews[i]);
			i++;
		}
		
		System.out.print("Game List:\n\n");
		
		for (Game game: allGames) {
			game.display();
			System.out.print("\n\n");
    	}
		
		numReviews++;
		
		System.out.print("Extra:\n\n"); //Tests extra modification methods changeReview and addDLC
		
		System.out.print("Mark says \"The Dragon Within the Hollow Mine is complete trash and is a complete waste of money. DO NOT BUY! 0/100\"\n\n");
		
		game2.changeReviewScore(0, numReviews);
		
		System.out.print("\nThere is an update for Lightspeed Run ready to download.\n\n");
		
		game4.addDLC(2.7);
		
		
	}

}
