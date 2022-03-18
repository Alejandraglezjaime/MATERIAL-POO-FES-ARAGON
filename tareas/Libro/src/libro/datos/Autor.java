/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro.datos;

/**
 *
 * @author alejandraglezj
 */
public class Autor {
    private String name;
    private int edad;
    private String fechaNacimiento;
    private String lugarNacimiento;
    private int fallecimiento;

    public Autor() {
    }


    public Autor(String name, int edad, String fechaNacimiento, String lugarNacimiento, int fallecimiento) {
        this.name = name;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.lugarNacimiento = lugarNacimiento;
        this.fallecimiento = fallecimiento;
    }

   //********************************************
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public int getFallecimiento() {
        return fallecimiento;
    }

    public void setFallecimiento(int fallecimiento) {
        this.fallecimiento = fallecimiento;
    }
    
  //*****************************************************

    @Override
    public String toString() {
        return "Autor{" + "name=" + name + ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + ", lugarNacimiento=" + lugarNacimiento + ", fallecimiento=" + fallecimiento + '}';
    }
    
  //****************************************************
     
    public void abrir(){
        System.out.println("Abrir el libro...  ");
        System.out.println("Cargar pagina abierta anteriormente...");
    }
    
}
