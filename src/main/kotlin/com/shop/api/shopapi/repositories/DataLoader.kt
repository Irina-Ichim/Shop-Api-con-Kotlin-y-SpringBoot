package com.shop.api.shopapi.repositories

import com.shop.api.shopapi.domain.Product
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component


@Component
class DataLoader(private val productRepository: ProductRepository) : CommandLineRunner {

    override fun run(vararg args: String?) {
        // Al marcar un método con la palabra clave override, estás indicando explícitamente que estás reemplazando la implementación del método de la clase padre. Esto asegura que el método de la clase hija se ejecutará en lugar del método de la clase padre cuando se llame al método en un objeto de la clase hija.
        val products = listOf(
            Product("Perfume Si", "Armani", true,90.99,1),
            Product("Perfume Mademoiselle", "Chanel",false, 115.99,2),
            Product("Perfume Guilty Mujer", "Gucci", true, 89.99,3),
            Product("Perfume Vip", "Carolina Herrera", false, 78.00,4),
            Product("Perfume La Nuit Tresor", "Lancóme",false, 150.20,5),
            Product("Perfume Black Orchid", "Tom Ford", false, 119.99,6)
        )

        productRepository.saveAll(products)
    }
}


