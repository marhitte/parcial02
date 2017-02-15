/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author victorhugo
 */
public class TestCircle {
    public static void main(String[] args) {
        Circle c1=new Circle(2.0);
        Circle c2=new Circle(4.0);
        Circle c3=new Circle();
        
        
        System.out.println(c1.getRadius());
        System.out.println(c2.getRadius());
        System.out.println(c3.getRadius());
         
    }
}
