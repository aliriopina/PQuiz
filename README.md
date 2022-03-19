# PQuiz
 Saludos a quien corresponda,

 - Persistencia de datos de partida:

 El presente Quiz fue realizado en NetBeans IDE 8.2, para su ejecución es importante asegurarse que los 4 archivos POI esten presentes en la carpeta "dist\lib\" de esta manera no exista error en la creación del archivo .xls.
 
 Tomando en cuenta esto al momento de finalizar el programa (Siempre y cuando se participe) se creara el excel con los puntos y el nombre digitado, por defecto la ruta de creación del archivo será el Directorio del usuario (user.home), es posible visualizar esto en las lineas 71, 125 y 176 de la clase "Puntaje" de esta manera se expresan los diferentes finales del programa.

 - Ejecución del Quiz:

 La clase main es PQuiz.

 En la primera pantalla se encuentra la bienvenida e instrucciones para participar en el programa o bien si desea salir del mismo. Se debe tener presente que cualquier otra acción que no se encuentre en las opciones mostradas no permitira continuar o finalizar el programa (Esto para toda la ejecución del programa).

 Luego se continua con las preguntas (generadas de manera aleatorias del indice en la clase "Preguntas") empezando con la primera ronda, el quiz va de manera progresiva en las dificutades:

 Facil: la respuesta es la opción 1 (recibe 1 punto).

 Intermedia: la respuesta es la opción 3 (recibe 2 puntos).

 Dificil: la respuesta es la opcón 4 (recibe 3 puntos).

 Experto: la respuesta es la opción 3 (recibe 4 puntos).

 DIOS: la respuesta es la opción 1 (recibe 5 puntos).

 De esta manera si el usuario desea salir en cualquier momento puede digitar la opción 0 de esta manera conserva sus puntos (la mayor puntuación es 15), si el usuario llega a fallar en alguna respuesta su puntaje final sería 0, independiente de la ronda en la que se encontraba el usuario.



 

