package com.maen.controller;

import com.maen.model.dto.UserDto;
import com.maen.model.entity.User;
import com.maen.model.payload.MessageResponse;
import com.maen.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //Indica que esta clase es un controlador.
@RequestMapping("/api/v1")
public class UserController {

    //Intanciar o inyectar el servico que tiene la logica de negocio.
    @Autowired
    private IUserService userService;

    @PostMapping("/user")
    public ResponseEntity<?> save(@RequestBody UserDto userDto){
        User userSave = null;
        try {
            userSave = userService.save(userDto);
            return new ResponseEntity<>(MessageResponse.builder()
                    .message("Record saved succesfully.")
                    .object(UserDto.builder()
                            .id(userSave.getId())
                            .name(userSave.getName())
                            .build())
                    .build()
                    , HttpStatus.CREATED);
        } catch(DataAccessException ex){
            return new ResponseEntity<>(
                    MessageResponse.builder()
                            .message("ex")
                            .object(null)
                            .build()
                    ,HttpStatus.METHOD_NOT_ALLOWED);
        }
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id){
        User user = userService.findById(id);
        if (user == null){
            return new ResponseEntity<>(
                    MessageResponse.builder()
                            .message("The registry does not exist.")
                            .object(null)
                            .build()
                    ,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(
                MessageResponse.builder()
                        .message("")
                        .object(UserDto.builder()
                                .id(user.getId())
                                .name(user.getName())
                                .build())
                        .build()
                ,HttpStatus.OK);
    }
}
