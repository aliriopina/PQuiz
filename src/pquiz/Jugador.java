package pquiz;

import javax.swing.JOptionPane;

public class Jugador {

    int inicio;

    //Primera pantalla
    public void inicioPartida() {

        inicio = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a Questionary! \nInstrucciones: Digita el número de tu respuesta y presiona aceptar. \n\n1) Empezar partida. \n0) Salir. "));
        
    } 

    //Salida sin participar
    public void Salida() {

        JOptionPane.showMessageDialog(null,"Hasta la vista!");

    }
    
}
