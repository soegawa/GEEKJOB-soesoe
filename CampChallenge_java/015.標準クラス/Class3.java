/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.sample1;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;


public class Class3 {
    public static void main(String[] args) throws ParseException{
        
        SimpleDateFormat SDF = new SimpleDateFormat("yyyy年MM月d日 HH時m分s秒");
        Date d = SDF.parse("2016年11月4日 10時0分0秒");
        Date D = new Date(d.getTime());
        
        System.out.print(SDF.format(D));
        
        
        
        
    }
}
