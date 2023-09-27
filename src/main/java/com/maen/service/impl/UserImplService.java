package com.maen.service.impl;

import com.maen.model.dao.IUserDao;
import com.maen.model.dto.UserDto;
import com.maen.model.entity.User;
import com.maen.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//Dentro de esta clase se implementan los metodos que estan dentro de la interfaz IUserService.
//Dentro de esta clase se tiene que mandar a llamar(implements) a la interfaz ICustomer para hacer uso
//de esos metodos.

/**
 * Dentro de esta clase se hace el match con lo que se tiene en el DAO,
 * la informacion se procesa y se manda al ICustomerDAO.
 * */
@Service //Indicar que la clase va a trabajar como servicio dentro de la logica de negocio.
public class UserImplService implements IUserService {

    //Instanciar o inyectar el IUserDao.
    @Autowired
    private IUserDao userDao;

    @Transactional
    @Override
    public User save(UserDto userDto) {
        User user = User.builder()
                .id(userDto.getId())
                .name(userDto.getName())
                .build();
        return userDao.save(user);
    }

    @Transactional(readOnly = true)
    @Override
    public User getById(Long id) {
        return userDao.findById(id).orElseThrow(null);
    }
}
