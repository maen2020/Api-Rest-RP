package com.maen.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Data //Crea los metodos Get y Set etc.
@AllArgsConstructor //Crea un constructor con parametros.
@NoArgsConstructor //Crea un constructir vacio.
@ToString //Devuelve una representación en cadena de texto del objeto sobre el cual se invoque.
@Builder //Permite enviar datos en vez de los contructores.
@Entity //Definir la clase como entidad.
@Table(name = "users") //Hace referencia hacia la tabla de la base de datos.
public class User implements Serializable {

    //Atributos que seran mapeados con una tabla de la base de datos.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
