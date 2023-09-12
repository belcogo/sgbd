package br.com.unisinos.discografia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "lancamentos")
@NoArgsConstructor
@AllArgsConstructor
public class Lancamento {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long idLancamento;

  public String data;
  public String plataformas;

  @OneToOne
  @JoinColumn(name = "idDiscografia")
  public Discografia discografia;
}
