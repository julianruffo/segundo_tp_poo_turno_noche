package segundo_tp_poo_turno_noche.concesionaria_autos_motos.modelo;

import lombok.Getter;

@Getter
public class Moto extends Vehiculo {

    private int cilindrada;

    public Moto(String marca, String modelo, double precio, int cilindrada) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Marca: " + getMarca()
                + " // Modelo: " + getModelo()
                + " // Cilindrada: " + cilindrada + "c"
                + " // Precio: " + obtenerPrecioFormateado();
    }

    @Override
    public String obtenerTipoVehiculo() {
        return "Moto";
    }
}