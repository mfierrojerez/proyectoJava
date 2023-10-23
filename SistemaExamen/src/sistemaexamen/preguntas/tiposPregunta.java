
package sistemaexamen.preguntas;


public abstract class tiposPregunta {
    
    protected String textoPregunta;
    protected int puntaje;
    
    public tiposPregunta(String textoPregunta,int puntaje){
        this.textoPregunta=textoPregunta;
        this.puntaje=puntaje;    
    }
    
    public String getTextoPregunta() {
        return textoPregunta;
    }
    
    public int getPuntaje(){
        return puntaje;
    }
    
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
    public abstract boolean buscar();// indica si se respondio la pregunta de forma correcta
    
}
