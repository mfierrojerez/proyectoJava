
package sistemapeaje.vehiculos;

public class Carro extends Vehiculo{
    
    public Carro(String placa){
        super(placa);
    } 
    
    public int calcularPeaje(){
        return 10000;
    }
}
