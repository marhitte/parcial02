/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.lang.Math;
/**
 *
 * @author victorhugo
 */
public class Circle {
    private Double radius;
    private Double diameter;
    private Double area;
    
    public Circle(){
        this.radius=1.0;
        this.diameter= 2*this.radius;
        this.area=Math.PI*(Math.pow(this.radius,2));
    }

    public Circle(Double r){
        this.radius=r;
    }            
            
            
   
    public Double getRadius() {
        return radius;
     
    }

  
    public void setRadius(Double radius) {
        this.radius = radius;
        this.diameter= 2*this.radius;
        this.area=Math.PI*(Math.pow(this.radius,2));
    }
    
    
}
