/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *

 */
public class Sandwich {
    private String ingredient;
    private String bread;
    private Double price;
    
  /* public String ingrePincipal(String ingre){
      ingredient=ingre;
      return ingredient;
    } 
  public String tipoPan(String pan){
       bread=pan;
       return bread;
   }
   
    public Double precio(Double pre){
        price=pre;
        return price;
    }
    */
    public String getIngredient(){
        return ingredient; 
    }
    
    public void setIngredient(String i){
        this.ingredient=i;
    }
    
    public String getBread(){
        return bread; 
    }
    
    public void setBread(String p){
        this.bread=p;
    }
    
    public Double getPrice(){
        return price; 
    }
    
    public void setPrice(Double r){
        this.price=r;
    }
}
