package com.udea.analisis2.proyecto.bibliotecadeConocimientos.entidad;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "anotaciones")
public class Anotacion {

    @Id
    private String id;
    private String titulo;
    private Date fecha;
    private String contenido;
}
