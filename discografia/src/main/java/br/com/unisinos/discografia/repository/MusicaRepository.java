package br.com.unisinos.discografia.repository;

import br.com.unisinos.discografia.entities.Artista;
import br.com.unisinos.discografia.entities.Discografia;
import br.com.unisinos.discografia.entities.Musica;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MusicaRepository extends CrudRepository<Musica, Long> {
    Iterable<Musica> findByDiscografia(Discografia discografia);
}
