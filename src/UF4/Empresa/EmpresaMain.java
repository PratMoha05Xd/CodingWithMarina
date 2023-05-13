package UF4.Empresa;

import com.oracle.deploy.update.UpdateCheck;

public class EmpresaMain {
        public static void main(String[] args) {
            // Creamos una sucursal
            Sucursal sucursal = new Sucursal("Sucursal A", "Calle 123", "555-1234", "sucursalA@example.com");

            // Creamos algunos productos
            TipusProducte producto1 = new TipusProducte("Producto 1", 1, 10.0, 100, true);
            TipusProducte producto2 = new TipusProducte("Producto 2", 2, 20.0, 50, true);
            TipusProducte producto3 = new TipusProducte("Producto 3", 3, 5.0, 200, true);

            // Creamos un cliente
            Client cliente = new Client("Juan", "Calle 456", "555-5678", "juan@example.com");

            // Creamos un encargo para el cliente
            Encarrec encargo1 = new Encarrec(1, 4, 10, 30);

            // Creamos una petición para el encargo
            Peticio peticion1 = new Peticio(2);

            // Asignamos el producto 1 a la petición
            peticion1.asignarProducto(producto1);

            // Añadimos la petición al encargo
            encargo1.anadirProducto(peticion1);

            // Añadimos el encargo al cliente
            cliente.anadirEncargo(encargo1);

            // Creamos un transportista
            Transportista transportista = new Transportista("Pedro", "555-9876", "12345");

            // Asignamos el encargo al transportista
            transportista.asignarEncargo(encargo1);

            // El transportista entrega el encargo
            UpdateCheck EstadoEntregado = null;
            encargo1.actualizarEstado(EstadoEntregado.getInstance());

            // El cliente anula el encargo
            cliente.anularEncargo(encargo1);
        }
    }
