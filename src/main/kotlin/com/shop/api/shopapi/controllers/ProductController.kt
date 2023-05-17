package com.shop.api.shopapi.controllers

import domain.Product
import org.springframework.web.bind.annotation.*

@RestController
class ProductController {

    private val products = mutableListOf<Product>()

    @GetMapping("/products")
    fun getProducts(@RequestParam(required = false) discount: Boolean?): List<Product> {
        return if (discount == true) {
            products.filter { it.has_discount }
        } else {
            products
        }
    }

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
