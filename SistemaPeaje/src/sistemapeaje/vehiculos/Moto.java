
package sistemapeaje.vehiculos;

public class Moto extends Vehiculo {
    public Moto(String placa){
        super(placa);
    }
    
    public int calcularPeaje(){
        return 5000;
    }
}
