
package sistemaexamen.preguntas;

import java.util.Scanner;

public class Selec_Mul_Pregunta extends tiposPregunta{
    
    private String [] elecciones;
    private int respuestaCorrecta;
    
    public Selec_Mul_Pregunta(String textoPregunta,int puntaje,String [] elecciones,int respuestaCorrecta){
        super(textoPregunta,puntaje);
        this.elecciones=elecciones;
        this.respuestaCorrecta=respuestaCorrecta;
    }
    
    public boolean buscar() {
        Scanner scanner = new Scanner(System.in);
        //imprimir pregunta y elecciones
        System.out.println(getTextoPregunta()+"Utilizar minusculas");
        for (int i = 0; i < elecciones.length; i++) {
            System.out.println((char) ('a' + i) + ". " + elecciones[i]);
        }

        // Pedir respuesta
        System.out.print("Elige la respuesta: ");
        char eleccionUsuario = scanner.next().charAt(0);

        // Convertir la elección del usuario en un índice 
        int indiceEleccionUsuario = eleccionUsuario - 'a';

        if (indiceEleccionUsuario == respuestaCorrecta) {
            System.out.println("Respuesta correcta!");
            return true;
        } else {
            System.out.println("Respuesta incorrecta. La respuesta correcta es: " + (char) ('a' + respuestaCorrecta));
            return false;
        }
    }
    
}
