package br.com.unisinos.discografia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "artistas")
public class Artista {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public int idArtista;

  public String nomeCompleto;
  public String nomeArtistico;
  public String bio;

  public Artista(int id, String nomeCompleto, String nomeArtistico, String bio) {
    this.idArtista = id;
    this.nomeCompleto = nomeCompleto;
    this.nomeArtistico = nomeArtistico;
    this.bio = bio;
  }
}
