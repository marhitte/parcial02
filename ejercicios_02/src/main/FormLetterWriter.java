/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class FormLetterWriter {
    private String lastName;
    private String firstName;

   public void displaySalutation(String last){
        this.lastName=last;
        System.out.println("Dear Mr. or Mrs. "+this.lastName+"\nThank you for your recent order. ");
    }
    
   public void displaySalutation(String firs,String las){
       this.firstName=firs;
       this.lastName=las;
       System.out.println("Dear "+this.firstName+" "+this.lastName+"\nThannk you for your recent order. ");
   }
    
   public String getLastName(){
       return lastName;
   }
   
   public void setLastName(String l){
       this.lastName=l;
   }
   
   public String getFirstName(){
       return firstName;
   }
   
   public void setFirstName(String f){
       this.firstName=f;
}
   
    public static void main(String[] args) {
        FormLetterWriter las=new FormLetterWriter();
        FormLetterWriter fis=new FormLetterWriter();
        FormLetterWriter fin=new FormLetterWriter();
        
       las.setLastName("Brooks");
       fis.setFirstName("Alice");
       fin.displaySalutation(las.getLastName());
       fin.displaySalutation(fis.getFirstName(),las.getLastName());
       
            
    }
   
}
