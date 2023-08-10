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
        @DeleteMapping("/products/{id}")
        fun deleteProductById(@PathVariable id: Long): Product? {
                val product: Product = productRepository.findById(id.toInt()).orElseThrow { ProductNotFoundException() }
                productRepository.deleteById(id.toInt())
                return product
        }
        @GetMapping("/products/discounted")
        fun getDiscountedProducts(@RequestParam("discount") hasDiscount: Boolean): List<Product> {
                return productRepository.findByDiscountTrue()
        }
        //recuerda http://localhost:8080/products/discounted?discount=true para postman


}
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "product not found")
class ProductNotFoundException : RuntimeException()






