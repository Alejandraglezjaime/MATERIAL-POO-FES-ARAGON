
package ico.fes.herencia;

//palabra reservada de java con la que se implementa la herencia
public class Alumno extends Persona {
    private String numeroCuenta;
    private String carrera; 
    private int semestre;

    public Alumno() { }

/* gracias a la palabra reservada Java nos da la opcion de dos constructores, el de la clase 
   alumno y el constructor de la clase persona juntos, se agregan ambos al codigo*/
    public Alumno(String numeroCuenta, String carrera, int semestre, String nombre, int edad) {
        super(nombre, edad);
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
        this.semestre = semestre; }

    public Alumno(String numeroCuenta, String carrera, int semestre) {
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
        this.semestre = semestre; }

//se ingresa los setts and getter normal
    public int getSemestre() {
        return semestre; }

    public void setSemestre(int semestre) {
        this.semestre = semestre; }

    public String getNumeroCuenta() {
        return numeroCuenta; }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;  }

    public String getCarrera() {
        return carrera; }

    public void setCarrera(String carrera) {
        this.carrera = carrera; }

//como se trata de una herencia se poner atelante de toString la palabra String    
    @Override
    public String toString() {
        return super.toString() + "Alumno{" + "numeroCuenta=" + numeroCuenta + ", carrera=" + carrera + ", semestre=" + semestre + '}';
    }

}
