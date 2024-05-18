# Web-API-de-Libro
Creación de una entidad Libro, el cuál sus variables serán: id, titulo, autor, editorial y anioPublicacion. Se debe crear servicios-repositorios-controladores, además hacer pruebas con Postman. Separamos por carpetas creando services-controllers-repositorys-models
![Captura de pantalla (2170)](https://github.com/AbarcaBryan/libros/assets/169930464/f19c9a03-44eb-4825-9b01-c1fbc2ab9447)

# Creamos la clase libro con los campos, junto con sus getters-setters:
- id: Long
- titulo: String
- autor: String
- editorial: String
- anioPublicacion: Integer

![Captura de pantalla (2171)](https://github.com/AbarcaBryan/libros/assets/169930464/d6c82a33-6720-46bb-84cc-5eda204db962)

# Creación del controllers:
Aqui definiremos el get y post

![Captura de pantalla (2172)](https://github.com/AbarcaBryan/libros/assets/169930464/d7b1dfa2-c03d-41cf-857b-2e6fdc61fdbf)

# Creación del repository:
"LibroRepository.java": Definimos los metodos, que vamos a utilizar

![Captura de pantalla (2173)](https://github.com/AbarcaBryan/libros/assets/169930464/ba3391e4-ee25-4f8d-82ff-f846df08085f)

"LibroRepositoryDemo.java" y "LibroRepositoryImpl.java": Definimos la base de datos que contendrá objetos quemados de los libros
![Captura de pantalla (2174)](https://github.com/AbarcaBryan/libros/assets/169930464/14d3d822-b4da-4455-a592-0a7e3274631a)
![Captura de pantalla (2183)](https://github.com/AbarcaBryan/libros/assets/169930464/e7017642-57a6-4b77-a266-6404417b2c2d)

# Creación del services:
Se encargara de llamar a la instancia repository "LibroService.java" y el "LibroServiceImpl.java" sera nuestra interfaz
![Captura de pantalla (2175)](https://github.com/AbarcaBryan/libros/assets/169930464/24dc1ff7-6f45-4fb7-9766-07e63bd1c348)
![Captura de pantalla (2176)](https://github.com/AbarcaBryan/libros/assets/169930464/1e769837-12e7-4b18-bc00-028faf00a422)

# Ejecución del spring:
![Captura de pantalla (2177)](https://github.com/AbarcaBryan/libros/assets/169930464/eb8ec77c-0899-4052-8e9f-8d30cc57ee54)
![Captura de pantalla (2178)](https://github.com/AbarcaBryan/libros/assets/169930464/fe8af685-7f8e-4349-b6e8-5a9905f200c1)

# Prueba en postman:
![Captura de pantalla (2181)](https://github.com/AbarcaBryan/libros/assets/169930464/74e0251c-2d5e-4c7a-af77-ff64474a7e9d)
![Captura de pantalla (2180)](https://github.com/AbarcaBryan/libros/assets/169930464/b4d6a771-0239-466d-80c0-7d409d985fd1)
![Captura de pantalla (2179)](https://github.com/AbarcaBryan/libros/assets/169930464/cfab7e44-8946-4923-b82c-270264044dbd)

