/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.sample1;

class Human {

    public String name = "";
    public int age = 0;

    public void setHuman(String n, int a) {
        this.name = n;
        this.age = a;

    }

    public void print() {
        System.out.println(name + age);
    }
}

public class Class1 {

    public static void main(String[] args) {
        Human hito = new Human();

        hito.setHuman("添川", 26);
        hito.print();

    }

}
