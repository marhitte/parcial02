/* To change this license header, choose License Headers in Project Properties.
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
    private BloodData typ;
    
    public Patient(){
        this.idnum="0";
        this.age=0;
        this.typ=new BloodData();
    }
    
    public Patient(String id,Integer a,BloodData t){
        this.idnum=id;
        this.age=a;
        this.typ=t;
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

   
    public BloodData getTyp() {
        return typ;
    }

    
    public void setTyp(BloodData typ) {
        this.typ = typ;
    }
    
    
}
