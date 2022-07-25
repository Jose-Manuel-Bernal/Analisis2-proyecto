package com.udea.analisis2.proyecto.bibliotecadeConocimientos.entidad;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

@Data
@Document(collection = "nodos")
public class Nodo {

    @Id
    private String id;
    private String nombre;
    private Date fecha;
    private String nota;
    private Anotacion anotacion;
    private String idBiblioteca;
    private List<Tema> temas;
    private List<String> idNodos;
}
