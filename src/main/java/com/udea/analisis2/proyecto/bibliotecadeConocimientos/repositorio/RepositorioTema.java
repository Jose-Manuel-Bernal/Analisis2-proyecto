package com.udea.analisis2.proyecto.bibliotecadeConocimientos.repositorio;

import com.udea.analisis2.proyecto.bibliotecadeConocimientos.entidad.Tema;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioTema extends MongoRepository<Tema, String> {
}
