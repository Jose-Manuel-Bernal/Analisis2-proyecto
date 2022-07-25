package com.udea.analisis2.proyecto.bibliotecadeConocimientos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TemaDTO {
    private String id;
    @NotBlank
    private String nombre;
}
