/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.sample1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author soele
 */
public class Class4 {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat SDF = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
        Date d = SDF.parse("2015年12月31日 23時59分59秒");
        Date d2 = SDF.parse("2015年01月01日 00時00分00秒");
        
        System.out.print(d.getTime()-d2.getTime());
    }
            
}
