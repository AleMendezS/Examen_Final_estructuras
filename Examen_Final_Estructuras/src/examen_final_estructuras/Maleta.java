
package examen_final_estructuras;

public class Maleta {
    private int ancho;
    private int largo;
    private int fondo;
    private int peso;
    
    public Maleta(int ancho, int largo, int fondo, int peso) {
        this.ancho = ancho;
        this.largo = largo;
        this.fondo = fondo;
        this.peso = peso;
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
                + ", Ancho=" + ancho +"\n"
                + ", Largo=" + largo +"\n"
                + ", Fondo=" + fondo + '}'+"\n"
                + ", Peso=" + peso +"\n"
                +"---------------Maleta-----------"+"\n";
    }
}
