package demo.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name = "tabela_funcao")
public class Funcao {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public int id_funcao;

  public String tipo; // todo: create enum!

  @ManyToOne
  @JoinColumn(name = "id_artista")
  public Artista artista;

  @ManyToOne
  @JoinColumn(name = "id_musica")
  public Musica musica;

  public Funcao (int id){
    this.id_funcao = id;
  }
}
