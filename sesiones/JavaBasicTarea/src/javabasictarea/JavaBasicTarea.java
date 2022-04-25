/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasictarea;

/**
 *
 * @author alejandraglezj
 */
public class JavaBasicTarea {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
      Cuentahabiente usuario1 = new Cuentahabiente();
      usuario1.setNombre("Alonso Fernandez");
      usuario1.setIdCliente(5513058);
      usuario1.setBalance(200);
      System.out.println(usuario1);
        
      usuario1.setMonto(150);
     
     
     usuario1.retirarDinero();
     usuario1.evaluarNivelCliente();
        System.out.println("---------------------------- ");
        System.out.println("");
      
        System.out.println("Arreglo de cuentahabiente");
        PruebaEjemplo [] arr = new PruebaEjemplo[5];
        
        
        arr[0]=new PruebaEjemplo("5152302", "Miranda Garcia", 18600);
        arr[1]=new PruebaEjemplo("1825893", "Jesus Marmolejo", 60650);
        arr[2]=new PruebaEjemplo("16042301", "Angel Antoy", 650);
        arr[3]=new PruebaEjemplo("16030584", "Jose Gomez", 1500);
        arr[4]=new PruebaEjemplo("16030230", "Sofia Carrillo", 7550);
        
        
        for (int i=0; i<5;i++ ){
            System.out.println(arr[i]);
        }
         
        
        for (PruebaEjemplo pruebaEjemplo : arr ){
             
        if( pruebaEjemplo.getBalanceFinal() >50000){
              System.out.println("Cliente premium");
          } if (pruebaEjemplo.getBalanceFinal() <=50000|| pruebaEjemplo.getBalanceFinal() >0 ){
              System.out.println("Cliente regular");
        } else { 
           System.out.println("Error");   
          }
        
    }
    
}
    }

