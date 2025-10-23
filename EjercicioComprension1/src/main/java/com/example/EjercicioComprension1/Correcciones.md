Buen trabajo al intentar separar la lógica, Srta Pineda. El error que cometiste es el más común cuando se aprende la 
arquitectura de servicios.

**El Error Conceptual:** Tu clase CuentasService intenta modificar un atributo saldo usando this.saldo. 
En Java, this se refiere a la instancia actual de la clase. Tu CuentasService no tiene un atributo saldo; 
el atributo saldo pertenece a la clase Cuentas.

Imagina que Cuentas es la caja fuerte (guarda el dinero) y 
CuentasService es el cajero del banco (ejecuta la acción). 
El cajero no tiene el dinero en su bolsillo (this.saldo); él necesita que le des tu número de cuenta (Cuentas cuenta) 
para poder operar sobre esa cuenta.

**Puntos Clave a Recordar:**

**Nombres (Convenciones):** Las clases en Singular (si representan una entidad) y con Mayúscula (Cuenta). Los atributos 
en minúscula y "camelCase" (numeroCuenta, saldo).

**Modelos (Datos):** Los modelos (POJOs) como Cuenta solo deben tener atributos (estado) y sus getters/setters.

**Servicios (Lógica):** Los servicios como CuentasService contienen la lógica de negocio (comportamiento). No tienen 
estado propio; **IMPORTANTE:** operan sobre los objetos Modelo que reciben como parámetros.

this vs. objeto: **IMPORTANTE:** this.saldo significa "el saldo de esta clase de servicio" (incorrecto). cuenta.
setSaldo() significa "establece el saldo de ese objeto cuenta" (correcto).

Sigue así!!! Has entendido la parte más difícil, que es la intención de separar el código. Ahora solo falta ajustar la 
ejecución. :)