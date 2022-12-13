/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sst.pokerhands.businesslogics;

/**
 *
 * @author MOB
 */
import java.util.Scanner;

public class Game {

	// instance variables
	private Scanner input;// accepts input from the user
	private Player player;
	private boolean keepPlaying;

	// constructor
	public Game() {
		input = new Scanner(System.in);
		player = new Player();
		keepPlaying = true;
	}

	// method to deal the deck
	public void deal() {
		System.out.println();
		System.out.println("Here is your hand: ");
		player.createHand();
		player.sort();
		System.out.println(player.showHand());
		System.out.println();
	}

	// method to allow player to redraw
	public void redraw() {
		boolean redraw = false;
		System.out.println("Replace first card? true/false");
		redraw = input.nextBoolean();
		if (redraw == true)
			player.replaceFirstCard();
		System.out.println("Replace second card? true/false");
		redraw = input.nextBoolean();
		if (redraw == true)
			player.replaceSecondCard();
		System.out.println("Replace third card? true/false");
		redraw = input.nextBoolean();
		if (redraw == true)
			player.replaceThirdCard();
		System.out.println("Replace fourth card? true/false");
		redraw = input.nextBoolean();
		if (redraw == true)
			player.replaceFourthCard();
		System.out.println("Replace fifth card? true/false");
		redraw = input.nextBoolean();
		if (redraw == true)
			player.replaceFifthCard();
		player.sort();
		System.out.println();
		System.out.println("Here is your new hand: ");
		System.out.println(player.showHand());
		System.out.println();
	}

	// method to evaluate the hand
	public String evaluate() {
		String evaluation = "";
		if (player.isRoyalFlush() == true) {
			evaluation = "Royal Flush";
			return evaluation;
		}
		if (player.isStraightFlush() == true) {
			evaluation = "Straight Flush";
			return evaluation;
		}
		if (player.is4OfAKind() == true) {
			evaluation = "4 of a Kind";
			return evaluation;
		}
		 if (player.isFullHouse() == true) {
			 evaluation = "Full House";
			 return evaluation;
		}
		if (player.isFlush() == true) {
			evaluation = "Flush";
			return evaluation;
		}
		if (player.isStraight() == true) {
			evaluation = "Straight";
			return evaluation;
		}
		if (player.isTriple() == true) {
			evaluation = "3 of a Kind";
			return evaluation;
		}
		if (player.is2Pair() == true) {
			evaluation = "2 Pair";
			return evaluation;
		}
		if (player.is1Pair() == true) {
			evaluation = "1 Pair";
			return evaluation;
		}
		evaluation = "high card " + player.highCard();
		return evaluation;
	}

	 //method to play a game
	 //welcomes user, deals, allows redraws, evaluates, reports poker hand	
	public void playGame() {
		System.out.println();
		System.out.println("======Welcome to Hand Poker Game===");
		do {
			deal();
			redraw();
			System.out.println("You got " + evaluate() + "!");
			System.out.println();
			System.out.println("Play again? true/false");
			keepPlaying = input.nextBoolean();
		} while (keepPlaying == true);
		System.out.println();
		System.out.println("Thanks for Octotel Hand Poker Game===");
		System.out.println();
	}

}
