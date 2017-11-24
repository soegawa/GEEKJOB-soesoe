package org.camp.sample2;

import java.util.ArrayList;

abstract class Human{
    abstract public int open();
    abstract public void setCard(ArrayList<Integer> a); 
    abstract public boolean checkSum();
    ArrayList<Integer> myCards = new ArrayList<Integer>();
    
    
}

