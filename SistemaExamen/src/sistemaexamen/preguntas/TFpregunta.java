
package sistemaexamen.preguntas;

import java.util.Scanner;

public class TFpregunta extends tiposPregunta{
    
    private boolean respuestaCorrecta;
    
    public TFpregunta(String textoPregunta,int puntaje, boolean respuestaCorrecta){
        super(textoPregunta,puntaje);
        this.respuestaCorrecta=respuestaCorrecta;
    }
    
    public boolean buscar(){
        Scanner scanner = new Scanner(System.in);
        int intentos = 3;
        while (intentos>0) {
            try{
                System.out.print(getTextoPregunta() + " (T/F): ");
                String respuestaUsuario = scanner.nextLine().toLowerCase();

                if (respuestaUsuario.equals("t")) {
                    if (respuestaCorrecta==true) {
                        System.out.println("Respuesta correcta!");
                        return true;
                    }
                    System.out.println("Respuesta incorrecta"+"\n Respuesta correcta: "+respuestaCorrecta);
                    return false;
                
                } else if (respuestaUsuario.equals("f")) {
                    if (respuestaCorrecta==false) {
                        System.out.println("Respuesta correcta!");
                        return true;
                    } 
                    System.out.println("Respuesta incorrecta"+"\n Respuesta correcta: "+respuestaCorrecta);
                    return false;
                }
                
                throw new IllegalArgumentException("Respuesta no valida. Por favor, responda 'T' o 'F'");
            
            }catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                intentos--;
                System.out.println("Intentos restantes: " + intentos);
            }                                                                           
        }
        System.out.println("Intentos superados, pregunta fallida");
        System.out.println("Respuesta correcta: "+respuestaCorrecta);
        return false;       
    }   
}
