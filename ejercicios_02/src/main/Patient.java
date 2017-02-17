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
public class Patient {
    private String idnum;
    private Integer age;
    private BloodData sangre;
    
    public Patient(){
      idnum="0";
       age=0;
      sangre=new BloodData();
    }
    
    public Patient(String id,Integer a,BloodData t){
        this.idnum=id;
        this.age=a;
        this.sangre=t;
    }

    public String getIdnum() {
        return idnum;
    }


    public void setIdnum(String idnum) {
        this.idnum = idnum;
    }

      public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BloodData getSangre() {
        return sangre;
    }

     public void setSangre(BloodData sangre) {
        this.sangre = sangre;
    }

    
}
