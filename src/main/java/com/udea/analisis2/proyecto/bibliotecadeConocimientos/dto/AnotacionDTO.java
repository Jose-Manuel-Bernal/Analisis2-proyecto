package com.udea.analisis2.proyecto.bibliotecadeConocimientos.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
public class AnotacionDTO {

    private String id;
    @NotBlank
    private String titulo;
    private Date fecha;
    @NotBlank
    private String contenido;
}
