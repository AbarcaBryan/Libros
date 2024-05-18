# Web-API-de-Libro
Creación de una entidad Libro, el cuál sus variables serán: id, titulo, autor, editorial y anioPublicacion. Se debe crear servicios-repositorios-controladores, además hacer pruebas con Postman. Separamos por carpetas creando services-controllers-repositorys-models
![Captura de pantalla (2170)](https://github.com/AbarcaBryan/libros/assets/169930464/f19c9a03-44eb-4825-9b01-c1fbc2ab9447)

# Creamos la clase libro con los campos, junto con sus getters-setters:
id: Long
titulo: String
autor: String
editorial: String
anioPublicacion: Integer
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
