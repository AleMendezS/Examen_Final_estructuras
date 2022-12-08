package examen_final_estructuras;

public class NodoMaleta {
    private Maleta dato;
    private NodoMaleta next;
    
    @Override
    public String toString(){
        return "Nodo{"+"dato="+dato+'}';
    }
    
    public NodoMaleta(Maleta dato){
        this.dato=dato;
    }

    public Maleta getDato() {
        return dato;
    }

    public void setDato(Maleta dato) {
        this.dato = dato;
    }

    public NodoMaleta getNext() {
        return next;
    }

    public void setNext(NodoMaleta next) {
        this.next = next;
    }
    
    
}
