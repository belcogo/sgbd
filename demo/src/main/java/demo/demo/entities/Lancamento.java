package demo.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tabela_lancamento")
public class Lancamento {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public int id_lancamento;

  public String data;
  public String plataformas;

  @OneToOne
  @JoinColumn(name = "id_discografia")
  public Discografia discografia;

  public Lancamento(int id, String data, String plataformas) {
    this.id_lancamento = id;
    this.data = data;
    this.plataformas = plataformas;
  }
}
