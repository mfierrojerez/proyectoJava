
package sistemaexamen;

import sistemaexamen.preguntas.Examen;
import sistemaexamen.preguntas.tiposPregunta;
import sistemaexamen.preguntas.TFpregunta;
import sistemaexamen.preguntas.Resp_Cortas_Pregunta;
import sistemaexamen.preguntas.Selec_Mul_Pregunta;

import java.util.Scanner;

public class SistemaExamen {

    public static void main(String[] args) {
        
        Examen examen = new Examen();

        // Agregar preguntas al examen
        
        examen.agregaPregunta(new Selec_Mul_Pregunta("¿Cual es la capital de Francia?",2, new String[]{"Paris", "Madrid", "Londres", "Berlin"} , 0));
        examen.agregaPregunta(new TFpregunta("La Tierra gira alrededor del Sol.",1, true));
        examen.agregaPregunta(new Resp_Cortas_Pregunta("Escribe rojo:",1, "rojo"));

        // Realizar el examen
        examen.darExam();
    
        
    }
    
}
