package br.com.unisinos.discografia.entities;

import br.com.unisinos.discografia.enums.TipoDiscografiaEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "discografias")
@NoArgsConstructor
@AllArgsConstructor
public class Discografia {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long idDiscografia;

  public String titulo;
  public String bio;

  @Enumerated(EnumType.STRING)
  public TipoDiscografiaEnum tipo;

  @ManyToOne
  @JoinColumn(name = "idGravadora")
  public Gravadora gravadora;

  @ManyToOne
  @JoinColumn(name = "idProdutora")
  public Produtora produtora;
}
