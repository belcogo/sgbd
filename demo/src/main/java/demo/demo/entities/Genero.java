package demo.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tabela_genero")
public class Genero {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public int idGenero;

  public String nome;

  public Genero(int id, String nome) {
    this.idGenero = id;
    this.nome = nome;
  }
}
