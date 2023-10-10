/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectojava;

/**
 *
 * @author erick
 */

public class ejemplo {
    String nombre;
    String rut;
    String carrera;
    int anho;
    int nivel;
    boolean trabaja;
    String Hobie;
    double promacu;
    String cuidad;
    
    ejemplo(String nombre,String rut,String carrera,int anho,int nivel, boolean trabaja,String hobie,double prom,String Cuidad)
    {
    this.nombre=nombre;
    this.rut = rut;
    this.carrera = carrera;
    this.anho = anho;
    this.nivel = nivel;
    this.trabaja = trabaja;
    this.Hobie = hobie;
    this.promacu = prom;
    this.cuidad = Cuidad;
    
    }
    private int Math_semes(int duracion, int nivel){return duracion-nivel;}
    
    void imprimir(){
        System.out.println("Nombre = "+nombre);
        System.out.println("rut = "+rut);
        System.out.println("carrera = "+carrera);
        System.out.println("año de ingreso "+anho);
        System.out.println("nivel carreara "+nivel);
        System.out.println("hobie "+Hobie);
        System.out.println("promedio "+promacu);
        System.out.println("cuidad "+cuidad);
        System.out.println("falta por probar "+ Math_semes(10,nivel)+"niveles");
        
    }
    
    public static void main(String args[]){
    ejemplo e1= new ejemplo("alan brito","123456789-8"+"","ing com",2020,4,false,"canto",4.2,"coquimbo");
    ejemplo e2= new ejemplo("aquiles traigo","2346788-9"+"","ing com",2019,5,false,"canto",4.5,"la serena");
    e1.imprimir();
    e2.imprimir();
    }
}