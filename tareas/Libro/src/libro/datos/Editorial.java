/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro.datos;

/**
 *
 * @author alejandraglezj
 */
public class Editorial {
    
    private String nomEditorial;
    private String edicionEditorial;
    private String direccion;
    private int telefono;
    private String correo;
   

    public Editorial() {
    }

    public Editorial(String nomEditorial, String edicionEditorial, String direccion, int telefono, String correo) {
        this.nomEditorial = nomEditorial;
        this.edicionEditorial = edicionEditorial;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    //*********************************************

    public String getNomEditorial() {
        return nomEditorial;
    }

    public void setNomEditorial(String nomEditorial) {
        this.nomEditorial = nomEditorial;
    }

    public String getEdicionEditorial() {
        return edicionEditorial;
    }

    public void setEdicionEditorial(String edicionEditorial) {
        this.edicionEditorial = edicionEditorial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    //*********************************************

    @Override
    public String toString() {
        return "Editorial{" + "nomEditorial=" + nomEditorial + ", edicionEditorial=" + edicionEditorial + ", direccion=" + direccion + ", telefono=" + telefono + ", correo=" + correo + '}';
    }
    
    //*************************************
    public void cerrar(){
        System.out.println("Guardar ultima pagina ");
        System.out.println("Cerrar libro...");
        
    }

    
    
    
    
    
}
