<h1> Servicio REST Foro HUB para el manejo de tópicos </h1>


### Tópicos 

- [Descripción del Proyecto](#descripcion)

- [Tecnologías Empleadas](#tecnologias)

- [Funcionalidades](#funcionalidades)


## Descripción del Proyecto

<p align="justify">
Foro_Hub es una API RESTful implementada en Java sobre el framework Spring Boot, orientada a la administración de tópicos asociados a cursos predefinidos en la aplicación.
Proporciona un conjunto de operaciones CRUD (Create, Read, Update, Delete), complementadas con funcionalidades de listado, paginación, filtrado y un sistema robusto de manejo de excepciones.
La arquitectura y el desarrollo se adhieren estrictamente a los principios de diseño de APIs RESTful, siguiendo estándares de codificación y buenas prácticas de ingeniería de software.
</p>

<img width="1557" height="1162" alt="image" src="https://github.com/user-attachments/assets/d5e4fae5-2764-4b18-8398-be620b4539b4" />


## Tecnologías Empleadas

Se emplearon :

- Java 17
- Spring Boot 3.5.4
- MySQL 10.4.32-MariaDB
- Librerias como [JPA + Spring Data - Flyway - Lombok - Jakarta Validation - Spring Security - Auth0 JWT (java-jwt) ]
- Insomnia 

<a href="https://www.java.com" target="_blank"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a> <a href="https://developer.android.com/studio" target="_blank"> <img src="https://d1.awsstatic.com/asset-repository/products/amazon-rds/1024px-MySQL.ff87215b43fd7292af172e2a5d9b844217262571.png" alt="androidStudio" width="40" height="40"/> </a> 


<a href="https://developer.android.com/studio" target="_blank"> <img src="https://uxwing.com/wp-content/themes/uxwing/download/brands-and-social-media/spring-boot-icon.png" alt="androidStudio" width="40" height="40"/> </a> <a href="https://developer.android.com/studio" target="_blank"> <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTyqwgHeUDT6P4Xf9v6rqBmohUsP29pm2WTYg&s" alt="androidStudio" width="40" height="40"/> </a> 
###

## Funcionalidades

:heavy_check_mark: `Registro de un nuevo Topico :` Cuenta con un endpoint(punto final) para el registro de tópicos , aceptando solicitudes POST para la URI/tópicos.

:heavy_check_mark: `Listar Tópicos:` Cuenta con dos endpoint(punto final) para listar todos los tópicos con solicitudes del tipo GET:

    http://localhost:8080/topicos // Lista todos los tópicos registrados.

    http://localhost:8080/topicos?curso=PROGRAMACION // Lista los tópicos que pertenecen al curso de Programación

    http://localhost:8080/topicos?anio=2024 // Lista los tópicos del año 2024



:heavy_check_mark: `Detallar Tópico:` Cuenta con un endpoint(punto final) para listar el tópico llamado por una solicitud de tipo GET para la URI /tópico/{id}.

:heavy_check_mark: `Actualizar Tópico:`  Cuenta con un endpoint(punto final) para la actualización de un determinado tópico aceptando solicitudes del tipo PUT para la URI /tópico/{id}.

:heavy_check_mark: `Eliminar Tópico:`  Cuenta con un endpoint(punto final) para la eliminación de un determinado tópico aceptando solicitudes del tipo DELETE para la URI /tópico/{id} .

:heavy_check_mark: `Generación de Token con JWT:` Para mayor seguridad de la aplicación, se implemento tokens para la autenticación con JWT(JSON Web Token) estandar utilizado para compartir información entre cliente y servidor.

:heavy_check_mark: `Autenticación con JWT:` Servicio implementado para la autenticación al gestionar los topicos como crear, consultar, listar, actualizar y eliminar.


## Repositorio:

    https://github.com/Secin/forohub.git

## Autor:

Ing. Cinthia Karen Anaya Muñoz GitHub: <a href="https://github.com/Secin" target="_blank">@Secin</a> 




