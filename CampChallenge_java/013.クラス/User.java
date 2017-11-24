
package org.camp.sample2;

import java.util.ArrayList;
import java.util.Random;

public class User extends Human{

    
    
    
    
    @Override
    public int open() {
        int num4 = 0;
        for (int j = 0; j < myCards.size(); j++) {
            num4 += myCards.get(j);
        }
        return num4;
    }

    @Override
    public void setCard(ArrayList<Integer> b) {
        for (int m = 0; m < b.size(); m++) {
            myCards.add(b.get(m));
        }
    }

    @Override
    public boolean checkSum() {
        for (int k = 0; k < myCards.size(); k++) {
                System.out.println(myCards.get(k));
            }
        
            if (open() < 17) {
                return true;
            } else {
                return false;
            }
    }
}
 
