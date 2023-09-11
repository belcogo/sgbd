package demo.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tabela_artista")
public class Artista {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public int id_artista;

  public String nome_completo;
  public String nome_artistico;
  public String bio;

  public Artista(int id, String nome_completo, String nome_artistico, String bio) {
    this.id_artista = id;
    this.nome_completo = nome_completo;
    this.nome_artistico = nome_artistico;
    this.bio = bio;
  }
}
