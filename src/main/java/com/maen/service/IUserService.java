package com.maen.service;

import com.maen.model.dto.UserDto;
import com.maen.model.entity.User;

//Clase(Interfaz) que va a contener los metodos que seran utilizados en el CRUD.
public interface IUserService {

    //Metodos CRUD obtenidos del repositorio (IUserDao)
    //Metodo para guardar un registro.
    User save(UserDto userDto);

    //Metodo para obtener un registro por medio de su id.
    User getById(Long id);
}
