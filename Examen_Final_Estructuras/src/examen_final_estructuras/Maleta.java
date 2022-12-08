
package examen_final_estructuras;

public class Maleta {
    
    private int cedulaCliente;
    private int peso;
    private int longitud;
    private int largo;

    public Maleta(int cedulaCliente, int peso, int longitud, int largo) {
        this.cedulaCliente = cedulaCliente;
        this.peso = peso;
        this.longitud = longitud;
        this.largo = largo;
    }

    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Maleta: " +"\n"
                + "cedulaCliente=" + cedulaCliente +"\n"
                + ", peso=" + peso +"\n"
                + ", longitud=" + longitud +"\n"
                + ", largo=" + largo + '}'+"\n"
                +"---------------Maleta-----------"+"\n";
    }
    
    
}
