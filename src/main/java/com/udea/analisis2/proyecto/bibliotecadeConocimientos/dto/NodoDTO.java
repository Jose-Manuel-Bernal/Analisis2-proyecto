package com.udea.analisis2.proyecto.bibliotecadeConocimientos.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

@Data
public class NodoDTO {

    private String id;
    @NotBlank
    private String nombre;
    private Date fecha;
    private AnotacionDTO anotacion;
    @NotBlank
    private String idBiblioteca;
    private List<TemaDTO> temas;
    private List<String> idNodos;
}
