/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import main.BloodData.Blood;
import main.BloodData.RhFactor;

/**
 *
 * @author victorhugo
 */
public class TestPatient {

public static void main(String[] args) {

Patient p1=new Patient();

System.out.println(p1.getIdnum()+"\n"+p1.getAge()+"\n"+p1.getSangre());

BloodData sangp2=new BloodData(Blood.AB, RhFactor.NEGATIVO);

Patient p2=new Patient("fguy ",12,sangp2);

System.out.println(p2.getIdnum()+"\n"+p2.getAge()+p2.getSangre());

}
}