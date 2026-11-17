package segundo_tp_poo_turno_noche.concesionaria_autos_motos.test;

import java.util.List;

import segundo_tp_poo_turno_noche.concesionaria_autos_motos.modelo.Vehiculo;
import segundo_tp_poo_turno_noche.concesionaria_autos_motos.servicio.ConcesionariaServicio;

public class TestConcesionaria {

    public static void main(String[] args) {

        ConcesionariaServicio servicio = new ConcesionariaServicio();
        List<Vehiculo> vehiculos = servicio.cargarVehiculos();

        System.out.println();
        System.out.println();

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }

        System.out.println();
        System.out.println("=============================");
        System.out.println();

        System.out.println(servicio.obtenerResultadoPrecios(vehiculos));
        System.out.println(servicio.obtenerResultadoBusqueda(vehiculos, "Y"));

        System.out.println();
        System.out.println("=============================");
        System.out.println();
        System.out.println("Vehículos ordenados por precio de mayor a menor:");

        List<Vehiculo> vehiculosOrdenados = servicio.ordenarPorPrecioDescendente(vehiculos);

        for (Vehiculo vehiculo : vehiculosOrdenados) {
            System.out.println(vehiculo.obtenerDescripcionCorta());
        }

        System.out.println();
        System.out.println("=============================");
        System.out.println();
        System.out.println("Vehículos ordenados por orden natural (marca, modelo, precio):");

        List<Vehiculo> vehiculosOrdenNatural = servicio.ordenarPorOrdenNatural(vehiculos);

        for (Vehiculo vehiculo : vehiculosOrdenNatural) {
            System.out.println(vehiculo);
        }

        // System.out.println(servicio.obtenerFichaVehiculo(vehiculos.get(0)));
    }

}