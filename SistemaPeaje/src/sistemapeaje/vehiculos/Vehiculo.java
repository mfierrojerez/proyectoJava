
package sistemapeaje.vehiculos;

public class Vehiculo {
    protected String placa;
    
    public Vehiculo(String placa){
        this.placa=placa;
    }
    
    public String getPlaca(){
        return placa;
    }
    
    public int calcularPeaje(){
        return 0;
    }
}
