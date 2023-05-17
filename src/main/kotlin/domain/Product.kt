package domain


data class Product(
    val id: String,
    val name: String,
    val brand: String,
    val has_discount: Boolean,
    val price: Double
)
