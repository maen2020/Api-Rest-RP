package com.maen.model.payload;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

//Clase de validacion de status code mediante un payload.
@Data //Generar los metodos Get y Set en automatico.
@ToString //Devuelve una representación en cadena de texto del objeto sobre el cual se invoque.
@Builder //Permite enviar datos en vez de los constructores.
public class MessageResponse implements Serializable {

    //Atributos que tendra el payload del response.
    private String message;
    private Object object;
}
