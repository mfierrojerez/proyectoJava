
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
        int intentos =5;
        
        //imprimir pregunta y elecciones
        System.out.println(getTextoPregunta()+"Utilizar minusculas");
        for (int i = 0; i < elecciones.length; i++) {
            System.out.println((char) ('a' + i) + ". " + elecciones[i]);
        }
        
        while(intentos>0){
            try{
                System.out.print("Elige una alternativa: ");
                char eleccionUsuario = scanner.next().charAt(0);

                // Convertir la elección del usuario en un índice 
                int indiceEleccionUsuario = eleccionUsuario - 'a';
            
                if (indiceEleccionUsuario < 0 || indiceEleccionUsuario >= elecciones.length) {
                    throw new IllegalArgumentException("Indice de eleccion no valido");
                }
            
                if (indiceEleccionUsuario == respuestaCorrecta) {
                    System.out.println("Respuesta correcta!");
                    return true;
                } else {
                    System.out.println("Respuesta incorrecta. La respuesta correcta es: " + (char) ('a' + respuestaCorrecta));
                    return false;
                }
            }catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                intentos--;
                System.out.println("Intentos restantes: " + intentos);
            }
        }
        System.out.println("Intentos superados, pregunta fallida");
        return false;
        
    }
    
}
