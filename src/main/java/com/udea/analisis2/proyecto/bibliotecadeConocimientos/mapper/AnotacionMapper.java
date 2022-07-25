package com.udea.analisis2.proyecto.bibliotecadeConocimientos.mapper;

import com.udea.analisis2.proyecto.bibliotecadeConocimientos.dto.AnotacionDTO;
import com.udea.analisis2.proyecto.bibliotecadeConocimientos.entidad.Anotacion;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class AnotacionMapper {

    private final ModelMapper modelMapper;

    public AnotacionMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public AnotacionDTO toAnotacionDTO(Anotacion anotacion) {
        return modelMapper.map(anotacion, AnotacionDTO.class);
    }

    public Anotacion toAnotacionEntidad(AnotacionDTO anotacionDTO) {
        return modelMapper.map(anotacionDTO, Anotacion.class);
    }
}
