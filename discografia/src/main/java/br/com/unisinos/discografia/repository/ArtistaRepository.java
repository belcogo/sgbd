package br.com.unisinos.discografia.repository;

import br.com.unisinos.discografia.entities.Artista;
import org.springframework.data.repository.CrudRepository;


public interface ArtistaRepository extends CrudRepository<Artista, Long> {
}
