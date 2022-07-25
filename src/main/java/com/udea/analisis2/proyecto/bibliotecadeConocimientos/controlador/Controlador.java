package com.udea.analisis2.proyecto.bibliotecadeConocimientos.controlador;

import com.udea.analisis2.proyecto.bibliotecadeConocimientos.dto.TemaDTO;
import com.udea.analisis2.proyecto.bibliotecadeConocimientos.entidad.Tema;
import com.udea.analisis2.proyecto.bibliotecadeConocimientos.servicio.ServicioTema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class Controlador {

    @Autowired
    private ServicioTema servicioTema;

    @PostMapping("/tema/crearTema")
    public TemaDTO crearNuevoTema(@RequestBody TemaDTO temaDTO) {
        return servicioTema.crearTema(temaDTO);
    }

    @GetMapping("/tema/get/byId/{id}")
    public TemaDTO obtenerTemaPorId(@PathVariable String id) {
        return servicioTema.obtenerTemaPorId(id);
    }

    @PutMapping("/tema/actualizar")
    public TemaDTO actualizarTema(@RequestBody TemaDTO temaDTO) {
        return servicioTema.actualizarTema(temaDTO);
    }

    @DeleteMapping("/tema/eliminar/{id}")
    public boolean eliminarTema(@PathVariable String id) {
        return servicioTema.eliminarTema(id);
    }
}
