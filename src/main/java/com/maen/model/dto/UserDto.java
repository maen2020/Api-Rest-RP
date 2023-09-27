package com.maen.model.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

//Esta clase hace referencia a una entidad o tabla de la base de datos.
@Data //Generar los metodos Get y Set en automatico.
@ToString //Devuelve una representación en cadena de texto del objeto sobre el cual se invoque.
@Builder //Permite enviar datos en vez de los contructores.
public class UserDto implements Serializable {

    //Atributos.
    private Long id;
    private String name;
}
