package com.maen.model.dao;

import com.maen.model.entity.User;
import org.springframework.data.repository.CrudRepository;

//De esta interface(REPOSITORIO) se van a mandar a llamar a los metodos CRUD.
public interface IUserDao extends CrudRepository<User, Long> {
}
