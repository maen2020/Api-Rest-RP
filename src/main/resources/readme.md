1. Creacion del banner y la conexion a la base de datos.
   2. Dentro del application.properties se hace toa la configuracion para la conexion a la base de datos.
2. Creacion de la entidad(User).
   3. Dentro de la clase entidad se mapean los atributos de una tabla de la base de datos. 
3. Creacion del DAO(IUserDao).
   4. Dentro de esta clase(Interfaz) es donde se van a mandar a llamar a los metodos CRUD.
5. Creacion de servicio(IUserService).
   6. Dentro de esta clase(Interfaz) es donde se van a definir los metodos CRUD a utilizar.
6. Creacion del Dto(UserDto).
   7. Dentro de esta clase se crea un archivo plano con los atributos mapeados dentro del la entidad.
8. Creacion de la implementacion del servico.
   9. Dentro de esta clase se imp,mentan los metodos CRU que se definieron dentro de la interfaz IUserService.
10. Creacion del controlador(UserController).
    11. Dentro de esta clase van colocar los metodos CRUD(Get, Post, Put, Delete, ect..)
12. Creacion del payload con response(MessageResponse).
    13. Dentro de esta clase se colocan los atributos con los que que va a responder el back en caso de un fallo.