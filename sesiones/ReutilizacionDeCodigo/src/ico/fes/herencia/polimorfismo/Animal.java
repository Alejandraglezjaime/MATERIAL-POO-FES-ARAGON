/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia.polimorfismo;

/**
 *
 * @author alejandraglezj
 */
public class Animal {
    private int numeroPatas; 
    
    public Animal() { }
    //constructor
    public Animal(int numeroPatas) {
        this.numeroPatas = numeroPatas; }
    //getts and setters 
    public int getNumeroPatas() {
        return numeroPatas;  }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;  }
    //toString
    @Override
    public String toString() {
        return "Animal{" + "numeroPatas=" + numeroPatas + '}';
    }
    
    public void hablar (){
        System.out.println("El animal esta emitiendo un sonido ");
    }

}
