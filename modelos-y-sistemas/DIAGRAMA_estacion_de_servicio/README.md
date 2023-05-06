
# **ACTIVIDAD**

## **Modelar usando casos de uso el siguiente sistema:**

- SISTEMA: estacion de servicio.

- ACTORES: cliente, proveedor y banco.

### **U.C**

- El **Cliente** puede cargar combustible, poner aceite, verificar presion y pagar.
- Los pagos son en efectivo, tarjeta (debito,credito).
- En todos los caso de debe emitir factura.
- Los clientes asociados tienen beneficios por puntaje acumulado.
- El **proveedor** puede cargar deposito.
- El **banco** verifica la tarjeta.

## ¿Que es un Diagrama de Casos de Uso?

- El Diagrama de Casos de Uso **tiene como objetivo describir las acciones del sistema desde el punto de vista del usuario**.

- **Representa las formas que tiene un usuario de utilizar un sistema**, y se puede utilizar como un “contrato” entre cliente y proveedor de software para determinar la funcionalidad del sistema, es decir los requisitos funcionales.

- **Esta compuesto por actores** (agentes externos al sistemas, pueden ser usuarios u otros sistemas), casos de uso y distintos tipos de relaciones. 

- Es posible construir diagramas con diferentes niveles de detalle

## A continuación se describen las tres principales relaciones entre los casos de uso en UML:

- **Generalización (generalization):**
La relación de generalización es una forma de describir una **relación de herencia** entre dos casos de uso.

Un caso de uso generalizado (padre) puede contener funcionalidades comunes que se comparten con otros casos de uso más específicos (hijos).

Los casos de uso hijos pueden agregar nuevas funcionalidades o redefinir las ya existentes en el padre. 

Por ejemplo, el caso de uso "Gestionar cuentas" podría ser un caso de uso generalizado, mientras que "Gestionar cuentas de ahorro" y "Gestionar cuentas corrientes" serían casos de uso especializados que heredan las funcionalidades del caso de uso generalizado.

- **Inclusión (include):**
Se utiliza para representar la **relación entre dos casos de uso**, en la que **un caso de uso incluye a otro caso de uso**.

En otras palabras, cuando un caso de uso incluye a otro, significa que **el primer caso de uso requiere la funcionalidad del segundo** caso de uso para completar su propia funcionalidad.

Por ejemplo, el caso de uso "Realizar pago" podría incluir el caso de uso "Verificar disponibilidad de fondos" para garantizar que el pago se realice sólo si hay suficiente saldo disponible en la cuenta.

- **Extensión (extend):**
La relación de extensión **es una forma de agregar funcionalidades opcionales a un caso de uso principal**.

Se utiliza cuando un caso de uso tiene una secuencia de acciones básicas que se pueden extender en algún momento para incluir funcionalidades adicionales.

Por ejemplo, el caso de uso "Crear cuenta" podría tener una extensión para solicitar información adicional del cliente, como su dirección o su número de teléfono. 

La extensión se puede invocar sólo si se cumplen ciertas condiciones especificadas en el caso de uso principal, por ejemplo, si el cliente desea proporcionar información adicional.
