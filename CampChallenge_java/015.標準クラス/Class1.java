/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.sample1;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Class1 {
    
    public static void main(String[] args) throws ParseException{
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    
    Date day =  sdf.parse("2016/01/01 00:00:00");
    
    System.out.println(day.getTime());
    
    }
    
}
