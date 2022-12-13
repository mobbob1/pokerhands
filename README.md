# pokerhands

DESCRIPTION
=====================================

CARD CLASS:
Creates a playing card. I use constants to refer to the suits
and face cards. The instance variables are the ints rank and
suit. Besides accessor and toString methods, there is a compareTo
method, since Card implements Comparable.

DECK CLASS:
This class creates a deck of playing cards, as an array of Card objects.
The instance variables are an array of Cards and an int
representing the current top card in the deck. There is a shuffle
method that switches the Cards in the deck several hundred times,
which gets the deck well-shuffled. There is also a toString method
for a full deck. The getCard method gives a Player a Card by returning
the top card of the Deck and also incrementing the topcard int by 1 each
time a card is given.

PLAYER CLASS:
This class creates a Player object. The instance variables are an array of
five Cards, which is the Player's hand,  and an instance of a Deck.
After the Deck is shuffled and five Cards are dealt, the hand can be sorted.
Then there are methods to evaluate the hand to see if it fits
the criteria for particular poker hands.

GAME CLASS:

This class puts all the methods and objects from the above classes
together to actually create a game of video poker.
It gives a Player a Hand, and then allows them to redraw Cards if they wish.
Their new hand is evaluated and the best poker hand that can be formed from
that hand is displayed. Then the user can play again.
Once the user no longer wants to play, they are thanked for playing and
the program terminates.


TESTING:

TestGame class is created with main method to test the game.
New Game is created any time the game is played.

