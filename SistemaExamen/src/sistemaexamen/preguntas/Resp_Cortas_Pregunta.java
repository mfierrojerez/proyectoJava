
package sistemaexamen.preguntas;

import java.util.Scanner;

public class Resp_Cortas_Pregunta extends tiposPregunta{
    
    private String respuestaCorrecta;
    
    public Resp_Cortas_Pregunta(String textoPregunta,int puntaje,String respuestaCorrecta){
        super(textoPregunta,puntaje);
        this.respuestaCorrecta=respuestaCorrecta;
    }
    
    public boolean buscar() {
        Scanner scanner = new Scanner(System.in);       
        
        System.out.print(getTextoPregunta());
        String respuestaUsuario = scanner.nextLine();
            
        if (respuestaUsuario.equalsIgnoreCase(respuestaCorrecta)) {
            System.out.println("Respuesta correcta!");
            return true;
        }
       
        System.out.println("Respuesta correcta: "+respuestaCorrecta);
        return false;
        
    }
    
    
}
