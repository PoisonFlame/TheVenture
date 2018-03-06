package me.rpsh;
import java.util.ArrayList;
import java.util.Random;

public class StaticMethods {
	
	
	
	public  static ArrayList<String> introduction() {
		
		ArrayList<String> array = new ArrayList<>();
		
		array.add("Welcome to The Venture.\n");
		array.add("This is a text based game where you, the hood have a very interesting life.\n");
		array.add("Through many puzzles and battles, your goal is to become the grandmaster.\n");
		array.add("Are you up for the challenge?\nTo get started, type begin into the console, anything else will close the application.\n");
	
		return array;
	}
	
	
	public static String randomPuzzle(String opponentName, String answer, int money) {
		
		ArrayList<String> array = new ArrayList<>();
		//REFERENCES https://www.pinterest.ca/pin/540924605236829484/?autologin=true
		array.add("Rock Paper Scissors");
		array.add("Guess the Number");
		array.add("Whats Next in the Pattern?");
		array.add("Which Picture is Different?");
		array.add("Solve My Math Problem");
		array.add("Who Was the Murderer?");
		Random r = new Random();
		int low = 0;
		int high = array.size();
		int result = r.nextInt(high - low) + low;
		return array.get(result);
	}
	
	public static ArrayList<String> rps(String name,String answer, int money) {
		ArrayList<String> array = new ArrayList<>();
		
		//0=Rock 1=Paper 2=Scissors
		Random r = new Random();
		int low =0;
		int high=3;
		int opponentAnswer = r.nextInt(high-low) + low;
		int myAnswer = Integer.valueOf(answer);
		boolean isTie = false;
		boolean isWin = false;
		
		if(myAnswer == 0) {
			if(opponentAnswer == 0) {
				array.add("tie");
				array.add("0");
				array.add(name + " picked Rock as well. It was a tie.");
				isTie = true;
			}else if(opponentAnswer == 1) {
				array.add("loss");
				array.add("-" + money);
				array.add(name + " picked Paper. You lost.");
				isWin = false;
			}else {
				array.add("win");
				array.add(""+money);
				array.add(name + " picked Scissors. You win!");
				isWin = true;
			}			
		}else if(myAnswer == 1) {
			if(opponentAnswer == 0) {
				array.add("win");
				array.add(""+money);
				array.add(name + " picked Rock. You win!");
				isWin = true;
			}else if(opponentAnswer == 1) {
				array.add("tie");
				array.add("0");
				array.add(name + " picked Paper as well. It was a tie.");
				isTie = true;
			}else {
				array.add("loss");
				array.add("-"+money);
				array.add(name + " picked Scissors. You lost.");
				isWin = false;
			}
		}else {
			if(opponentAnswer == 0) {
				array.add("loss");
				array.add("-"+money);
				array.add(name + " picked Rock. You lost.");
				isWin = false;
			}else if(opponentAnswer == 1) {
				array.add("win");
				array.add(""+money);
				array.add(name + " picked Paper. You win!");
				isWin = true;
			}else {
				array.add("tie");
				array.add("0");
				array.add(name + " picked Scissors as well. It was a tie.");
				isTie = true;
			}
		}
		
		if(isWin && !isTie) {
			ArrayList<String> wins = new ArrayList<>();
			wins.add("You rekt " + name + ".");
			wins.add("You send " + name + " crying back into their corner.");
			wins.add("You say good game but " + name + " is salty and runs off.");
			wins.add(name + " says \"You win fair and square. Until next time challenger\".");
			wins.add(name + " is feeling sad but smiles at you and says good game.");
			wins.add("You try to not rub it in their face but " + name + " gets your message and walks away.");
			wins.add("You celebrate your win very passionately and blow " + name + " out of the arena.");
			Random rWin = new Random();
			int lowWin = 0;
			int highWin = wins.size();
			int resultWin = rWin.nextInt(highWin-lowWin) + lowWin;
			array.add(wins.get(resultWin));
		}else if(isTie) {
			
		}else if(!isWin) {
			ArrayList<String> loss = new ArrayList<>();
			loss.add("You got rekt by " + name + ".");
			loss.add(name + " sends you crying away.");
			loss.add(name + " says good game but you're too salty and swear at them.");
			loss.add("You say good game to " + name + " they laugh at you and walk away.");
			loss.add("You're sad but you waive goodbye and yell good game to " + name + ".");
			loss.add(name + " tries to not rub it in your face but you get the message and walk away in shame.");
			loss.add("You get depression over your loss and become suicidal.");
			Random rLoss = new Random();
			int lowLoss = 0;
			int highLoss = loss.size();
			int resultLoss = rLoss.nextInt(highLoss-lowLoss) + lowLoss;
			array.add(loss.get(resultLoss));
		}
		
		return array;
	}
	
}
