Segundo Trabajo Práctico – Java POO

Concesionaria de Autos y Motos

Descripción del proyecto

Este proyecto fue desarrollado como parte del segundo trabajo práctico obligatorio del curso de Java, con el objetivo de aplicar los conceptos de Programación Orientada a Objetos (POO), colecciones, interfaces, herencia, polimorfismo y API Stream.

El sistema simula una concesionaria de autos y motos. Permite cargar vehículos, consultar sus características, realizar búsquedas y ordenarlos según diferentes criterios.

La aplicación muestra los resultados por consola, sin requerir el ingreso de datos por parte del usuario.

Tecnologías utilizadas

Java

Spring Boot

Maven

Lombok

Visual Studio Code

Git y GitHub

Conceptos de Java aplicados

Programación Orientada a Objetos

Clases y objetos.

Encapsulamiento.

Herencia.

Polimorfismo.

Clases abstractas.

Interfaces.

Sobrescritura de métodos mediante @Override.

Constructores y utilización de super().

Lombok

@Getter: generación automática de métodos de acceso.

@AllArgsConstructor: generación del constructor con todos los atributos.

Colecciones y ordenamiento

List y ArrayList.

Genéricos.

Comparable y compareTo().

Comparator.

Ordenamiento natural y personalizado.

API Stream

stream().

filter().

max() y min().

sorted().

findFirst().

collect(Collectors.toList()).

Expresiones lambda y referencias a métodos.

Estructura del proyecto

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

Descripción de las clases

Vehiculo (clase abstracta)

Contiene los atributos comunes a todos los vehículos: marca, modelo y precio.

Implementa Comparable<Vehiculo> para establecer el orden natural de los vehículos, comparando primero la marca, después el modelo y finalmente el precio.

También implementa la interfaz InformacionVehiculo, proporcionando los métodos comunes para obtener una descripción corta y el precio formateado.

Utiliza las anotaciones @Getter y @AllArgsConstructor de Lombok.

Auto

Hereda de Vehiculo e incorpora el atributo cantidadPuertas.

Utiliza @Getter, un constructor que invoca super() y un método toString() personalizado para mostrar sus características.

Implementa obtenerTipoVehiculo(), devolviendo "Auto".

Moto

Hereda de Vehiculo e incorpora el atributo cilindrada.

Utiliza @Getter, un constructor que invoca super() y un método toString() personalizado.

Implementa obtenerTipoVehiculo(), devolviendo "Moto".

InformacionVehiculo (interfaz)

Establece un contrato común para consultar información de los vehículos mediante tres métodos:

obtenerDescripcionCorta(): devuelve la marca y el modelo.

obtenerPrecioFormateado(): devuelve el precio con separadores de miles y decimales.

obtenerTipoVehiculo(): identifica si el vehículo es un auto o una moto.

La interfaz permite utilizar polimorfismo, trabajando con diferentes tipos de vehículos a través de un contrato común.

ConcesionariaServicio

Contiene la lógica principal del programa.

Sus responsabilidades incluyen:

Cargar los vehículos.

Obtener el vehículo más caro y el más barato.

Buscar vehículos por una letra del modelo.

Ordenar por precio descendente.

Ordenar por orden natural.

Validar los resultados de las búsquedas.

Obtener una ficha informativa utilizando la interfaz InformacionVehiculo.

Utiliza colecciones, expresiones lambda, referencias a métodos y operaciones de la API Stream.

TestConcesionaria

Contiene el método main(), encargado de ejecutar las operaciones del servicio y mostrar los resultados por consola.

Las validaciones de las búsquedas se encuentran en ConcesionariaServicio, manteniendo separada la lógica del programa.

Funcionalidades implementadas

Carga de autos y motos mediante un único método.

Visualización de los vehículos con sus características y precios.

Identificación del vehículo más caro.

Identificación del vehículo más barato.

Búsqueda por una letra contenida en el modelo.

Ordenamiento por precio de mayor a menor.

Ordenamiento natural por marca, modelo y precio.

Formateo de precios con separadores de miles y decimales.

Implementación de una interfaz para consultar información común de los vehículos.

Criterios de ordenamiento

Orden natural

Se implementa mediante Comparable<Vehiculo> y el método compareTo() de la clase Vehiculo.

Los criterios se aplican en el siguiente orden:

Marca.

Modelo.

Precio.

Ordenamiento por precio descendente

Se utiliza Comparator.comparingDouble(Vehiculo::getPrecio).reversed() para ordenar los vehículos desde el precio más alto hasta el más bajo.

Este criterio es independiente del orden natural definido en compareTo().

Salida de consola

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

La ejecución incluye dos líneas en blanco iniciales, según el formato solicitado.

Ejecución del proyecto

Clonar el repositorio:

git clone https://github.com/julianruffo/segundo_tp_poo_turno_noche.git

Abrir el proyecto en Visual Studio Code.

Verificar que Java y las dependencias de Maven estén correctamente configurados.

Ejecutar TestConcesionaria.java mediante su método main().

Visualizar los resultados en la consola.

Autor

Julián Ruffo

Segundo Trabajo Práctico Obligatorio – Java POO

Repositorio: https://github.com/julianruffo/segundo_tp_poo_turno_noche
