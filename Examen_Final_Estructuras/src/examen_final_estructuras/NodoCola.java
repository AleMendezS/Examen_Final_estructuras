
package examen_final_estructuras;

public class NodoCola {
    private Cliente cliente;
    private NodoCola atras;

    public NodoCola(Cliente cliente, NodoCola atras) {
        this.cliente = cliente;
        this.atras = atras;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public NodoCola getAtras() {
        return atras;
    }

    public void setAtras(NodoCola atras) {
        this.atras = atras;
    }

    @Override
    public String toString() {
        return "NodoCola{" + "cliente=" + cliente + ", atras=" + atras + '}';
    }

    

   

  

   
   
    
}
