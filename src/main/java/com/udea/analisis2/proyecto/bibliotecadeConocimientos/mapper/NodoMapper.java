package com.udea.analisis2.proyecto.bibliotecadeConocimientos.mapper;

import com.udea.analisis2.proyecto.bibliotecadeConocimientos.dto.NodoDTO;
import com.udea.analisis2.proyecto.bibliotecadeConocimientos.entidad.Nodo;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class NodoMapper {

    private final ModelMapper modelMapper;

    public NodoMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public NodoDTO toNodoDTO(Nodo nodo) {
        return modelMapper.map(nodo, NodoDTO.class);
    }

    public Nodo toNodoEntidad(NodoDTO nodoDTO) {
        return modelMapper.map(nodoDTO, Nodo.class);
    }
}
