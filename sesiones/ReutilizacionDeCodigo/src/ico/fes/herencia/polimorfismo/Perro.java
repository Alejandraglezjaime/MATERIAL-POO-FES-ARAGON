/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia.polimorfismo;
/**
 *
 * @author alejandraglezj
 */
//necesita la palabra reservada para heredar
public class Perro extends Animal {
    
   private String raza;

    public Perro() {
    }
    //Aqui se ingresan dos constructores, pues hereda los atributos de animal
    public Perro(String raza) {
        this.raza = raza;  }

    public Perro(String raza, int numeroPatas) {
        super(numeroPatas);
        this.raza = raza; }
    //getts and setters
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    //toString pero acuerdate que esta heredando
    @Override
    public String toString() {
        return super.toString()+ "Perro{" + "raza=" + raza + '}';
    }
    
    
   @Override
    public void hablar() {
        System.out.println("El perro de raza "+this.raza + "esta ladrando");
        System.out.println("Guau guau!!!");
    }
    
    //polimorfismo por el concepto de sobrecarga de metodo
    public void hablar (int veces){
        for (int i =0 ; i < veces; i++ ){
            System.out.println("Guau ! "); }
            
    }
   
}
