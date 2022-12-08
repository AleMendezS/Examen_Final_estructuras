
package examen_final_estructuras;

public class Cola {
      private NodoCola frente;
    private NodoCola ultimo;
    private int largo;

    public Cola() {
    }
    
    
     public void encola(NodoCola cliente){
        if(frente == null){  // significa que la cola esta vacia
            frente = cliente;
            ultimo = cliente;
        } else{
            ultimo.setAtras(cliente);
            ultimo=cliente;
           
        }
        largo++;
    }
     
       public NodoCola extraer(){
        NodoCola aux = frente;
        if(frente!=null){
            frente=frente.getAtras();
            aux.setAtras(null);
            largo--;
        }
        return aux;
    }
      
       
       
       
       @Override
    public String toString(){
        String s="";
        NodoCola aux=frente;
        while(aux!=null){
            s+=aux+"\n";
            aux=aux.getAtras();
        }
        return s;
    }
}
