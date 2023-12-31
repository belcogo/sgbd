/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unisinos.discografia.repository;

import br.com.unisinos.discografia.entities.Discografia;
import br.com.unisinos.discografia.entities.Gravadora;

import org.springframework.data.repository.CrudRepository;

public interface DiscografiaRepository extends CrudRepository<Discografia, Long> {

  Iterable<Discografia> findByGravadora(Gravadora gravadora);
}
