package course.javaspringboot.M01_classesObjects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RegistroTransacciones {

	public static void main(String[] args) {
        SpringApplication.run(RegistroTransacciones.class, args);

            // Creación de OBJETOS (instancias) de la clase Transaccion
            System.out.println("Creando y registrando transacciones...");

            Transaccion deposito = new Transaccion(500.0, TipoTransaccion.DEPOSITO, null, "ES8021000000000000123456");
            Transaccion retiro = new Transaccion(200.0, TipoTransaccion.RETIRO, "ES8021000000000000123456", null);
            Transaccion transferencia = new Transaccion(150.0, TipoTransaccion.TRANSFERENCIA_SALIENTE, "ES8021000000000000123456", "ES70...");

            deposito.mostrarDetalles();
            retiro.mostrarDetalles();
            transferencia.mostrarDetalles();

            System.out.println("Total de transacciones registradas: 3");

    }

}
