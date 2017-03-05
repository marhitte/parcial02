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
public class Candle {
    private String color;
    private Integer altura;
    private Float precio;

    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    public Integer getAltura() {
        return altura;
    }

   
    public void setAltura(Integer a) {
         this.altura = a;
         this.precio=(float)altura*2;
         
    }

    
    public Float getPrecio() {
        return precio;
    }

    

   
    
    
    
    
}
