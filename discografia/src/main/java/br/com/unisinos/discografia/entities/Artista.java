package br.com.unisinos.discografia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "artistas")
@NoArgsConstructor
@AllArgsConstructor
public class Artista {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long idArtista;

  public String nomeCompleto;
  public String nomeArtistico;
  public String bio;
}
