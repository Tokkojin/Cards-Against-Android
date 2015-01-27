package thai.cardsagainstandroid;

import org.w3c.dom.Text;

/**
 * Created by tomatocurry1 on 1/13/2015.
 */
public class Card {
    String type;
    String text;
    String user;
    int index;

    public Card(String type, int index, String text, String user)
    {
        this.type = type;
        this.text = text;
        this.index = index;
        this.user = user;
    }



}
