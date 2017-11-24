/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.sample2;
import java.util.ArrayList;
import java.util.Random;

public class Blackjuck {

    public static void main(String[] args) {
        Dealer dl = new Dealer();
        User us = new User();
        String D = "ディーラー";
        String U = "ユーザー";
        dl.setCard(dl.deal());
        us.setCard(dl.deal());
        
        //17未満なら繰り返すカードを引く
        while (dl.checkSum()) {
            dl.setCard(dl.hit());
            
        }
        //17未満なら繰り返すカードを引く
        while (us.checkSum()) {
            us.setCard(dl.hit());
        }
    

        
        //合計値を表示
        System.out.println(dl.open());
        System.out.println(us.open());
        
        if ((dl.open() <= 21) && (us.open() <= 21)) {
            if (dl.open() > us.open()) {
                System.out.println(D + "の勝ち " + U + "の負け");
            } else if (dl.open() < us.open()) {
                System.out.println(U + "の勝ち " + D + "の負け");
            }
            else {
                if(dl.open()==21 && us.open()==21){
                    System.out.println("ブラックジャック");
                }
                else{
                    System.out.println("引き分け");
                }
            }
            
        } else if (dl.open() > 21) {
            System.out.println(U + "の勝ち " + D + "の負け");
        } else {
            System.out.println(D + "の勝ち " + U + "の負け");
        }

    }

}
