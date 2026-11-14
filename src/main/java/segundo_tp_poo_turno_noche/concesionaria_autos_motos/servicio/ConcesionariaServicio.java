package segundo_tp_poo_turno_noche.concesionaria_autos_motos.servicio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import segundo_tp_poo_turno_noche.concesionaria_autos_motos.modelo.Auto;
import segundo_tp_poo_turno_noche.concesionaria_autos_motos.modelo.Moto;
import segundo_tp_poo_turno_noche.concesionaria_autos_motos.modelo.Vehiculo;

public class ConcesionariaServicio {

    public List<Vehiculo> cargarVehiculos() {

        List<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Auto("Peugeot", "206", 200000, 4));
        vehiculos.add(new Moto("Honda", "Titan", 60000, 125));
        vehiculos.add(new Auto("Peugeot", "208", 250000, 5));
        vehiculos.add(new Moto("Yamaha", "YBR", 80500.50, 160));

        return vehiculos;
    }

    public Vehiculo obtenerVehiculoMasCaro(List<Vehiculo> vehiculos) {
        return vehiculos.stream()
                .max((vehiculo1, vehiculo2) -> Double.compare(vehiculo1.getPrecio(), vehiculo2.getPrecio()))
                .orElse(null);
    }

    public Vehiculo obtenerVehiculoMasBarato(List<Vehiculo> vehiculos) {
        return vehiculos.stream()
                .min((vehiculo1, vehiculo2) -> Double.compare(vehiculo1.getPrecio(), vehiculo2.getPrecio()))
                .orElse(null);
    }

    public Vehiculo buscarVehiculoPorLetra(List<Vehiculo> vehiculos, String letra) {
        return vehiculos.stream()
                .filter(vehiculo -> vehiculo.getModelo().contains(letra))
                .findFirst()
                .orElse(null);
    }

    public List<Vehiculo> ordenarPorPrecioDescendente(List<Vehiculo> vehiculos) {
        return vehiculos.stream()
                .sorted(Comparator.comparingDouble(Vehiculo::getPrecio).reversed())
                .toList();
    }

    public List<Vehiculo> ordenarPorOrdenNatural(List<Vehiculo> vehiculos) {
        return vehiculos.stream()
                .sorted()
                .toList();
    }
}