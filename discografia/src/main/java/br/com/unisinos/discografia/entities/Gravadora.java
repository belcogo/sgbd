package br.com.unisinos.discografia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gravadoras")
public class Gravadora {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public int idGravadora;  

  public String nome;
  public String enderecoMatriz;

  public Gravadora (int id, String nome, String enderecoMatriz){
    this.idGravadora = id;
    this.nome = nome;
    this.enderecoMatriz = enderecoMatriz;
  }
}
