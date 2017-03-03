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
public class CarRental {
    private String rentador;
    private String codigoPostal;
    private Integer dias;
    private Double precio;
    private Double total;
 
    public String getRentador() {
        return rentador;
    }

     public void setRentador(String rentador) {
        this.rentador = rentador;
    }

    
    public String getCodigoPostal() {
        return codigoPostal;
    }

    
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

   
    public Integer getDias() {
        return dias;
    }

 
    public void setDias(Integer dias) {
        this.dias = dias;
    }

    /**
     * @return the precio
     */
    public Double getPrecio() {
        return precio;
    }
    
   public void setPrecio(tamanio t){
       switch (t) {
            case ECONOMICO:
                precio=29.99;
                break;
            case MEDIO:
                precio=38.99;
               break;
            case GRANDE:
                precio=43.50;
                  break;
            default:
                break;
        }
   }

   
    public Double getTotal() {
        return total;
    }

      public void setTotal(Double tot) {
       tot=this.precio;
       total=tot*dias;
    }
    
    
    public enum tamanio{
        ECONOMICO,MEDIO,GRANDE;
    }
    
    public void display(){
        
        CarRental r1=new CarRental();
        r1.setRentador("asfdj");
        r1.setCodigoPostal("89000");
        r1.setDias(10);
        r1.setPrecio(tamanio.ECONOMICO);
        r1.setTotal(precio);
        
        
        System.out.println("Renter's name: "+r1.getRentador()+"\nZip code: "+r1.getCodigoPostal()+"\nDías: "+r1.getDias()+"\nPrecio: "+r1.getPrecio()+"\n Total: "+r1.getTotal());
    }
   
    public static void main(String[] args) {
        CarRental ren= new CarRental();
        ren.display();
    }
    
}
