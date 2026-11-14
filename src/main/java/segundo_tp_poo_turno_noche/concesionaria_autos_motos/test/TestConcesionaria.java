package segundo_tp_poo_turno_noche.concesionaria_autos_motos.test;

import java.util.List;
import java.util.Locale;

import segundo_tp_poo_turno_noche.concesionaria_autos_motos.modelo.Vehiculo;
import segundo_tp_poo_turno_noche.concesionaria_autos_motos.servicio.ConcesionariaServicio;

public class TestConcesionaria {

    public static void main(String[] args) {

        ConcesionariaServicio servicio = new ConcesionariaServicio();
        List<Vehiculo> vehiculos = servicio.cargarVehiculos();

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }

        System.out.println();
        System.out.println("=============================");
        System.out.println();

        Vehiculo vehiculoMasCaro = servicio.obtenerVehiculoMasCaro(vehiculos);
        Vehiculo vehiculoMasBarato = servicio.obtenerVehiculoMasBarato(vehiculos);

        if (vehiculoMasCaro != null && vehiculoMasBarato != null) {
            System.out.println("Vehículo más caro: "
                    + vehiculoMasCaro.obtenerDescripcionCorta());

            System.out.println("Vehículo más barato: "
                    + vehiculoMasBarato.obtenerDescripcionCorta());
        }

        Vehiculo vehiculoConLetra = servicio.buscarVehiculoPorLetra(vehiculos, "Y");

        if (vehiculoConLetra != null) {
            System.out.println("Vehículo que contiene en el modelo la letra 'Y': "
                    + vehiculoConLetra.obtenerDescripcionCorta() + " "
                    + String.format(Locale.US, "$%,.2f",
                            vehiculoConLetra.getPrecio())
                            .replace(",", "X")
                            .replace(".", ",")
                            .replace("X", "."));
        }

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
    }
}