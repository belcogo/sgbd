/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unisinos.discografia.repository;

import br.com.unisinos.discografia.entities.Artista;
import br.com.unisinos.discografia.entities.Funcao;
import br.com.unisinos.discografia.enums.TipoFuncaoEnum;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 *
 * @author belcogo
 */
public interface FuncaoRepository extends CrudRepository<Funcao, Long> {
    List<Funcao> findByArtistaAndTipo(Artista artista, TipoFuncaoEnum tipo);
}
