package examen_final_estructuras;

public class ListaSimpleNoOrdenadaMaleta {

    private NodoMaleta cabeza;

   
    public void insertaModificado(Maleta maleta) {
       
        if (cabeza == null) {
            cabeza = new NodoMaleta(maleta);
        } else {

            NodoMaleta aux = cabeza;
            
            //nueva maleta a ingresar
            NodoMaleta temp = new NodoMaleta(maleta);
            
           
            if ((maleta.getAncho()+maleta.getLargo()+maleta.getFondo())%2!=0){
                // si el residuo de la sumatoria es diferente de 0
                System.out.println("es impar");
               
                //recorre la lista para enviarlo al final
                while (aux.getNext() != null){
                    aux= aux.getNext();
                }
                
                aux.setNext(temp);
            }else{
                System.out.println("es Par");
                // inserta el nuevo dato al inicio de la lista
                temp.setNext(aux); 
                //declaramos el nuevo dato como la cabeza
                cabeza=temp; // 
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
