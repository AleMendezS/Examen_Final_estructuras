
package examen_final_estructuras;

public class Cliente {
    private int edad;
    private String nombre;
    private String Apellidos;
    private int cedula;
    private int numeroVuelo;

    public Cliente(int edad, String nombre, String Apellidos, int cedula, int numeroVuelo) {
        this.edad = edad;
        this.nombre = nombre;
        this.Apellidos = Apellidos;
        this.cedula = cedula;
        this.numeroVuelo = numeroVuelo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    @Override
    public String toString() {
        return "\nCliente: " + "\n"
                +"edad=" + edad + "\n"
                + "nombre=" + nombre + "\n"
                + "Apellidos=" + Apellidos + "\n"
                + "cedula=" + cedula + "\n"
                + "numeroVuelo=" + numeroVuelo + "\n"
                +"------------- Cliente -------------";
    }
    
    
    
    
}
