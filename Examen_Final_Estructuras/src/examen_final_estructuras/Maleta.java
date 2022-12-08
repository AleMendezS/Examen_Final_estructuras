
package examen_final_estructuras;

public class Maleta {
    private int ancho;
    private int largo;
    private int fondo;
    private int peso;
    private Cliente cliente;
    
    public Maleta(int ancho, int largo, int fondo, int peso, Cliente cliente) {
        this.ancho = ancho;
        this.largo = largo;
        this.fondo = fondo;
        this.peso = peso;
        this.cliente = cliente;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getFondo() {
        return fondo;
    }

    public void setFondo(int fondo) {
        this.fondo = fondo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    @Override
    public String toString() {
        return "Maleta: " +"\n"
                + ", Ancho=" + ancho +""
                + ", Largo=" + largo +""
                + ", Fondo=" + fondo + '}'+""
                + ", Peso=" + peso +""
                + " Cliente ="+ cliente+""
                +"---------------Maleta-----------"+"\n";
    }
}
