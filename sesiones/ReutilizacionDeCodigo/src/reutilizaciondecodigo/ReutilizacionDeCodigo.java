/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizaciondecodigo;

import ico.fes.Monitor;
import ico.fes.Mouse;
import ico.fes.Procesador;
import ico.fes.equipo.Computadora;
import ico.fes.herencia.Alumno;
import ico.fes.herencia.polimorfismo.Animal;
import ico.fes.herencia.polimorfismo.Perro;
import ico.fes.iu.MiVentana;

/**
 *
 * @author alejandraglezj
 */
public class ReutilizacionDeCodigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           String facultad = new String ("FES Aragon");
           char letra=facultad.charAt(4);
           System.out.println(letra);

         //   MiVentana v1= new MiVentana(); 
            
         Computadora compu = new Computadora();
         compu.setMarca("Asus");
         compu.setModelo("VivoBook 2");
         compu.setCpu( new Procesador("Intel","i9",5.0f));
         
         Mouse raton=new Mouse();
         raton.setMarca("Logitech");
         compu.setRaton(raton);
         
         compu.setRaton(raton);
         
         compu.getRaton().setModelo("GS400");
         
          System.out.println(compu);
          
        //metodo 1
         Monitor pantalla = new Monitor();
         pantalla.setMarca("Samsumg");
         pantalla.setPulgadas(45.0f);
         pantalla.setTipo("LED");
         compu.setPantalla(pantalla);
         System.out.println(compu);
         
         
         System.out.println("------------HERENCIA ----------------");
         Alumno alu1 = new Alumno();
         alu1.setNombre("Jose");
         System.out.println(alu1);
         
         Alumno alu2 = new Alumno("31927541-2","ICO",2,"Ale",19);
         System.out.println(alu2);

         System.out.println("***** POLIMORFISMO ******");
         Animal animal1 = new Animal();
         Perro animal2 = new Perro("Chihuahua",4);
         
         animal1.hablar();
         animal2.hablar();
         animal2.hablar(2); 
        //aqui esta indicando cuantas veces va a imprimir el guau
         
    }
    
}

