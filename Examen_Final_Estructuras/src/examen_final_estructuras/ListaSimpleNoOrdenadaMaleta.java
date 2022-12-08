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
    
    
    public void insertaModificado(Maleta maleta) {
        int pos = 0;
        if (cabeza == null) {
            cabeza = new NodoMaleta(maleta);
        } else {

            NodoMaleta aux = cabeza;
            NodoMaleta insertaAlInicio = new NodoMaleta(maleta);
            
           
            if ((maleta.getAncho()+maleta.getLargo()+maleta.getFondo())%2!=0){
                System.out.println("es impar");
                while (aux.getNext() != null){
                    aux= aux.getNext();
                }
                NodoMaleta temp = new NodoMaleta(maleta);
                aux.setNext(temp);
            }else{
                System.out.println("es Par");
                insertaAlInicio.setNext(aux);
                cabeza=insertaAlInicio;
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
