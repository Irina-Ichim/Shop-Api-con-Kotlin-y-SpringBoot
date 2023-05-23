package com.shop.api.shopapi.repositories

import com.shop.api.shopapi.domain.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface ProductRepository : JpaRepository<Product, Int> {
    fun findByDiscountTrue(): List<Product>}
