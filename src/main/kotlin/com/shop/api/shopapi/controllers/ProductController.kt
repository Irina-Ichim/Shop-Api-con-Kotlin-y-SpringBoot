package com.shop.api.shopapi.controllers


import com.shop.api.shopapi.domain.Product
import org.springframework.web.bind.annotation.*
import com.shop.api.shopapi.repositories.ProductRepository
import org.springframework.http.HttpStatus


@RestController
class ProductController(private val productRepository: ProductRepository) {

        @GetMapping("/products")
        fun allProducts(): List<Product> {
                return productRepository.findAll()
        }

        @PostMapping("/products")
        fun addProduct(@RequestBody products: Product): Product? {
                return productRepository.save(products)
        }
}
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "product not found")
class ProductNotFoundException : RuntimeException()





//Para probar el endpoint GET /products?discount=true, puedes enviar una solicitud GET a http://localhost:8080/products?discount=true y recibirás solo los productos que tienen descuento como respuesta.
 /*   @PostMapping("/products")
    fun createProduct(@RequestBody product: Product): Product {
        products.add(product)
        return product
    }*/

   /* @DeleteMapping("/products/{id}")
    fun deleteProduct(@PathVariable id: String) {
        val product = products.find { it.id == id }
        products.remove(product)
    }
}*/
