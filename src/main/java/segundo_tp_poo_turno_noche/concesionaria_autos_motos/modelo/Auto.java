package segundo_tp_poo_turno_noche.concesionaria_autos_motos.modelo;

import lombok.Getter;

@Getter

public class Auto extends Vehiculo {

    private int cantidadPuertas;

    public Auto(String marca, String modelo, double precio, int cantidadPuertas) {
        super(marca, modelo, precio);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String toString() {
        return "Marca: " + getMarca()
                + " // Modelo: " + getModelo()
                + " // Puertas: " + cantidadPuertas
                + " // Precio: " + getPrecioFormateado();
    }

}
