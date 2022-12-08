package examen_final_estructuras;

public class ListaSimpleNoOrdenadaClientesFinalizados {

    private NodoClientesFinalizados cabeza;

    public void inserta(Cliente cliente) {
        int pos = 0;
        if (cabeza == null) {
            cabeza = new NodoClientesFinalizados(cliente);
        } else {

            NodoClientesFinalizados aux = cabeza;

            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            NodoClientesFinalizados temp = new NodoClientesFinalizados(cliente);
            temp.setNext(aux.getNext());
            aux.setNext(temp);

        }
    }

    @Override
    public String toString() {
        NodoClientesFinalizados aux = cabeza;
        String s = "Lista\n ";
        while (aux != null) {
            s += aux + "\n, ";
            aux = aux.getNext();
        }
        return s;
    }
}
