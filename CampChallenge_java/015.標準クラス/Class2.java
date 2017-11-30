/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.sample1;
import java.util.Calendar;
import java.util.Date;

public class Class2 {
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        
        System.out.print(c.get(Calendar.YEAR)+"年");
        System.out.print(c.get(Calendar.MONTH)+"月");
        System.out.print(c.get(Calendar.DAY_OF_MONTH)+"日 ");
        System.out.print(c.get(Calendar.HOUR_OF_DAY)+"時");
        System.out.print(c.get(Calendar.MINUTE)+"分");
        System.out.print(c.get(Calendar.SECOND)+"秒");
        
    }
}
