# Segundo Trabajo Práctico – Java POO
## Concesionaria de Autos y Motos

### Descripción del proyecto

Este proyecto fue desarrollado como parte del segundo trabajo práctico obligatorio del curso de Java, con el objetivo de aplicar los conceptos de **Programación Orientada a Objetos (POO)**, el uso de colecciones y la API Stream.

El sistema simula una concesionaria de autos y motos, permitiendo cargar vehículos, consultar sus características, realizar búsquedas y ordenarlos según diferentes criterios.

La aplicación muestra los resultados por consola, sin requerir el ingreso de datos por parte del usuario.

### Tecnologías utilizadas

- Java
- Spring Boot
- Maven
- Lombok
- Visual Studio Code
- Git y GitHub

### Conceptos de Java aplicados

**Programación Orientada a Objetos**
- Clases y objetos.
- Encapsulamiento.
- Herencia.
- Polimorfismo.
- Clases abstractas.
- Interfaces.
- Sobrescritura de métodos (`@Override`).

**Colecciones y ordenamiento**
- `List` y `ArrayList`.
- Genéricos.
- `Comparable` y `compareTo()`.
- `Comparator`.
- Ordenamiento natural y personalizado.

**API Stream**
- `stream()`.
- `filter()`.
- `max()` y `min()`.
- `sorted()`.
- `findFirst()`.
- `toList()`.
- Expresiones lambda y referencias a métodos.

### Estructura del proyecto

```text
src/
├── main/
│   ├── java/
│   │   └── segundo_tp_poo_turno_noche/
│   │       └── concesionaria_autos_motos/
│   │           ├── interfaces/
│   │           │   └── InformacionVehiculo.java
│   │           ├── modelo/
│   │           │   ├── Vehiculo.java
│   │           │   ├── Auto.java
│   │           │   └── Moto.java
│   │           ├── servicio/
│   │           │   └── ConcesionariaServicio.java
│   │           ├── test/
│   │           │   └── TestConcesionaria.java
│   │           └── ConcesionariaAutosMotosApplication.java
│   └── resources/
│       └── application.properties
└── test/
    └── java/
        └── segundo_tp_poo_turno_noche/
            └── concesionaria_autos_motos/
                └── ConcesionariaAutosMotosApplicationTests.java
```

### Descripción de las clases

**Vehiculo (clase abstracta)**

Contiene los atributos comunes a todos los vehículos: marca, modelo y precio. Implementa `Comparable<Vehiculo>` para establecer el orden natural por marca, modelo y precio.

**Auto**

Hereda de `Vehiculo` e incorpora la cantidad de puertas. Sobrescribe `toString()` para mostrar sus características.

**Moto**

Hereda de `Vehiculo` e incorpora la cilindrada. Sobrescribe `toString()` para mostrar sus características.

**InformacionVehiculo (interfaz)**

Define el método `obtenerDescripcionCorta()`, utilizado para obtener la marca y el modelo de un vehículo.

**ConcesionariaServicio**

Contiene los métodos encargados de cargar, buscar y ordenar los vehículos utilizando colecciones y Stream API.

**TestConcesionaria**

Contiene el método `main()` desde el cual se ejecutan las operaciones y se muestran los resultados por consola.

### Funcionalidades implementadas

1. Carga de autos y motos mediante un único método.
2. Visualización de todos los vehículos con sus características y precios.
3. Búsqueda del vehículo más caro.
4. Búsqueda del vehículo más barato.
5. Búsqueda de vehículos por una letra contenida en el modelo.
6. Ordenamiento por precio de mayor a menor.
7. Ordenamiento natural por marca, modelo y precio.

### Salida de consola

```text
Marca: Peugeot // Modelo: 206 // Puertas: 4 // Precio: $200.000,00
Marca: Honda // Modelo: Titan // Cilindrada: 125c // Precio: $60.000,00
Marca: Peugeot // Modelo: 208 // Puertas: 5 // Precio: $250.000,00
Marca: Yamaha // Modelo: YBR // Cilindrada: 160c // Precio: $80.500,50

=============================

Vehículo más caro: Peugeot 208
Vehículo más barato: Honda Titan
Vehículo que contiene en el modelo la letra 'Y': Yamaha YBR $80.500,50

=============================

Vehículos ordenados por precio de mayor a menor:
Peugeot 208
Peugeot 206
Yamaha YBR
Honda Titan

=============================

Vehículos ordenados por orden natural (marca, modelo, precio):
Marca: Honda // Modelo: Titan // Cilindrada: 125c // Precio: $60.000,00
Marca: Peugeot // Modelo: 206 // Puertas: 4 // Precio: $200.000,00
Marca: Peugeot // Modelo: 208 // Puertas: 5 // Precio: $250.000,00
Marca: Yamaha // Modelo: YBR // Cilindrada: 160c // Precio: $80.500,50
```

### Ejecución del proyecto

1. Clonar el repositorio:

   `git clone https://github.com/julianruffo/segundo_tp_poo_turno_noche.git`

2. Abrir el proyecto en Visual Studio Code.
3. Verificar que Java y las dependencias de Maven estén correctamente configurados.
4. Ejecutar la clase `TestConcesionaria.java` mediante su método `main()`.
5. Visualizar los resultados en la consola.

### Autor

**Julián Ruffo**

Segundo Trabajo Práctico Obligatorio – Java POO

Repositorio: https://github.com/julianruffo/segundo_tp_poo_turno_noche
