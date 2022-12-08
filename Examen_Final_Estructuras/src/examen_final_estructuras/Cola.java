package examen_final_estructuras;

import javax.swing.JOptionPane;

public class Cola {

    private NodoCola frente;
    private NodoCola ultimo;
    private int largo;

    public Cola() {
    }

    public boolean ColaVacia(){
        boolean vacio = false;
        if (frente==null){
            vacio = true;
        }
        return vacio;
    }
    
   public void encola(Cliente cliente){
        
        NodoCola nodito = new NodoCola();
        nodito.setCliente(cliente);
        nodito.setAtras(null);
        
        if (ColaVacia()){
            //si está vacía el primer nodo lo define como primero y último
            frente = nodito;
            ultimo = nodito;
        }else{
            //si no está vacía el nuevo nodo lo manda de último
            ultimo.setAtras(nodito);
            ultimo = nodito;
        }
    }
    
    public NodoCola extraer() {
        NodoCola aux = frente;
        if (frente != null) {
            frente = frente.getAtras();
            aux.setAtras(null);
            largo--;
        }
        return aux;
    }
    public Cliente extraer(int cedulaBuscar) {
        NodoCola aux = frente;
         Cliente cliente = null;
        while( aux != null){
                if(aux.getCliente().getCedula()== cedulaBuscar){
                    cliente =aux.getCliente();
                }
                aux= aux.getAtras();
             }
        return cliente; 
    }
    
    
    public boolean exist(int cedulaBuscar){
        boolean exist= false;
         NodoCola aux = frente;
         if(!ColaVacia()){
             while( aux != null){
                if(aux.getCliente().getCedula()== cedulaBuscar){
                    exist= true;
                }
                aux= aux.getAtras();
             }
         }
         
        return exist;
    }
            
            
    public NodoCola atiende(){
        NodoCola aux = frente;
        if(frente!=null){
            frente=frente.getAtras();
            aux.setAtras(null);
        }else if(frente==null){
            JOptionPane.showMessageDialog(null,"La cola está vacía");
        }
        return aux;
    }
    
    
    @Override
    public String toString() {
        String s = "";
        NodoCola aux = frente;
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getAtras();
        }
        return s;
    }
}
