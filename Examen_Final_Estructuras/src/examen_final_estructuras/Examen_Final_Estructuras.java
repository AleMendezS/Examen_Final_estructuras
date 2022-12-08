
package examen_final_estructuras;
import javax.swing.*;

public class Examen_Final_Estructuras {

  
public static void main(String[] args) {
       
        Cola colaClientes = new Cola();
        ListaSimpleNoOrdenadaClientesFinalizados listaFinalizados = new 
        ListaSimpleNoOrdenadaClientesFinalizados();
        ListaSimpleNoOrdenadaMaleta listaMaletas = new ListaSimpleNoOrdenadaMaleta();

        String [] opciones={"Comprar boletos e ingresar maletas","Observar la cola","extraer primero",
            "Mostrar finalizados","Ingresar maleta","Observar la lista de las maletas","Salir"};

        boolean op = true;
        while (op){
            int opcion = JOptionPane.showOptionDialog(null,
                    "Seleccione una de las siguientes opciones:",
                    "Tercer Examen",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null,
                    opciones, opciones[0]);
            if (opcion == 0){
                int edad = Integer.parseInt(JOptionPane.showInputDialog
                                            ("Digite la edad: "));
                String nombre = JOptionPane.showInputDialog
                                                 ("Digite el nombre: ");
                String apellido = JOptionPane.showInputDialog
                                            ("Digite el Apellido: ");
                int cedula = Integer.parseInt(JOptionPane.showInputDialog
                                                ("Digite el Cedula: "));
                String correo = JOptionPane.showInputDialog
                                                ("Digite su correo: ");
                int telefono = Integer.parseInt
            (JOptionPane.showInputDialog("Digite su telefono: "));
                int numVuelo = Integer.parseInt(JOptionPane.showInputDialog("Digite " +
                        "el numero de vuelo: "));
                Cliente cliente = new Cliente(nombre,apellido,cedula ,
                        correo,telefono,edad,numVuelo);
                colaClientes.encola(cliente);
                
                
            }else if(opcion == 1) {               
             JOptionPane.showMessageDialog(null, colaClientes.toString());
            }else if(opcion == 2){
                NodoCola clienteAtendido = colaClientes.atiende();
                JOptionPane.showMessageDialog(null, 
                        "El cliente atendido es: " + clienteAtendido.getCliente().toString());
                listaFinalizados.inserta(clienteAtendido.getCliente());
            }else if(opcion == 3){
                JOptionPane.showMessageDialog(null, listaFinalizados.toString());
            }else if(opcion == 4){
                
                int cedulaBuscar = Integer.parseInt(JOptionPane.showInputDialog
                    ("Digite la cedula del cliente dueño de la maleta: "));
                if(colaClientes.exist(cedulaBuscar)){
                Cliente cliente = colaClientes.extraer(cedulaBuscar);
                int ancho = Integer.parseInt(JOptionPane.showInputDialog
                                ("Digite el ancho de la maleta: "));
                int largo = Integer.parseInt(JOptionPane.showInputDialog
                                 ("Digite el largo de la maleta: "));
                int fondo = Integer.parseInt(JOptionPane.showInputDialog
                                   ("Digite el fondo de la maleta: "));
                int peso = Integer.parseInt(JOptionPane.showInputDialog
                                    ("Digite el peso de la maleta: "));
                
                listaMaletas.insertaModificado(new Maleta(ancho,largo,fondo,peso,cliente));
                }else{
                    JOptionPane.showMessageDialog(null,"El cliente no existe ");
                }
            }else if(opcion == 5){
               JOptionPane.showMessageDialog(null, listaMaletas.toString());
            }else if(opcion == 6){
                  op = false;
            }
        }
    }
}
