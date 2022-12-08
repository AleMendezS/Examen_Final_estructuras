package examen_final_estructuras;

public class NodoClientesFinalizados {
    private Cliente dato;
    private NodoClientesFinalizados next;
    
    @Override
    public String toString(){
        return "Nodo{"+"dato="+dato+'}';
    }
    
    public NodoClientesFinalizados(Cliente dato){
        this.dato=dato;
    }

    public Cliente getDato() {
        return dato;
    }

    public void setDato(Cliente dato) {
        this.dato = dato;
    }

    public NodoClientesFinalizados getNext() {
        return next;
    }

    public void setNext(NodoClientesFinalizados next) {
        this.next = next;
    }
    
    
}
