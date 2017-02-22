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
public class TestBloodData {
    public static void main(String[] args) {
        BloodData sangre=new BloodData();
        System.out.println(sangre.getTipo()+" "+sangre.getRh());
        BloodData s2=new BloodData(Blood.A, RhFactor.POSITIVO);
        System.out.print(s2.getTipo()+" "+s2.getRh());
    }
}
