package segundo_tp_poo_turno_noche.concesionaria_autos_motos.servicio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import segundo_tp_poo_turno_noche.concesionaria_autos_motos.interfaces.InformacionVehiculo;
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
                .max(Comparator.comparingDouble(Vehiculo::getPrecio))
                .orElse(null);
    }

    public Vehiculo obtenerVehiculoMasBarato(List<Vehiculo> vehiculos) {
        return vehiculos.stream()
                .min(Comparator.comparingDouble(Vehiculo::getPrecio))
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
                .collect(Collectors.toList());
    }

    public List<Vehiculo> ordenarPorOrdenNatural(List<Vehiculo> vehiculos) {
        return vehiculos.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public String obtenerResultadoPrecios(List<Vehiculo> vehiculos) {

        Vehiculo vehiculoMasCaro = obtenerVehiculoMasCaro(vehiculos);
        Vehiculo vehiculoMasBarato = obtenerVehiculoMasBarato(vehiculos);

        if (vehiculoMasCaro != null && vehiculoMasBarato != null) {
            return "Vehículo más caro: "
                    + vehiculoMasCaro.obtenerDescripcionCorta()
                    + "\nVehículo más barato: "
                    + vehiculoMasBarato.obtenerDescripcionCorta();
        }

        return "No hay vehículos disponibles.";
    }

    public String obtenerResultadoBusqueda(List<Vehiculo> vehiculos, String letra) {

        Vehiculo vehiculoConLetra = buscarVehiculoPorLetra(vehiculos, letra);

        if (vehiculoConLetra != null) {
            return "Vehículo que contiene en el modelo la letra '"
                    + letra + "': "
                    + vehiculoConLetra.obtenerDescripcionCorta() + " "
                    + vehiculoConLetra.obtenerPrecioFormateado();
        }

        return "No se encontró ningún vehículo con la letra '" + letra + "'.";
    }

    public String obtenerFichaVehiculo(InformacionVehiculo vehiculo) {
        return vehiculo.obtenerTipoVehiculo() + ": "
                + vehiculo.obtenerDescripcionCorta()
                + " - Precio: "
                + vehiculo.obtenerPrecioFormateado();
    }
}