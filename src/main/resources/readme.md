1. Creacion del banner y la conexion a la base de datos.
   2. Dentro del application.properties se hace toa la configuracion para la conexion a la base de datos.
2. Creacion de la entidad(User).
   3. Dentro de la clase entidad se mapean los atributos de una tabla de la base de datos. 
3. Creacion del DAO(IUserDao).
   4. Dentro de esta clase(Interfaz) es donde se van a mandar a llamar a los metodos CRUD.
5. Creacion de servicio(IUserService).
   6. Dentro de esta clase(Interfaz) es donde se van a definir los metodos CRUD a utilizar.
