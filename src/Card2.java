/**
 * Created by Frank Hall on 6/25/2016.
 */
public class Card2 // object class Card
{
    private Suit suit;  // variable decleration
    private int value;
    private String rank;

    public void setSuit(Suit s)// sets and gets for the above variables
    {
        suit = s;
    }

    public Suit getSuit()
    {
        return suit;
    }

    public void setValue(int v)
    {
        value = v;
    }

    public int getValue()
    {
        return value;
    }

    public void setRank(String r)
    {
        rank = r;
    }

    public String getRank()
    {
        return rank;
    }
}
