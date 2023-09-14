package br.com.unisinos.discografia.repository;

import br.com.unisinos.discografia.entities.Musica;
import org.springframework.data.repository.CrudRepository;

public interface MusicaRepository extends CrudRepository<Musica, Long> {
}
