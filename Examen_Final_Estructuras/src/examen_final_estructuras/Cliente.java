
package examen_final_estructuras;

public class Cliente {
    private String nombre;
    private String apellidos;
    private int cedula;
    private String correo;
    private int telefonoEmergencia;
    private int edad;
    private int numeroVuelo;
    
    public Cliente(String nombre, String apellidos, int cedula, String correo, 
            int telefonoEmergencia, int edad, int numeroVuelo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.correo = correo;
        this.telefonoEmergencia = telefonoEmergencia;
        this.edad = edad;
        this.numeroVuelo = numeroVuelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefonoEmergencia() {
        return telefonoEmergencia;
    }

    public void setTelefonoEmergencia(int telefonoEmergencia) {
        this.telefonoEmergencia = telefonoEmergencia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    
    @Override
    public String toString() {
        return "\n-------------- Cliente----------------- " + "\n"
                +"Nombre=" + nombre + " "
                + "Apellidos=" + apellidos + " "
                + "Cedula=" + cedula + " "
                + "Correo=" + correo + " "
                + "Tel. Emergencia=" + telefonoEmergencia + " "
                + "Edad=" + edad + " "
                + "NumeroVuelo=" + numeroVuelo ;
    }
}
