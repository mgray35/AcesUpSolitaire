package models;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    public java.util.List<Card> deck = new ArrayList<>();

    public boolean hasCards;

    public Deck() {
        this.buildDeck();
        this.hasCards = true;
        this.shuffle();
    }

    public Card takeTopCard() {
        Card tempCard = getTopCard();
        this.removeTopCard();
        return tempCard;
    }

    protected void shuffle() {
        Collections.shuffle(deck);
    }

    public void buildDeck() {
        for(int i = 2; i < 15; i++){
            deck.add(new Card(i,Suit.Clubs));
            deck.add(new Card(i,Suit.Hearts));
            deck.add(new Card(i,Suit.Diamonds));
            deck.add(new Card(i,Suit.Spades));
        }
    }

    private Card getTopCard(){
        return this.deck.get(deck.size() - 1);
    }

    private void removeTopCard() {
        this.deck.remove(deck.size() - 1);
        if (this.deck.isEmpty())
            this.hasCards = false;
    }
}

