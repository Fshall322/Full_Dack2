/**
 * Created by Frank Hall on 6/25/2016.
 */
public class FullDeck2 // class Fulldeck2
{
    public static void main(String[] args)// method main
    {
        Card2[] deck = new Card2[52];// array
        int suit = 1;// variable decleration
        int value = 1;

        for(int x = 0; x < 52; x++)// for loop assigning each suit a integer value
        {
            deck[x] = new Card2();

            if(suit == 1)
                deck[x].setSuit(Suit.SPADES);

            else if(suit == 2)
                deck[x].setSuit(Suit.HEARTS);

            else if(suit == 3)
                deck[x].setSuit(Suit.DIAMONDS);

            else if(suit == 4)
                deck[x].setSuit(Suit.CLUBS);

            switch(value)//switch case for the card types ace through king.
            {
                case 1:
                    deck[x].setValue(1);
                    deck[x].setRank("Ace");
                    break;

                case 2:
                    deck[x].setValue(2);
                    deck[x].setRank("Two");
                    break;

                case 3:
                    deck[x].setValue(3);
                    deck[x].setRank("Three");
                    break;

                case 4:
                    deck[x].setValue(4);
                    deck[x].setRank("Four");
                    break;

                case 5:
                    deck[x].setValue(5);
                    deck[x].setRank("Five");
                    break;

                case 6:
                    deck[x].setValue(6);
                    deck[x].setRank("Six");
                    break;

                case 7:
                    deck[x].setValue(7);
                    deck[x].setRank("Seven");
                    break;

                case 8:
                    deck[x].setValue(8);
                    deck[x].setRank("Eight");
                    break;

                case 9:
                    deck[x].setValue(9);
                    deck[x].setRank("Nine");
                    break;

                case 10:
                    deck[x].setValue(10);
                    deck[x].setRank("Ten");
                    break;

                case 11:
                    deck[x].setValue(11);
                    deck[x].setRank("Jack");
                    break;

                case 12:
                    deck[x].setValue(12);
                    deck[x].setRank("Queen");
                    break;

                case 13:
                    deck[x].setValue(13);
                    deck[x].setRank("King");
                    break;

                default:
                    break;
            }

            System.out.println("Card: " +deck[x].getRank()+ " of " +deck[x].getSuit()); // prints out the cards by suit.
            ++value;

            if(value > 13)// if the value is greater than a king it is a ace?
            {
                value = 1;
                ++suit;
            }
        }
    }
}
