/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.sample1;

public class Class7 {
    public static void main(String[] args){
        String word = "きょUはぴIえIちぴIのくみこみかんすUのがくしゅうをしてIます";
        
        //別の文字をそれぞれ置換したい時はreplace().replace()と繋げていく
        System.out.print(word.replace("U","う").replace("I","い"));
        
    }
}
