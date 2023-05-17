package repositories

import domain.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository : JpaRepository<Product, String> {
    // Puedes agregar métodos personalizados para consultas específicas si es necesario
    fun findByHasDiscountTrue(): List<Product>
}
