package segundo_tp_poo_turno_noche.concesionaria_autos_motos.modelo;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import lombok.AllArgsConstructor;
import lombok.Getter;
import segundo_tp_poo_turno_noche.concesionaria_autos_motos.interfaces.InformacionVehiculo;

@Getter
@AllArgsConstructor
public abstract class Vehiculo implements Comparable<Vehiculo>, InformacionVehiculo {

    private String marca;
    private String modelo;
    private double precio;

    @Override
    public String obtenerDescripcionCorta() {
        return marca + " " + modelo;
    }

    @Override
    public String obtenerPrecioFormateado() {
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
        simbolos.setDecimalSeparator(',');
        simbolos.setGroupingSeparator('.');

        DecimalFormat formato = new DecimalFormat("#,##0.00", simbolos);

        return "$" + formato.format(precio);
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
