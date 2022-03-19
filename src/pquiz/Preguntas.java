package pquiz;

    import javax.swing.JOptionPane;

    //Indice de preguntas

public class Preguntas {
    
    int respuesta;

    public void preguntasFaciles() {//Respuesta op1.

        String faciles[] = {"¿Cómo se llama el estadio del FC Barcelona? \n1) Camp Nou \n2) Santiago Bernabeu \n3) La Masia \n4) Barcelona Camp \n0)Salir"
        ,"¿Quién es el máximo goleador de la selección argentina de fútbol? \n1) Batistuta \n2) Maradona \n3) Kempes \n4) Caniggia \n0)Salir"
        ,"¿Cuánto dura un partido de balonmano? \n1) 60 Minutos \n2) 30 Minutos \n3) 45 Minutos \n4) 90 Minutos \n0)Salir"
        ,"¿Dónde apoyan los jinetes sus pies? \n1) Estribos \n2) Riendas \n3) Montura \n4) Baste \n0)Salir"
        ,"¿Cuántos cuadros tiene un tablero de ajedrez? \n1) 64 \n2) 36 \n3) 54 \n4) 81 \n0)Salir"};
        
        int azar = (int) (Math.random()*5);
        
        respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ronda 1 - Facil: Deportes \n" + faciles[azar]));
    
        }

     public void preguntasIntermedio() {//Respuesta op3

        String inter[] = {"¿En que año se estreno la primera pelicula de Batman? \n1) 1998  \n2) 1950 \n3) 1989 \n4) 2005 \n0)Salir"
        ,"¿Cuál es la película más taquilllera de la historia? \n1) Avatar \n2) Titanic \n3) Avengers: Endgame \n4) Spiderman 2 \n0)Salir"
        ,"¿Quién dirigió la película Origen en el 2010? \n1) Quentin Tarantino \n2) George Lucas \n3) Christopher Nolan \n4) Tim Burton \n0)Salir"
        ,"¿Cuántas películas conforman la saga cinematográfica Harry Potter? \n1) 10 \n2) 5 \n3) 8 \n4) 7 \n0)Salir"
        ,"¿Quién dirigió la trilogía original de la saga Star Wars? \n1) Tim Burton \n2) Zack Snyder \n3) George Lucas \n4) Quentin Tarantino \n0)Salir"};
        
        int azar = (int) (Math.random()*5);

        respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ronda 2 - Intermedia: Peliculas\n" + inter[azar]));
    
        }

    public void preguntasDificil() {//Respuesta op4

        String dif[] = {"¿A qué reino ha pertenecido históricamente Cataluña? \n1) Castilla \n2) Navarra \n3) Francia \n4) Aragón \n0)Salir"
        ,"¿En qué país nació el rey Juan Carlos I? \n1) Austria \n2) España \n3) Francia \n4) Italia \n0)Salir"
        ,"¿Cómo se llamaba el hermano de Napoleón Bonaparte? \n1) José Bonaparte \n2) Pierre Bonaparte \n3) Pita Bonaparte \n4) José Bonaparte \n0)Salir"
        ,"¿Cuál era el nombre de pila de Lenin? \n1) Aleksandr \n2) Aléksey \n3) Iósif \n4) Vladímir \n0)Salir"
        ,"¿Cómo era la relación de Juana I La Loca con su marido, Felipe I? \n1) Ninguna Es Correcta \n2) Estuvieron Siempre Enamorados \n3) Juana Detestaba A Su Marido \n4) Juana Sentía Unos Celos Patológicos \n0)Salir"};
        
        int azar = (int) (Math.random()*5);

        respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ronda 3 - Categoria Dificil: Historia\n" + dif[azar]));
    
        }

    public void preguntasExperto() { //Respuesta op3

        String exp[] = {"¿Cómo se llama el nivel más alto de la marea? \n1) Bajamar \n2) Repunte \n3) Pleamar \n4) Estacionario \n0)Salir"
        ,"¿Cómo se mide la fuerza del viento en el mar? \n1) Pies \n2) Zancadas \n3) Nudos \n4) Kilómetros Por Hora \n0)Salir"
        ,"¿Cuál es la ciencia que estudia la aplicación de la informática y las comunicaciones al hogar? \n1) Robótica \n2) Casática \n3) Domótica \n4) Autología \n0)Salir"
        ,"¿Cuál es la fórmula química del agua? \n1) Agu \n2) HO2 \n3) H2O \n4) HO2 \n0)Salir"
        ,"Ciencia y técnologi \n1) No es un elemento, es un compuesto \n2) B \n3) Br \n4) BH \n0)Salir"};
        
        int azar = (int) (Math.random()*5);

        respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ronda 4 - Experto: Ciencia y técnologia\n" + exp[azar]));
    
        }
    
    public void preguntasDios() { //Respuesta op1

        String dios[] = {"¿En qué país nació Antonio Vivaldi? \n1) Italia \n2) España \n3) Holanda \n4) Alemania \n0)Salir"
        ,"¿Qué cantante es considerado “El Rey del Rock and Roll”? \n1) Elvis Presley \n2) Michael Jackson \n3) Bruno Mars \n4) Elton John \n0)Salir"
        ,"¿Qué cantante es reconocido por éxitos como Thriller, Beat It y Smooth Criminal? \n1) Michael Jackson \n2) Elvis Presley \n3) Bruno Mars \n4) Elton John \n0)Salir"
        ,"¿De qué nacionalidad era Beethoven? \n1) Alemana \n2) Inglesa \n3) Italiana \n4) Rusa \n0)Salir"
        ,"¿Quién canta \" Never gonna give you up\"? \n1) Rick Astley \n2) Steven Tyler \n3) Phil Collins \n4) David Bowie \n0)Salir"};
        
        int azar = (int) (Math.random()*5);

        respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ronda 5 - DIOS: " + dios[azar]));
    
        }

     }
