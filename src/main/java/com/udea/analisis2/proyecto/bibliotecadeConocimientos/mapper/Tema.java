package com.udea.analisis2.proyecto.bibliotecadeConocimientos.mapper;

import com.udea.analisis2.proyecto.bibliotecadeConocimientos.dto.TemaDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class Tema {

    private final ModelMapper modelMapper;

    public Tema(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public TemaDTO toTemaDTO(Tema tema) {
        return modelMapper.map(tema, TemaDTO.class);
    }

    public Tema toTemaEntidad(TemaDTO temaDTO) {
        return modelMapper.map(temaDTO, Tema.class);
    }
}
