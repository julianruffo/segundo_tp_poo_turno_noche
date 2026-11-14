package segundo_tp_poo_turno_noche.concesionaria_autos_motos.modelo;

import java.util.Locale;

import lombok.Getter;
import segundo_tp_poo_turno_noche.concesionaria_autos_motos.interfaces.InformacionVehiculo;

@Getter
public abstract class Vehiculo implements Comparable<Vehiculo>, InformacionVehiculo {

    private String marca;
    private String modelo;
    private double precio;

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    @Override
    public String obtenerDescripcionCorta() {
        return marca + " " + modelo;
    }

    protected String getPrecioFormateado() {
        String precioTexto = String.format(Locale.US, "%,.2f", precio);

        return "$" + precioTexto.replace(",", "X")
                .replace(".", ",")
                .replace("X", ".");
    }

    @Override
    public int compareTo(Vehiculo otroVehiculo) {
        int resultado = this.marca.compareTo(otroVehiculo.marca);

        if (resultado == 0) {
            resultado = this.modelo.compareTo(otroVehiculo.modelo);
        }

        if (resultado == 0) {
            resultado = Double.compare(this.precio, otroVehiculo.precio);
        }

        return resultado;
    }
}