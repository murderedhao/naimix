package com.thesol.taro.service;

import com.thesol.taro.models.Deck;
import com.thesol.taro.models.users.HR;
import com.thesol.taro.models.TaroCard;
import org.springframework.stereotype.Service;

@Service
public class DeckService {

    public int makeRask(HR hr) {
        Deck deck = new Deck();
        TaroCard card1 = deck.takeCard();
        TaroCard card2 = deck.takeCard();
        TaroCard card3 = deck.takeCard();
        TaroCard card4 = deck.takeCard();
        TaroCard card5 = deck.takeCard();
        TaroCard card6 = deck.takeCard();




         int score = 0;
         // TODO: Сделать метод для высчитывания общего балла за карты и сделать модель ответа
         return score;
     }

     private int takeCard() {
         // TODO: Придумать баллы за карты
     }
}
