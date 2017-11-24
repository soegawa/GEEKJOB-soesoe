package org.camp.sample2;

import java.util.ArrayList;
import java.util.Random;

public class Dealer extends Human {

    ArrayList<Integer> cards = new ArrayList<Integer>();

    public Dealer() {
        for (int i = 1; i <= 13; i++) {
            for (int j = 1; j <= 4; j++) {
 
                if(i>10){
                cards.add(10);
            }else{
                cards.add(i);
            }
            }
        }
    }

    public ArrayList<Integer> deal() {
        Random rand = new Random();
        ArrayList<Integer> num = new ArrayList<Integer>();
        for (int i = 1; i <= 2; i++) {
            int index = rand.nextInt(cards.size());
            num.add(cards.get(index));
            cards.remove(index);
        }
        return num;

    }

    public ArrayList<Integer> hit() {
        Random rand2 = new Random();
        ArrayList<Integer> num2 = new ArrayList<Integer>();
        int index2 = rand2.nextInt(cards.size());
        num2.add(cards.get(index2));
        cards.remove(index2);
        return num2;

    }

    @Override
    public int open() {
        int num3 = 0;
        for (int j = 0; j < myCards.size(); j++) {
            num3 += myCards.get(j);
        }
        return num3;
    }

    @Override
    public void setCard(ArrayList<Integer> a) {
        for (int i = 0; i <a.size(); i++) {
            myCards.add(a.get(i));
        }
    }

    @Override
    public boolean checkSum() {
        for (int k = 0; k <myCards.size(); k++) {
                System.out.println(myCards.get(k));
            }
            if (open() < 17) {
                return true;
            } else {
                return false;
            }
    }
}
