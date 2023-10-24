
package sistemaexamen;
//jsdnfjksnbdkgjsnkdgndskfn gvkdskgnksgksnkjdgbsk gvks
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
        
        examen.agregaPregunta(new Selec_Mul_Pregunta("Cual es la capital de Francia?",2, new String[]{"Paris", "Madrid", "Londres", "Berlin"} , 0));
        examen.agregaPregunta(new TFpregunta("La Tierra gira alrededor del Sol.",1, true));
        examen.agregaPregunta(new Resp_Cortas_Pregunta("Escribe rojo:",1, "rojo"));
        examen.agregaPregunta(new TFpregunta("La tierra es plana",1,true));
        examen.agregaPregunta(new Selec_Mul_Pregunta("Cual se estas opciones no es un mamifero?",1,new String[]{"chimpance", "delfin", "humanos", "iguana"},3));
        examen.agregaPregunta(new Resp_Cortas_Pregunta("Cuanto es 2+2:",1,"4"));
        examen.agregaPregunta(new TFpregunta("El principio de herencia permite que una clase herede propiedades y comportamientos de otra clase.",1,true));
        examen.agregaPregunta(new Selec_Mul_Pregunta("Cual de los siguientes lenguajes de programacion es el mas utilizados para el desarrollo de aplicaciones moviles?",1,new String[]{"JAVA", "HTML", "Python", "Ruby"},0));
        examen.agregaPregunta(new Resp_Cortas_Pregunta("lenguaje en que se programo este examen:",1,"java"));
        examen.agregaPregunta(new TFpregunta("Chile es el mejor pais de Chile.",1,true));

        // Realizar el examen
        examen.darExam();
    
        
    }
    
}
