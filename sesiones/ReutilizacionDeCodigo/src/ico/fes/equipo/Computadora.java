
package ico.fes.equipo;

import ico.fes.Monitor;
import ico.fes.Mouse;
import ico.fes.Procesador;
import ico.fes.Teclado;

/**
 *
 * @author alejandraglezj
 */
public class Computadora {
    //esto seria la composicion
     private String marca;
     private String modelo;
     private Monitor pantalla; 
     private Mouse raton;
     private Procesador cpu;
     private Teclado teclado; 

    //estacio+enter
    public Computadora() {
    }
    //espacio + enter **** CONSTRUCTOR ****
    public Computadora(String marca, String modelo, Monitor pantalla, Mouse raton, Procesador cpu, Teclado teclado) {
        this.marca = marca;
        this.modelo = modelo;
        this.pantalla = pantalla;
        this.raton = raton;
        this.cpu = cpu;
        this.teclado = teclado;
    }
    //****GETS AND SETTER ****
    public Teclado getTeclado() {
        return teclado; }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado; }

    public String getMarca() {
        return marca; }

    public void setMarca(String marca) {
        this.marca = marca; }

    public String getModelo() {
        return modelo; }

    public void setModelo(String modelo) {
        this.modelo = modelo; }

    public Monitor getPantalla() {
        return pantalla; }

    public void setPantalla(Monitor pantalla) {
        this.pantalla = pantalla; }

    public Mouse getRaton() {
        return raton; }

    public void setRaton(Mouse raton) {
        this.raton = raton;  }

    public Procesador getCpu() {
       return cpu; }

    public void setCpu(Procesador cpu) {
        this.cpu = cpu; }
    // **** tostring****
    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ", pantalla=" + pantalla +   ", raton=" + raton + ", cpu=" + cpu + ", teclado=" + teclado + '}';
    }
    
}
