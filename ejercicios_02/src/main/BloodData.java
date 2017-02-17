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
     private Blood tipo;
     private RhFactor rh;
     
  public BloodData(){
      tipo=Blood.O;
      rh=RhFactor.POSITIVO;
  }
 public BloodData(Blood t, RhFactor rh){
     this.tipo=t;
     this.rh=rh;
 }
     
public enum Blood{
    O,A,B,AB;
}
 public enum RhFactor{
     POSITIVO,
     NEGATIVO;
 }

    public Blood getTipo() {
        return tipo;
    }

   
    public void setTipo(Blood tipo) {
        this.tipo = tipo;
    }

    public RhFactor getRh() {
        return rh;
    }

    public void setRh(RhFactor rh) {
        this.rh = rh;
    }
}
