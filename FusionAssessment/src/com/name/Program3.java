package com.name;

public class Program3 {
	public static void main(String[] args) {
		int[] playerRanks = { 20, 5, 28, 67, 44 };
		int harperRank = 45;

		int harperPosition = findHarperRank(playerRanks, harperRank);

		if (harperPosition != -1) {
			System.out.println(
					"Harper's rank is " + harperRank + " and their position in the club is " + (harperPosition + 1));
		} else {
			System.out.println("Harper's rank was not found in the club.");
		}
	}

	public static int findHarperRank(int[] playerRanks, int harperRank) {
		for (int i = 0; i < playerRanks.length; i++) {
			if (harperRank <= playerRanks[i]) {
				return i;
			}
		}

		return playerRanks.length;
	}
}
