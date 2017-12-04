/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.sample1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Class8 {
    public static void main(String[] args) throws IOException{
        File fp = new File("PR.text");
        
        FileWriter fw = new FileWriter(fp);
        fw.write("添川陽太です。趣味はバドミントンです！");
        fw.close();
    }
    
}
