/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasictarea;

/**
 *
 * @author alejandraglezj
 */
class Cuentahabiente {
    private int idCliente;
    private String nombre;
    private int balance;
    private int monto;

    public Cuentahabiente() {
    }

    public Cuentahabiente(int idCliente, String nombre, int balance, int Retiro) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.balance = balance;
        this.monto = monto;
    }

 

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Cuentahabiente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", balance=" + balance + ", monto=" + monto + '}';
    }
    
     public void retirarDinero(  ){
        //código para restarle el monto al balance
        System.out.println("Usted cuenta con un balance de ... $ "+ this.balance);
        System.out.println("Retira : " +this.monto);
        balance=balance-monto;
         System.out.println("Procesando...");
        System.out.println("Saldo final : " + this.balance);      
     }
     
     public void evaluarNivelCliente(){
            /*Dependiendo el balance debe regresar un String con una de estas dos opciones:
                1.- “Cliente Regular” si es menor o igual a 50 mil.
                2.- “Cliente Premium” si es mayor a 50 mil*/
          if(balance>50000){
              System.out.println("Cliente premium");
          } if(balance<=50000||balance>0){
              System.out.println("Cliente regular");
          } if  (balance<0 ) { 
           System.out.println("Error");   
          }
     
     
     }


   
    
    
    
}
