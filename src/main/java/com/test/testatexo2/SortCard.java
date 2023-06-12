package com.test.testatexo2;

import com.test.testatexo2.model.Card;

import java.util.Comparator;

public class SortCard implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {

        int colorComparator = o1.getColorCard().compareTo(o2.getColorCard());
        int valueComparator = o1.getValueCard().compareTo(o2.getValueCard());

        if(colorComparator == 0){
            return (valueComparator == 0 ? colorComparator : valueComparator);
        } else {
            return colorComparator;
        }


    }
}
