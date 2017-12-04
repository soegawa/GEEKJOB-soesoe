/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.sample1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Class9 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        File file = new File("PR.text");
        
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        System.out.print(br.readLine());
        br.close();
        
    }
}
