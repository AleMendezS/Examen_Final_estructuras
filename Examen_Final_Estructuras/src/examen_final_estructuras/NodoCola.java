
package examen_final_estructuras;

public class NodoCola {
    private String dato;
    private NodoCola atras;

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoCola getAtras() {
        return atras;
    }

    public void setAtras(NodoCola atras) {
        this.atras = atras;
    }

    public NodoCola(String dato) {
        this.dato = dato;
    }
    
    @Override
    public String toString(){ return dato; }
    
}
