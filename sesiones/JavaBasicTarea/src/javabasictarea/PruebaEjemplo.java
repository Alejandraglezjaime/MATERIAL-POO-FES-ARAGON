/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasictarea;

/**
 *
 * @author alejandraglezj
 */
public class PruebaEjemplo {
    private String iD;
    private String nombreCliente;
    private int balanceFinal;

    public PruebaEjemplo() {
    }

    public PruebaEjemplo(String iD, String nombreCliente, int balanceFinal) {
        this.iD = iD;
        this.nombreCliente = nombreCliente;
        this.balanceFinal = balanceFinal;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getBalanceFinal() {
        return balanceFinal;
    }

    public void setBalanceFinal(int balanceFinal) {
        this.balanceFinal = balanceFinal;
    }

    @Override
    public String toString() {
        return "PruebaEjemplo{" + "iD=" + iD + ", nombreCliente=" + nombreCliente + ", balanceFinal=" + balanceFinal + '}';
    }


    
    
   public void nivelCliente(){
            /*Dependiendo el balance debe regresar un String con una de estas dos opciones:
                1.- “Cliente Regular” si es menor o igual a 50 mil.
                2.- “Cliente Premium” si es mayor a 50 mil*/
          if(balanceFinal>50000){
              System.out.println("Cliente premium");
          } if(balanceFinal <=50000||balanceFinal>0){
              System.out.println("Cliente regular");
          } if (balanceFinal<0 ) { 
           System.out.println("Error");   
          }
    
    
}

}