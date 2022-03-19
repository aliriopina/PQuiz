package pquiz;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;

public class PQuiz {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        Preguntas pregunta = new Preguntas();
        Jugador cm = new Jugador();
        Puntaje puntos = new Puntaje();
        boolean currentp = false;
        boolean perdio = false;
        boolean rcorrecta1 = true;
        boolean rcorrecta2 = false;
        boolean rcorrecta3 = false;
        boolean rcorrecta4 = false;
        boolean rcorrecta5 = false;

        //Inicio de partida
        while(currentp == false) {
            
        //Se evita que el usuario ingrese una opción no establecida.
        try{

        cm.inicioPartida();
      
        if (cm.inicio == 1) currentp = true;
        if (cm.inicio == 0) currentp = true;
        if (cm.inicio > 1 || cm.inicio < 0 ) JOptionPane.showMessageDialog(null, "Por favor, ingresa una opción valida");   
      
           } catch (NumberFormatException e) {

        JOptionPane.showMessageDialog(null,"Por favor, ingresa una opción valida");
        
           }   

        }

        if(cm.inicio == 1) {
        
        //Primer categoria
        while(rcorrecta1 == true) {   
            
          try{
              
          pregunta.preguntasFaciles();


        if (pregunta.respuesta < 0 || pregunta.respuesta > 4) {

            JOptionPane.showMessageDialog(null,"Por favor, seleciona una opción valida");
                  
        } else if (pregunta.respuesta == 0) {
              
            JOptionPane.showMessageDialog(null, "Has elegido salir!");
            rcorrecta1=false;

          } else if(pregunta.respuesta == 1) {
          
            puntos.sumaPuntosF();
            rcorrecta1 = false;
            rcorrecta2 = true; 

          }
          
          else if (pregunta.respuesta == 2 || pregunta.respuesta == 3 || pregunta.respuesta == 4 ) {

            JOptionPane.showMessageDialog(null,"Casi! La opción correcta es la 1 :c");
            perdio = true;        
            rcorrecta1 = false;

          } 
        
          }catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null,"Por favor, ingresa una opción valida");
    
          }   
                
        }

        //Segunda categoria
        while(rcorrecta2 == true) {

          try{

          pregunta.preguntasIntermedio();

          if(pregunta.respuesta == 3) {
          
            puntos.sumaPuntosM();
            rcorrecta2 = false;
            rcorrecta3 = true; 

          } else if (pregunta.respuesta == 0) {
              
            JOptionPane.showMessageDialog(null, "Has elegido salir!");
            rcorrecta2=false;

          } else if (pregunta.respuesta < 0 || pregunta.respuesta > 4) {

              JOptionPane.showMessageDialog(null,"Por favor, seleciona una opción valida");
          
          } else if (pregunta.respuesta == 1 || pregunta.respuesta == 2 || pregunta.respuesta == 4) {

            JOptionPane.showMessageDialog(null,"Casi! La opción correcta es la 3 :c");
            perdio = true; 
            rcorrecta2 = false;

          } 

          }catch (NumberFormatException e) {

          JOptionPane.showMessageDialog(null,"Por favor, ingresa una opción valida");
  
        }   
      
        }

        //Tercera categoria
        while(rcorrecta3 == true) {

          try {

          pregunta.preguntasDificil();

          if(pregunta.respuesta == 4) {
          
            puntos.sumaPuntosD();
            rcorrecta3 = false;
            rcorrecta4 = true; 

          } else if (pregunta.respuesta == 0) {
              
            JOptionPane.showMessageDialog(null, "Has elegido salir!");
            rcorrecta3=false;

          } else if (pregunta.respuesta < 0 || pregunta.respuesta > 4) {

              JOptionPane.showMessageDialog(null,"Por favor, seleciona una opción valida");
          
          } else if (pregunta.respuesta == 1 || pregunta.respuesta == 3 || pregunta.respuesta == 2) {

            JOptionPane.showMessageDialog(null,"Casi! La opción correcta es la 4 :c");
            perdio = true; 
            rcorrecta3 = false;

          } 

          }catch (NumberFormatException e) {

          JOptionPane.showMessageDialog(null,"Por favor, ingresa una opción valida");
  
          }   

        }

        //Cuarta categoria
        while(rcorrecta4 == true) {

          try{

          pregunta.preguntasExperto();
  
          if(pregunta.respuesta == 3) {
            
              puntos.sumaPuntosE();
              rcorrecta4 = false;
              rcorrecta5 = true; 
  
          } else if (pregunta.respuesta == 0) {
                
              JOptionPane.showMessageDialog(null, "Has elegido salir!");
              rcorrecta4=false;
  
          } else if (pregunta.respuesta < 0 || pregunta.respuesta > 4) {
  
                JOptionPane.showMessageDialog(null,"Por favor seleciona una opción valida");
            
          } else if (pregunta.respuesta == 1 || pregunta.respuesta == 2 || pregunta.respuesta == 4) {
  
              JOptionPane.showMessageDialog(null,"Casi! La opción correcta es la 3 :c");
              perdio = true; 
              rcorrecta4 = false;
  
          } 

          }catch (NumberFormatException e) {

          JOptionPane.showMessageDialog(null,"Por favor, ingresa una opción valida");
  
          }    
        
        }

        //Quinta Categoria(Final)
        while(rcorrecta5 == true) {

          try { 

          pregunta.preguntasDios();
  
          if(pregunta.respuesta == 1) {
            
              puntos.sumaPuntosDios();
              rcorrecta5 = false; 
  
          } else if (pregunta.respuesta == 0) {
                
              JOptionPane.showMessageDialog(null, "Has elegido salir!");
              rcorrecta5=false;
  
          } else if (pregunta.respuesta < 0 || pregunta.respuesta > 4) {
  
                JOptionPane.showMessageDialog(null,"Por favor seleciona un opción valida");
            
          } else if (pregunta.respuesta == 2 || pregunta.respuesta == 3 || pregunta.respuesta == 4) {
  
              JOptionPane.showMessageDialog(null,"Casi! La opción correcta es la 1 :c");
              perdio = true; 
              rcorrecta5 = false;
  
          } 

          } catch (NumberFormatException e) {

          JOptionPane.showMessageDialog(null,"Por favor, ingresa una opción valida");
  
        }   
        
        }
        
        if(perdio == true){

            puntos.perdioPartida();
            
         } else {
        
         puntos.terminoPartida(); //Sin maxima puntación
         puntos.terminoPartidaDios(); //Maxima puntación (15)
        
        }
        
      }
        
      // Salida sin participar
      else if(cm.inicio == 0) {

        cm.Salida();
        
    }
       
    }
    
}
