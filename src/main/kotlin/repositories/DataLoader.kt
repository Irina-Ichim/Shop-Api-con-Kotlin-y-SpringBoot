package repositories

import domain.Product
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class DataLoader(private val productRepository: ProductRepository) : CommandLineRunner {

    override fun run(vararg args: String?) {
        // Al marcar un método con la palabra clave override, estás indicando explícitamente que estás reemplazando la implementación del método de la clase padre. Esto asegura que el método de la clase hija se ejecutará en lugar del método de la clase padre cuando se llame al método en un objeto de la clase hija.
        val products = listOf(
            Product("1", "Perfume Si", "Armani", true,90.99),
            Product("2", "Perfume Mademoiselle","Chanel", false, 115.99),
            Product("3", "Perfume Guilty Mujer","Gucci", true, 89.99),
            Product("4", "Perfume Vip","Carolina Herrera", false, 78.00),
            Product("5", "Perfume La Nuit Tresor","Lancóme" ,false, 150.20),
            Product("6", " Perfume Black Orchid", "Tom Ford",false, 119.99)
        )

        // Guardar los productos en la base de datos
        productRepository.saveAll(products)
    }
}

//implementando la interfaz CommandLineRunner, lo que significa que el método run() se ejecutará cuando la aplicación se inicie
