package demo.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "tabela_produtora")
public class Produtora {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public int id_produtora;

  public String nome;
  public String endereco_matriz;


  public Produtora (int id, String nome, String endereco_matriz){
    this.id_produtora = id;
    this.nome = nome;
    this.endereco_matriz = endereco_matriz;
  }
}
