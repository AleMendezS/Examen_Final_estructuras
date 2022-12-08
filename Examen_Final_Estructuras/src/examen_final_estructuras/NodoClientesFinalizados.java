package examen_final_estructuras;

public class NodoClientesFinalizados {
    private Maleta dato;
    private NodoClientesFinalizados next;
    
    @Override
    public String toString(){
        return "Nodo{"+"dato="+dato+'}';
    }
    
    public NodoClientesFinalizados(Maleta dato){
        this.dato=dato;
    }

    public Maleta getDato() {
        return dato;
    }

    public void setDato(Maleta dato) {
        this.dato = dato;
    }

    public NodoClientesFinalizados getNext() {
        return next;
    }

    public void setNext(NodoClientesFinalizados next) {
        this.next = next;
    }
    
    
}
