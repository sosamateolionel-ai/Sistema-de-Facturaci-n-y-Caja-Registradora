# Sistema de Facturación y Caja Registradora

## Descripción

Este proyecto consiste en un sistema de facturación que permite registrar productos o servicios en una factura, calcular el importe total de una venta e imprimir un ticket fiscal con los detalles de la operación.

El sistema utiliza cuatro clases principales: `ItemFactura`, `Factura`, `ImpresoraFiscal` y `CajaRegistradora`. Cada clase tiene una responsabilidad específica para organizar el funcionamiento del programa.

## Funcionamiento

1. Se crea una impresora fiscal y se la asigna a la caja registradora.
2. Se genera la factura número 1001 a nombre de Lucía Fernández.
3. Se agregan tres ítems a la factura con sus respectivas cantidades y precios unitarios.
4. La caja registradora comprueba que la factura contenga ítems.
5. Si la factura tiene productos, la caja solicita a la impresora fiscal que genere el ticket.
6. La impresora muestra los datos de la factura, el detalle de cada ítem, los subtotales y el importe total.

## Clase `ItemFactura`

Representa un producto o servicio incluido en una factura.

### Atributos

* `descripcion`: nombre o descripción del producto.
* `cantidad`: unidades vendidas.
* `precioUnitario`: precio de cada unidad.

### Métodos principales

* `getDescripcion()`: devuelve la descripción del producto.
* `getCantidad()`: devuelve la cantidad vendida.
* `getPrecioUnitario()`: devuelve el precio unitario.
* `getSubtotal()`: calcula el subtotal multiplicando la cantidad por el precio unitario.

## Clase `Factura`

Representa una factura que contiene los datos del cliente y una lista de ítems.

### Atributos

* `numero`: número identificador de la factura.
* `cliente`: nombre del cliente.
* `items`: lista de objetos `ItemFactura`.

### Métodos principales

* `getNumero()`: devuelve el número de factura.
* `getCliente()`: devuelve el nombre del cliente.
* `getItems()`: devuelve la lista de ítems.
* `agregarItem(ItemFactura item)`: agrega un producto o servicio a la factura.
* `calcularTotal()`: recorre todos los ítems y suma sus subtotales para obtener el importe total.

## Clase `ImpresoraFiscal`

Se encarga de imprimir el ticket fiscal con los datos de la factura.

### Métodos principales

* `imprimirDocumento(Factura factura)`: recibe una factura y muestra su información en la consola.
* Imprime el número de factura y el nombre del cliente.
* Muestra una tabla con la descripción, cantidad, precio unitario y subtotal de cada ítem.
* Presenta el total de la venta al final del documento.

Para organizar las columnas utiliza `printf()`, que permite alinear los datos y mostrar los importes con dos decimales.

## Clase `CajaRegistradora`

Representa la caja encargada de cerrar las ventas.

### Atributos

* `impresora`: referencia a un objeto `ImpresoraFiscal`.

### Métodos principales

* `cerrarVenta(Factura factura)`: verifica que la factura tenga al menos un ítem.
* Si la factura está vacía, muestra un mensaje y cancela el cierre de la venta.
* Si contiene ítems, informa que se está cerrando la venta y solicita a la impresora que genere el ticket fiscal.

## Ejemplo de funcionamiento

La factura número 1001 corresponde al cliente Lucía Fernández y contiene los siguientes productos:

| Producto           | Cantidad | Precio unitario |       Subtotal |
| ------------------ | -------: | --------------: | -------------: |
| Milanesa con papas |        2 |       $4.500,00 |      $9.000,00 |
| Ensalada César     |        1 |       $2.800,00 |      $2.800,00 |
| Gaseosa 500ml      |        3 |       $1.200,00 |      $3.600,00 |
| **Total**          |          |                 | **$15.400,00** |

Al ejecutar el programa, la caja registradora cierra la venta y la impresora fiscal muestra el ticket con todos los importes calculados.

## Conceptos de programación utilizados

* **Programación orientada a objetos (POO):** organización del sistema mediante clases y objetos.
* **Encapsulamiento:** atributos privados y métodos públicos para acceder a la información.
* **Asociación entre clases:** `CajaRegistradora` mantiene una referencia a `ImpresoraFiscal`.
* **Composición de datos:** `Factura` administra una lista de objetos `ItemFactura`.
* **Colecciones:** uso de `ArrayList` y `List` para almacenar los ítems.
* **Bucles `for-each`:** recorrido de los ítems para calcular el total e imprimir el detalle.
* **Condicionales:** validación de facturas vacías antes de cerrar una venta.
* **Separación de responsabilidades:** cada clase cumple una función específica.
* **Métodos de cálculo:** cada ítem calcula su subtotal y la factura calcula el total general.
* **Formato de salida:** uso de `printf()` para presentar importes y columnas ordenadas.

## Tecnologías utilizadas

* Lenguaje: Java.
* Entorno de desarrollo recomendado: IntelliJ IDEA.

## Ejecución

<img width="487" height="393" alt="image" src="https://github.com/user-attachments/assets/2f9735cf-3637-4789-ae41-334e86b30a6f" />

