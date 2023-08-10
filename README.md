
# Shop API con Spring Boot y Kotlin

Este es un proyecto de ejemplo de una API REST creada utilizando Spring Boot y Kotlin. La API gestiona productos y ofrece endpoints para obtener una lista de productos, agregar productos y obtener productos con descuento.

## Requisitos Previos

- Java JDK instalado en tu sistema.
- Kotlin instalado en tu sistema.
- [Spring Boot](https://spring.io/guides/gs/spring-boot/) instalado o configurado en el proyecto.

## Cómo Ejecutar

1. Clona este repositorio en tu computadora:

```sh
git clone https://github.com/Irina-Ichim/Shop-Api-con-Kotlin-y-SpringBoot.git
```

2. Navega a la carpeta del proyecto:

```sh
cd shop-api-spring-kotlin
```

3. Ejecuta la aplicación utilizando Gradle:

```sh
./gradlew bootRun
```

4. Accede a la API en tu navegador o herramienta de API como [Postman](https://www.postman.com/):

- [http://localhost:8080/products](http://localhost:8080/products): Ver todos los productos.
- [http://localhost:8080/products/discounted?discount=true](http://localhost:8080/products/discounted?discount=true): Ver productos con descuento.

## Estructura del Proyecto

- `src/main/kotlin/com/shop/api/shopapi`: Contiene los archivos de la aplicación.
    - `controllers/ProductController.kt`: Controlador de la API con endpoints para productos.
    - `domain/Product.kt`: Definición de la entidad de Producto.
    - `ShopApiConSpringBootYKotlinApplication.kt`: Clase principal de la aplicación.
- `src/main/resources`: Contiene recursos como archivos de configuración.

## Dependencias

- [Spring Boot](https://spring.io/projects/spring-boot): Framework para construir aplicaciones Java/Kotlin.
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa): Simplifica el acceso a bases de datos.
- [H2 Database](https://www.h2database.com/html/main.html): Base de datos en memoria para desarrollo.


