/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alejandraglezj
 */
public class JavaBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad =22;
        Integer edad2=new Integer(2);
        float x= edad2.floatValue();
        System.out.println(x);
        String dias = "23";
        System.out.println((dias + 3));
        int temp = Integer.parseInt(dias);
        
        edad2.parseInt("33");
        
        System.out.println("Dias = "+(temp + 3));
        
        Perro dog1 = new Perro("Poddle", 1);
        Perro dog2 = new Perro("poddle", 1);
        Perro dog3 = new Perro("Poddle", 1);
        System.out.println(dog1);
        System.out.println(Perro.cola);
        System.out.println(dog1.cola);
        
        Perro.ladrar();
        dog1.ladrar();
        
        String cad1="Hola";
        String cad2 = "Mundo";
        String cad3 = cad1+cad2;
        System.out.println(cad3);
        System.out.println("Edad : "+ edad + "años" );
        
        String res = "";
        edad = 15;
        if (edad>= 18){
            res = "Mayor de edad";
        } else {
            res = "Menor de edad";
        }
        
        System.out.println("Eres : "+ res);
        
        System.out.println("---------------");
        res=(edad>= 18)?"Mayor de edad": "menor de edad";
        System.out.println("Eres : "+res);
        
        int  val1 = 7;
        int  val2 = 2;
        System.out.println( val1 | val2);
         System.out.println( val1 & val2);
        /*
        val1 = 000...0111
        val2 = 000...0010
       ------------------
               000...0010 // 2 decimales 
        */
        
        //desplazamiento a nivel de bits 
        int val3 = 1;
        int val4 = val3<<1; //desplazamineot de bits un nivel a la izqq
        
        System.out.println(val4);
        val4 = val4<<1;
        
        System.out.println(val4);
        
        
        System.out.println("---------arreglos------------");
        
        int[]edades ; // aqui solo se declara 
        int [] edades2 = new  int[5]; //aqui se declara y se reserva en la memeoria 
        int [] edades3 = {22,21,18,19,18}; //se les asigna un valor en memoria 1=22 ,2= 21 ..... 
        
        /*
        ahora se igual que en C++
        */
        edades2[0]=33;
        System.out.println(edades2[0]); //33
        System.out.println(edades2[1]);     //0   
        
        //ahora imprimimos la edades 3
        
        System.out.println("edades 3 a mano");
        System.out.println(edades3[1]);
        System.out.println(edades3[2]);
        System.out.println(edades3[3]);
        System.out.println(edades3[4]);
        
        System.out.println("automatizado");
        for(int i = 0 ; i < edades3.length; i++){
            System.out.println(edades3[i]);
        }
   
        System.out.println("orden inverso ");
         for(int i = edades3.length ; i < 1; i--){
            System.out.println(edades3[i]);
        }
        
         
         System.out.println("eades a 18");
        
         //int lista=0;
         
         /*System.out.println("Todos los perros a doverman");
         for(Perro perro : lista){
         perro.setRaza("Doverman");}
         //volvemos a imprimir la lista
         for (Perro perro : lista){
             System.out.println(perro);
         }*/
         
         ArrayList mascotas = new ArrayList();
         mascotas.add(new Perro("Poddle", 1));
         mascotas.add(new Perro("Doverman", 2));
         mascotas.add(new Perro("Akita", 2));
         mascotas.add(new Perro("Gran danes", 3));
         
         for ( Object mascota : mascotas){
         Perro tmp = (Perro)mascota;
             System.out.println(tmp);
         }
         
         //despues de la version 2 de java se agrego el concepto de clases genericas
        System.out.println(" con genericas");
         ArrayList<Perro> mascotas2 = new ArrayList<Perro>();
         mascotas2.add(new Perro("Poddle",1 ));
         mascotas2.add(new Perro("Doverman", 2));
         mascotas2.add(new Perro("Akita", 2));
         mascotas2.add(new Perro("Gran danes", 3));
         
         Scanner teclado = new Scanner(System.in);
         System.out.println("Que raza quieres cambiar de tamaño : ");
         String raza= teclado.next();
         
         
         
         for (Perro perro : mascotas2){
             System.out.println(perro);
             System.out.println("-----------------");
                     
             if ( perro.getRaza().equals("Akita") ){
             perro.setTamaño(4);
             }
             
             System.out.println(perro);}
             
         
         mascotas2.add(2, new Perro("Pug", 2));
         
        for (Perro perro : mascotas2){
            System.out.println(perro);
        }
         
         System.out.println("Perro 2 es : "+ mascotas2.get(2));
        
    }
    
}



