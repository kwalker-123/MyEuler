package diff10;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import Tools.Timer;
import Tools.myFileRead;

public class Problem054 {

	// 8 - Royal Flush: Ten, Jack, Queen, King, Ace, in same suit.
	// 8 - Straight Flush: All cards are consecutive values of same suit.
	// 7 - Four of a Kind: Four cards of the same value.
	// 6 - Full House: Three of a kind and a pair.
	// 5 - Flush: All cards of the same suit.
	// 4 - Straight: All cards are consecutive values.
	// 3 - Three of a Kind: Three cards of the same value.
	// 2 - Two Pairs: Two different pairs.
	// 1 - One Pair: Two cards of the same value.
	// 0 - High Card: Highest value card.

	public static void main(String[] args) throws InterruptedException, IOException {

		Timer timer = new Timer();

		String file = "H:\\git\\test\\MyEuler\\p054_poker.txt";

		//Load file content and split into rounds
		String fromFile = myFileRead.readFileContent(file);
		List<String> hands = Arrays.asList(fromFile.split(","));
		
		//Split rounds into hands and check winner
		int aWinCount = 0;
		for (int i = 0; i < hands.size(); i++) {
			String handA = hands.get(i).substring(0, 14);
			String handB = hands.get(i).substring(15);

			if (PLAYERAWINS(handA, handB)) {
				aWinCount++;
			}
		}
		System.out.println("A wins: " + aWinCount);
		System.out.println("B wins: " + (1000 - aWinCount));

		timer.stopWatch();
	}

	private static boolean PLAYERAWINS(String handA, String handB) {
		List<String> handONE = new ArrayList<String>(Arrays.asList(handA.split(" ")));
		List<Integer> sortedHandONE = SORTHAND(handONE);

		List<String> handTWO = new ArrayList<String>(Arrays.asList(handB.split(" ")));
		List<Integer> sortedHandTWO = SORTHAND(handTWO);

		if (HANDSCORE(handTWO) > HANDSCORE(handONE)) {
			return false;
		}
		if (HANDSCORE(handTWO) < HANDSCORE(handONE)) {
			return true;
		}
		//Determines the winner if hands are of same type
		if (HANDSCORE(handTWO) == HANDSCORE(handONE)) {
			StringBuilder SBA = new StringBuilder("");
			for (Integer integer : sortedHandONE) {
				if (integer < 10) {
					SBA.append(0);
				}
				SBA.append(integer);
			}
			StringBuilder SBB = new StringBuilder("");
			for (Integer integer : sortedHandTWO) {
				if (integer < 10) {
					SBB.append(0);
				}
				SBB.append(integer);
			}
			if (Integer.valueOf(SBB.toString()) > Integer.valueOf(SBA.toString())) {
				return false;
			}
			if (Integer.valueOf(SBB.toString()) < Integer.valueOf(SBA.toString())) {
				return true;
			}
			if (Integer.valueOf(SBB.toString()) == Integer.valueOf(SBA.toString())) {
				System.out.println("Chop Pot");
			}

		}
		throw new Error("NO WINNER FOUND");

	}

	private static int HANDSCORE(List<String> hand) {
		//Runs various scoring functions below
		if (FLUSHCHECK(hand)) {
			if (STRAIGHTCHECK(hand)) {
				return 8;
			} else {
				return 5;
			}
		}

		if (STRAIGHTCHECK(hand) && !FLUSHCHECK(hand)) {
			return 4;
		}

		return (DUPLICATECOUNT(hand));
	}

	private static boolean FLUSHCHECK(List<String> hand) {
		//Check for 5 of the same suit
		List<String> suits = new ArrayList<String>();
		for (String card : hand) {
			suits.add(card.substring(1, 2));
		}
		if (suits.get(0).equals(suits.get(1)) && suits.get(0).equals(suits.get(2)) && suits.get(0).equals(suits.get(3))
				&& suits.get(0).equals(suits.get(4))) {
			return true;
		}
		return false;
	}

	private static boolean STRAIGHTCHECK(List<String> hand) {
		//checks for 5 cards in a row, including 1-5 converting of A to a 1 instead of 13
		List<Integer> cards = SORTHAND(hand);
		int lowest = cards.get(4);
		if (lowest == cards.get(3) - 1 && lowest == cards.get(2) - 2 && lowest == cards.get(1) - 3) {
			if (lowest == cards.get(0) - 4 || ((lowest == 2) && cards.get(0) == 14)) {
				if (cards.get(0) == 14 && cards.get(1) == 5) {
					System.err.println(
							"Ace low Straight, might need to add something to reorder(54321 instead of 145432)");
				}
				return true;
			}
		}
		return false;
	}

	private static int DUPLICATECOUNT(List<String> hand) {
		//Create a set, then determine number of duplicates by size of that set
		//Return value corresponds to hand type at top of page
		List<Integer> sorted = SORTHAND(hand);
		Set<Integer> Numbers = new HashSet<Integer>();
		for (Integer integer : sorted) {
			Numbers.add(integer);
		}
		if (Numbers.size() == 4) {
			return 1;
		}
		if (Numbers.size() == 3) {
			if (sorted.get(1) == sorted.get(2)) {
				return 3;
			}
			return 2;
		}
		if (Numbers.size() == 2) {
			if (sorted.get(2) == sorted.get(3)) {
				return 7;
			}
			return 6;
		}
		return 0;
	}

	
	private static List<Integer> SORTHAND(List<String> hand) {		
		//Convert face cards to numbers
		List<Integer> cards = new ArrayList<Integer>();
		for (String s : hand) {
			if (s.charAt(0) == 'A') {
				cards.add(14);
			} else if (s.charAt(0) == 'K') {
				cards.add(13);
			} else if (s.charAt(0) == 'Q') {
				cards.add(12);
			} else if (s.charAt(0) == 'J') {
				cards.add(11);
			} else if (s.charAt(0) == 'T') {
				cards.add(10);
			} else {
				cards.add(Integer.valueOf(s.substring(0, 1)));
			}
		}
		//Sort largest to smallest
		cards.sort(null);
		Collections.reverse(cards);

		//Duplicate number check
		Map<Integer, Integer> sorted = new HashMap<Integer, Integer>();
		for (Integer integer : cards) {
			if (!sorted.containsKey(integer)) {
				sorted.put(integer, 1);
			} else {
				sorted.put(integer, sorted.get(integer) + 1);
			}
		}

		//Adds duplicates to List first
		Map<Integer, Integer> sortedByCount = sorted.entrySet().stream().sorted((Map.Entry.comparingByValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		List<Integer> output = new ArrayList<Integer>();
		for (Integer integer : sortedByCount.keySet()) {
			if (sortedByCount.get(integer) > 1) {
				for (int i = 0; i < sortedByCount.get(integer); i++) {
					output.add(integer);
				}
				Collections.reverse(output);
			}
		}

		//Collect remaining singles
		List<Integer> singles = new ArrayList<Integer>();
		for (Integer integer : sortedByCount.keySet()) {
			if (sortedByCount.get(integer) == 1) {
				singles.add(integer);
			}
		}
		Collections.reverse(singles);
		//Add singles to end of list
		for (int i = 0; i < singles.size(); i++) {
			output.add(singles.get(i));
		}

		//return sorted hand
		return output;
	}

}
