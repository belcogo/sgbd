package br.com.unisinos.discografia.entities;

import br.com.unisinos.enums.TipoFuncaoEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "funcoes")
@NoArgsConstructor
@AllArgsConstructor
public class Funcao {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long idFuncao;

  @Enumerated(EnumType.STRING)
  public TipoFuncaoEnum tipo;

  @ManyToOne
  @JoinColumn(name = "idArtista")
  public Artista artista;

  @ManyToOne
  @JoinColumn(name = "idMusica")
  public Musica musica;

  public Funcao(Long id, TipoFuncaoEnum tipo) {
    this.idFuncao = id;
    this.tipo = tipo;
  }
}
