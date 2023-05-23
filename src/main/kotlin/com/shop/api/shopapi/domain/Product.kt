package com.shop.api.shopapi.domain
import jakarta.persistence.*

@Entity
data class Product(
   var name: String,
   var brand: String,
   val discount: Boolean,
   val price: Double,

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   var id: Int
)

