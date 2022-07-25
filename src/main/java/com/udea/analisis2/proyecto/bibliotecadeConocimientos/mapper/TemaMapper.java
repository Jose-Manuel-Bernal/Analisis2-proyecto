package com.udea.analisis2.proyecto.bibliotecadeConocimientos.mapper;

import com.udea.analisis2.proyecto.bibliotecadeConocimientos.dto.TemaDTO;
import com.udea.analisis2.proyecto.bibliotecadeConocimientos.entidad.Tema;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class TemaMapper {

    private final ModelMapper modelMapper;

    public TemaMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public TemaDTO toTemaDTO(Tema tema) {
        return modelMapper.map(tema, TemaDTO.class);
    }

    public Tema toTemaEntidad(TemaDTO temaDTO) {
        return modelMapper.map(temaDTO, Tema.class);
    }
}
