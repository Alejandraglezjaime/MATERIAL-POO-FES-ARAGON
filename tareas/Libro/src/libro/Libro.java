
package libro;

import libro.datos.Autor;
import libro.datos.Editorial;
import libro.dt.partes;

/** @author alejandraglezj */

public class Libro {
    /**  @param args the command line arguments */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        partes datos = new partes();
         datos.setTitulo("CODIGO C.U.E.L.");
         datos.setTituloOriginal("The Fever Code");
         datos.setNumPaginas(376);
         datos.setDiseñoPortada("Marcelo Orsi Blanco");
         datos.setTraduccion("Silvina Poch");
         datos.setLugarImpresion("Mexico, noviembre 2016");
         datos.setCapitulos(63);
        
         Autor creador=new Autor();
         creador.setName("James Dashner");
         creador.setEdad(49);
         creador.setLugarNacimiento("Georgia, E.U.");
         creador.setFechaNacimiento("26 nov 1972");
         
         Editorial edit=new Editorial();
         edit.setNomEditorial("VR YA");
         edit.setTelefono(53529444);
         edit.setCorreo("editorial@vredotoras.com");
         
         datos.setEdit(edit);
         datos.setCreador(creador);
         
        creador.abrir();
        datos.accion();
        edit.cerrar();
        System.out.println(datos);
        
    }
    
}
