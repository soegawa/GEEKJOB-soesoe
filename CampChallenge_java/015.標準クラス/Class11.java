/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.sample1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Class11 {
    public static void main(String[] args) throws IOException{
        File file = new File("log.text");
        FileWriter fw = new FileWriter(file);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date today = new Date();
        
        fw.write(sdf.format(today)+"開始\r\n");
        Character ch = new Character('a');
        fw.write("Characterクラス、変数chに引数は"+ch+"で作成\r\n");
        Character ch2 = new Character('B');
        fw.write("Characterクラス、変数ch2に引数は"+ch2+"で作成\r\n");
        
        System.out.println(Character.isLowerCase(ch));
        fw.write("変数chは小文字かどうかをtrue,falseで表示させる\r\n");
        System.out.println(Character.isLowerCase(ch2));
        fw.write("変数ch2は小文字かどうかをtrue,falseで表示させる\r\n");
        fw.write(sdf.format(today)+"終了\r\n");
        fw.close();
    }
    
}
