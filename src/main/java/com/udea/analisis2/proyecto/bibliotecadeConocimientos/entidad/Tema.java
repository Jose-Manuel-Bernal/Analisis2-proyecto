package com.udea.analisis2.proyecto.bibliotecadeConocimientos.entidad;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "temas")
public class Tema {

    @Id
    private String id;
    private String nombre;
}
