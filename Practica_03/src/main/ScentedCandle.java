/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author pc
 */
public class ScentedCandle extends Candle {
    private String aroma;

   
    public String getAroma() {
        return aroma;
    }

   public void setAroma(String aroma) {
        this.aroma = aroma;
    }
  @Override
   public void setAltura(Integer n){
       super.setAltura(n);
       
       
   }
   
   
    public static void main(String[] args) {
        Candle  c1=new Candle();
        c1.setColor("Melón");
        c1.setAltura(3);
        System.out.println(c1.getPrecio());
        
        ScentedCandle c2= new ScentedCandle();
        c2.setColor("mandarina");
        c2.setAltura(6);
        System.out.println(c2.getPrecio());
    }
   
   
   
   
}
