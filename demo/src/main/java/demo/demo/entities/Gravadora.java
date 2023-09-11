package demo.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tabela_gravadora")
public class Gravadora {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public int id_gravadora;  

  public String nome;
  public String endereco_matriz;

  public Gravadora (int id, String nome, String endereco_matriz){
    this.id_gravadora = id;
    this.nome = nome;
    this.endereco_matriz = endereco_matriz;
  }
}
