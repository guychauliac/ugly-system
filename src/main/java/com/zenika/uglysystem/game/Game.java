package com.zenika.uglysystem.game;

import java.util.ArrayList;
import java.util.LinkedList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Game {
	
	private static final String ROCK = "Rock";

	private static final Logger LOG = LoggerFactory.getLogger(Game.class);

    private ArrayList<String> players = new ArrayList<>();
    private int[] places = new int[6];
    private int[] purses  = new int[6];
    private boolean[] inPenaltyBox  = new boolean[6];
    
    private LinkedList<String> popQuestions = new LinkedList<>();
    private LinkedList<String> scienceQuestions = new LinkedList<>();
    private LinkedList<String> sportsQuestions = new LinkedList<>();
    private LinkedList<String> rockQuestions = new LinkedList<>();
    
    private int currentPlayer = 0;
    private boolean isGettingOutOfPenaltyBox;
    private static String pop = "Pop";
    private static String science = "Science";
    private static String sports = "Sports";
    
    
    
    public  Game(){
    	for (int i = 0; i < 50; i++) {
			popQuestions.addLast("Pop Question " + i);
			scienceQuestions.addLast(("Science Question " + i));
			sportsQuestions.addLast(("Sports Question " + i));
			rockQuestions.addLast(createRockQuestion(i));
    	}
    }

	public String createRockQuestion(int index){
		return "Rock Question " + index;
	}
	
	public boolean isPlayable() {
		return (howManyPlayers() >= 2);
	}

	public boolean add(String playerName) {
		players.add(playerName);
	    places[howManyPlayers()] = 0;
	    purses[howManyPlayers()] = 0;
	    inPenaltyBox[howManyPlayers()] = false;
	    
	    LOG.info("{0} was added", playerName);
	    LOG.info("They are player number {0}", players.size());
		return true;
	}
	
	public int howManyPlayers() {
		return players.size();
	}

	public void roll(int roll) {
		String currentPlayerString = players.get(currentPlayer);
		LOG.info(currentPlayerString + " is the current player");
		LOG.info("They have rolled a {0} ", roll);
		
		String currentCategory = currentCategory();
		if (inPenaltyBox[currentPlayer]) {
			if (roll % 2 != 0) {
				isGettingOutOfPenaltyBox = true;
				
				LOG.info( "{0} is getting out of the penalty box", currentPlayerString);
				places[currentPlayer] = places[currentPlayer] + roll;
				if (places[currentPlayer] > 11) places[currentPlayer] = places[currentPlayer] - 12;
				
				LOG.info("{0}'s new location is {1} \nThe category is {2} ", currentPlayerString, places[currentPlayer], currentCategory);
				askQuestion();
			} else {
				LOG.info("{0} is not getting out of the penalty box", currentPlayerString);
				isGettingOutOfPenaltyBox = false;
				}
			
		} else {
		
			places[currentPlayer] = places[currentPlayer] + roll;
			if (places[currentPlayer] > 11) places[currentPlayer] = places[currentPlayer] - 12;
			
			LOG.info( "{0}'s new location is {1}\nThe category is {2}", currentPlayerString,places[currentPlayer], currentCategory);
			askQuestion();
		}
		
	}

	private void askQuestion() {
		if (pop.equalsIgnoreCase(currentCategory())) {
			String removeFirst = popQuestions.removeFirst();
			LOG.info(removeFirst);
		}
		if (science.equalsIgnoreCase(currentCategory())) {
			String removeFirst = scienceQuestions.removeFirst();
			LOG.info(removeFirst);
		}
		if (sports.equalsIgnoreCase(currentCategory())) {
			String removeFirst = sportsQuestions.removeFirst();
			LOG.info(removeFirst);
		}
		if (ROCK.equalsIgnoreCase(currentCategory())) {
			String removeFirst = rockQuestions.removeFirst();
			LOG.info(removeFirst);
		}		
	}
	
	
	private String currentCategory() {
		if (places[currentPlayer] == 0) return pop;
		if (places[currentPlayer] == 4) return pop;
		if (places[currentPlayer] == 8) return pop;
		if (places[currentPlayer] == 1) return science;
		if (places[currentPlayer] == 5) return science;
		if (places[currentPlayer] == 9) return science;
		if (places[currentPlayer] == 2) return sports;
		if (places[currentPlayer] == 6) return sports;
		if (places[currentPlayer] == 10) return sports;
		return ROCK;
	}

	public boolean wasCorrectlyAnswered() {
		if (inPenaltyBox[currentPlayer]){
			if (isGettingOutOfPenaltyBox) {
				LOG.info("Answer was correct!!!!");
				purses[currentPlayer]++;
				LOG.info("{0} now has {1} Gold Coins.", players.get(currentPlayer), purses[currentPlayer] );
				
				boolean winner = didPlayerWin();
				currentPlayer++;
				if (currentPlayer == players.size()) currentPlayer = 0;
				
				return winner;
			} else {
				currentPlayer++;
				if (currentPlayer == players.size()) currentPlayer = 0;
				return true;
			}
			
			
			
		} else {
		
			LOG.info("Answer was corrent!!!!");
			purses[currentPlayer]++;
			LOG.info("{0} now has {1} Gold Coins." , players.get(currentPlayer), purses[currentPlayer]);
			
			boolean winner = didPlayerWin();
			currentPlayer++;
			if (currentPlayer == players.size()) currentPlayer = 0;
			
			return winner;
		}
	}
	
	public boolean wrongAnswer(){
		LOG.info("Question was incorrectly answere\n{0} was sent to the penalty box",players.get(currentPlayer));
		inPenaltyBox[currentPlayer] = true;
		
		currentPlayer++;
		if (currentPlayer == players.size()) currentPlayer = 0;
		return true;
	}


	private boolean didPlayerWin() {
		return purses[currentPlayer] != 6;
	}
}