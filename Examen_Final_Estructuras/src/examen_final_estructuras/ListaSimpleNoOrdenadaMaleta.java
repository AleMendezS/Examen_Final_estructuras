package examen_final_estructuras;

public class ListaSimpleNoOrdenadaMaleta {

    private NodoMaleta cabeza;

    public void inserta(Maleta m) {
        int pos = 0;
        if (cabeza == null) {
            cabeza = new NodoMaleta(m);
        } else {

            NodoMaleta aux = cabeza;
            while (aux.getNext() != null && pos != 2) {
                aux = aux.getNext();
                pos+=1;
            }
            if (m.getPeso() % 2 != 0 && aux.getDato().getPeso()%2!=0) {
                aux.setDato(m);
            } else {

                while (aux.getNext() != null) {
                    aux = aux.getNext();
                }
                NodoMaleta temp = new NodoMaleta(m);
                temp.setNext(aux.getNext());
                aux.setNext(temp);
            }
        }
    }

    @Override
    public String toString() {
        NodoMaleta aux = cabeza;
        String s = "Lista\n ";
        while (aux != null) {
            s += aux + "\n, ";
            aux = aux.getNext();
        }
        return s;
    }
}
