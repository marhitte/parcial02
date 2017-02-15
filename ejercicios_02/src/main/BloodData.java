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
public class BloodData {
     private String blood;
     private String rh;
     
     public BloodData(){
         this.blood="O";
         this.rh="+";
         
     }
    
   public BloodData(String b,String r){    
    this.blood=b;
    this.rh=r;
    }

    
    public String getBlood() {
        return blood;
    }

   
    public void setBlood(String blood) {
        this.blood = blood;
    }

  
    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }
   
   
}
