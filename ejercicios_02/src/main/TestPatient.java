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
public class TestPatient {
     public static void main(String[] args) {
        Patient p1=new Patient();
        System.out.println(p1.getIdnum()+"\n"+p1.getAge()+"\n"+p1.getTyp());
        BloodData m=new BloodData();
        //Patient p2=new Patient("0176",5,m);
        //System.out.println(p2.getIdnum()+""+p2.getAge()+"\n"+p2.getTyp());
    }
}
