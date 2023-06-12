package com.test.testatexo2;

import com.test.testatexo2.model.Card;
import com.test.testatexo2.model.ColorCard;
import com.test.testatexo2.model.ValueCard;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class TestAtexo2Application {

	public static void main(String[] args) {

		List<String> listColor = ColorCard.getListColor();
		List<String> listValue = ValueCard.getListValue();

		Collections.shuffle(listColor);
		Collections.shuffle(listValue);

		List<Card> cards = new ArrayList<>();
		Set<String> cards2 = new HashSet<>();

		Random random = new Random();

		while(cards.size() < 10){
			String color = listColor.get(random.nextInt(listColor.size()));
			String value = listValue.get(random.nextInt(listColor.size()));
			String cardPair = color + value;

			if(!cards2.contains(cardPair)){
				cards.add(new Card(color,value));
				cards2.add(cardPair);

			}

		}

		System.out.println("10 cartes non-triées : "+cards);
		cards.sort(new SortCard());
		System.out.println("10 cartes triées : "+cards);



	}

}
