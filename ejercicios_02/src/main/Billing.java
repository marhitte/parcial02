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
public class Billing {
    private Double price;
    private Double quant;
    private Double coupon;
    
    
   public Double computeBill(Double p){
       this.setPrice(p);
      return(this.getPrice())*1.08;
    }
   public Double computeBill(Double p,Double q){
       this.setPrice(p);
       this.setQuant(q);
       return (this.getPrice()*this.getQuant())*1.08;
   }
   
   public Double computeBill(Double p,Double q, Double c){
       this.setPrice(p);
       this.setQuant(q);
       this.setCoupon(c);
       return((this.getPrice()*this.getQuant())-(((this.getPrice()*this.getQuant())*this.getCoupon())/100))*1.08;
   }

    public Double getPrice() {
        return price;
    }


    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getQuant() {
        return quant;
    }

   
    public void setQuant(Double quant) {
        this.quant = quant;
    }

   
    public Double getCoupon() {
        return coupon;
    }

      public void setCoupon(Double coupon) {
        this.coupon = coupon;
    }
   
     public static void main(String[] args) {
        Billing pre=new Billing();
        Billing cant=new Billing();
        Billing cup=new Billing();
        Billing fin=new Billing();
        
        pre.setPrice(25.00);
        cant.setQuant(3.0);
        cup.setCoupon(10.0);
        
        System.out.println(fin.computeBill(pre.getPrice()));
        System.out.println(fin.computeBill(pre.getPrice(),pre.getQuant()));
        System.out.println(fin.computeBill(pre.getPrice(),pre.getQuant(),pre.getCoupon()));
    }
    
}
