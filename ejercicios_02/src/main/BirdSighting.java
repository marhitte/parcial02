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
public class BirdSighting {
    private String specie;
    private Integer number;
    private Integer day;
    
    public BirdSighting(){
        specie="Robin";
        number=1;
        day=1;
     }
  
    public BirdSighting(String s,Integer n,Integer d){
        specie=s;
        number=n;
        day=d;
    }
    
    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }
    
    @Override
    public String toString(){
        return specie+" "+number+" "+day;
    }
    
    
    public static void main(String[] args) {
        BirdSighting pajarito=new BirdSighting();
        System.out.println(pajarito);
        pajarito.getSpecie();
        pajarito.getNumber();
        pajarito.getDay();
        
        BirdSighting p2=new BirdSighting("cotorro",7,2);
        System.out.println(p2);
    }
    
    
}
