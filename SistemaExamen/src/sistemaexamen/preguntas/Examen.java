
package sistemaexamen.preguntas;

import java.util.Scanner;

import sistemaexamen.preguntas.tiposPregunta;
import sistemaexamen.preguntas.TFpregunta;
import sistemaexamen.preguntas.Resp_Cortas_Pregunta;
import sistemaexamen.preguntas.Selec_Mul_Pregunta;

public class Examen {
    private tiposPregunta [] preguntas = new tiposPregunta[10];
    private int contadorPreguntas;
    private int totalPuntaje;
    
    public void agregaPregunta(tiposPregunta pregunta) {
        if (contadorPreguntas < preguntas.length) {
            preguntas[contadorPreguntas] = pregunta;
            contadorPreguntas++;
        } else {
            System.out.println("El examen está lleno. No se pueden agregar más preguntas.");
        }
    }
    
    public void darExam() {
        if (contadorPreguntas == 0) {
            System.out.println("El examen esta vacio. Agrega preguntas primero.");
        }

        int respuestasCorrectas = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < contadorPreguntas; i++) {
            System.out.println("Pregunta " + (i + 1) + ":");
            if (preguntas[i].buscar()) {
                totalPuntaje=totalPuntaje + preguntas[i].getPuntaje() ;
                respuestasCorrectas++;
            }
        }

        float porcentaje = (float) respuestasCorrectas / contadorPreguntas * 100;
        System.out.println("Respuestas correctas: " + respuestasCorrectas + " de " + contadorPreguntas);
        System.out.println("Porcentaje de respuestas correctas: " + porcentaje + "%");
        System.out.println("Puntaje total: "+totalPuntaje);
    }
    
}
