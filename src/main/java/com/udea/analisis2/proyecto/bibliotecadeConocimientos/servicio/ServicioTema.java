package com.udea.analisis2.proyecto.bibliotecadeConocimientos.servicio;

import com.udea.analisis2.proyecto.bibliotecadeConocimientos.dto.TemaDTO;
import com.udea.analisis2.proyecto.bibliotecadeConocimientos.entidad.Tema;
import com.udea.analisis2.proyecto.bibliotecadeConocimientos.mapper.TemaMapper;
import com.udea.analisis2.proyecto.bibliotecadeConocimientos.repositorio.RepositorioTema;
import org.springframework.stereotype.Service;

@Service
public class ServicioTema {

    private RepositorioTema repositorio;
    private TemaMapper mapper;

    public ServicioTema(RepositorioTema repositorio, TemaMapper mapper) {
        this.repositorio = repositorio;
        this.mapper = mapper;
    }

    public TemaDTO crearTema(TemaDTO temaDTO) {
        return mapper.toTemaDTO(repositorio.save(mapper.toTemaEntidad(temaDTO)));
    }

    public TemaDTO obtenerTemaPorId(String id) {
        return mapper.toTemaDTO(repositorio.findById(id).orElseThrow());
    }

    public TemaDTO actualizarTema(TemaDTO temaDTO) {
        return mapper.toTemaDTO(repositorio.save(mapper.toTemaEntidad(temaDTO)));
    }

    public boolean eliminarTema(String id) {
        if (repositorio.existsById(id)) {
            repositorio.deleteById(id);
            return true;
        }
        else {
            return false;
        }
    }
}
