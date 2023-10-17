
package sistemapeaje.peaje;
import sistemapeaje.vehiculos.Vehiculo;

import java.util.List;
import java.util.ArrayList;

public class Peaje {
    private String nombre;
    private String departamento;
    private int totalRecolectado;
    private List<Vehiculo> vehiculos;
    
    public Peaje(String nombre, String departamento){
        this.nombre=nombre;
        this.departamento=departamento;
        this.totalRecolectado=0;
        this.vehiculos= new ArrayList<>();
    }
    
    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
        int peaje=vehiculo.calcularPeaje();
        totalRecolectado +=peaje;
    }
    
    public void getPeaje(){
        System.out.println("Estacion de peaje: "+nombre+", Departamento: "+departamento); 
        System.out.println("Valor total recolectado: "+totalRecolectado);
        System.out.println("Lista de vahiculos:");
        for(Vehiculo vehiculo : vehiculos){
            System.out.println("- Placa: " + vehiculo.getPlaca() + ", Peaje: " + vehiculo.calcularPeaje());
        }
    }
}
