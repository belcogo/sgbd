package demo.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tabela_discografia")
public class Discografia {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public int idDiscografia;

  public String titulo;
  public String bio;
  public String tipo;

  @ManyToOne
  @JoinColumn(name = "idGravadora")
  private Gravadora gravadora;

  @ManyToOne
  @JoinColumn(name = "idProdutora")
  private Produtora produtora;
  
  public Discografia(int id, String titulo, String bio, String tipo) {
    this.idDiscografia = id;
    this.titulo = titulo;
    this.bio = bio;
    this.tipo = tipo;
  }
}
