
package examen_final_estructuras;
import javax.swing.*;

public class Examen_Final_Estructuras {

  
public static void main(String[] args) {
        Lista laLista = new Lista();
        

        String [] opciones={"Comprar boletos","Observar la cola","extraer primero",
            "Mostrar finalizados","Ingresar maletas","Observar la lista de las maletas"};

        boolean op = true;
        while (op){
            int opcion = JOptionPane.showOptionDialog(null,
                    "Seleccione una de las siguientes opciones:",
                    "Tercer Examen",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null,
                    opciones, opciones[0]);
            if (opcion == 0){
                int edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad: "));
                String nombre = JOptionPane.showInputDialog("Digite el nombre: ");
                String apellido = JOptionPane.showInputDialog("Digite el Apellido: ");
                String cedula = JOptionPane.showInputDialog("Digite el Cedula: ");
                int vuelo = Integer.parseInt(JOptionPane.showInputDialog("Digite " +
                        "el numero de vuelo: "));
                laLista.insertaCliente(new Cliente(edad, nombre,apellido,cedula ,vuelo));
            }else {
                op = false;
                JOptionPane.showMessageDialog(null, laLista.toString());
            }
        }
    }
}
