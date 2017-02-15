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
public class TestBloodData {
    public static void main(String[] args) {
        BloodData p1=new BloodData();
        System.out.println(p1.getBlood()+""+p1.getRh());
        BloodData p2=new BloodData("AB","+");
        System.out.println(p2.getBlood()+""+p2.getRh());
    }
}
