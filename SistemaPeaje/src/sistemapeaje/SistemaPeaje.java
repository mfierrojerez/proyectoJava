
package sistemapeaje;

import java.util.Scanner;

import sistemapeaje.peaje.Peaje;
import sistemapeaje.vehiculos.Carro;
import sistemapeaje.vehiculos.Camion;
import sistemapeaje.vehiculos.Moto;

//taller2 matias fierro

public class SistemaPeaje {

    public static void main(String[] args) {
        boolean encendido = true;
        int opcion;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Sistema de peajes");
        System.out.print("Ingrese el nombre del peaje: ");
        String nombrePeaje = scanner.nextLine();
        
        System.out.print("Ingrese el departamento: ");
        String departamento = scanner.nextLine();
        
        Peaje peaje = new Peaje(nombrePeaje, departamento);
        
        System.out.println("Ingrese los vehiculos");
        while(encendido){
            System.out.println("Indique el tipo de vehiculo\n [1] carro\n [2] moto\n [3] camion\n [4] Salir");
            opcion = Integer.parseInt(scanner.nextLine());
            if(opcion==1){
                System.out.print("Ingrese la placa del carro: ");
                String placaCarro = scanner.nextLine();
                peaje.agregarVehiculo(new Carro(placaCarro));
            }
            if(opcion==2){
                System.out.print("Ingrese la placa de la moto: ");
                String placaMoto = scanner.nextLine();
                peaje.agregarVehiculo(new Moto(placaMoto));
            }
            if(opcion==3){
                System.out.print("Ingrese la placa del camion: ");
                String placaCamion = scanner.nextLine();
                System.out.print("Ingrese el numero de ejes del camion: ");
                int ejesCamion = Integer.parseInt(scanner.nextLine());
                peaje.agregarVehiculo(new Camion(placaCamion, ejesCamion));
            }
            if(opcion==4){
                encendido=false;
            }
        }
        peaje.getPeaje();
        scanner.close();
    }
    
}
