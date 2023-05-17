package com.shop.api.shopapi.controllers

import domain.Product
import org.springframework.web.bind.annotation.*

@RestController
class ProductController {

    private val products = mutableListOf<Product>()
    //private: Es un modificador de acceso que indica que la propiedad solo es accesible dentro de la clase DataLoader y no desde fuera de ella.
    //mutableListOf<Product>(): Es la inicialización de la propiedad como una lista mutable vacía. mutableListOf es una función que crea una lista mutable, y <Product> especifica que la lista contendrá objetos de tipo Product.

    @GetMapping("/products")
    fun getProducts(@RequestParam(required = false) discount: Boolean?): List<Product> {
        return if (discount == true) {
            products.filter { it.has_discount }
        } else {
            products
        }
    }
//Para probar el endpoint GET /products?discount=true, puedes enviar una solicitud GET a http://localhost:8080/products?discount=true y recibirás solo los productos que tienen descuento como respuesta.
    @PostMapping("/products")
    fun createProduct(@RequestBody product: Product): Product {
        products.add(product)
        return product
    }

    @DeleteMapping("/products/{id}")
    fun deleteProduct(@PathVariable id: String) {
        val product = products.find { it.id == id }
        products.remove(product)
    }
}
