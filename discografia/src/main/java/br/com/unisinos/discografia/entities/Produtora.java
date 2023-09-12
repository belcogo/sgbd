package br.com.unisinos.discografia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "produtoras")
public class Produtora {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public int idProdutora;

  public String nome;
  public String enderecoMatriz;


  public Produtora (int id, String nome, String enderecoMatriz){
    this.idProdutora = id;
    this.nome = nome;
    this.enderecoMatriz = enderecoMatriz;
  }
}
