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
  public int id_discografia;

  public String titulo;
  public String bio;
  public String tipo;

  @ManyToOne
  @JoinColumn(name = "id_gravadora")
  private Gravadora gravadora;

  @ManyToOne
  @JoinColumn(name = "id_produtora")
  private Produtora produtora;
  
  public Discografia(int id, String titulo, String bio, String tipo) {
    this.id_discografia = id;
    this.titulo = titulo;
    this.bio = bio;
    this.tipo = tipo;
  }
}
