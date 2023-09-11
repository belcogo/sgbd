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
  public int idLancamento;

  public String data;
  public String plataformas;

  @OneToOne
  @JoinColumn(name = "idDiscografia")
  public Discografia discografia;

  public Lancamento(int id, String data, String plataformas) {
    this.idLancamento = id;
    this.data = data;
    this.plataformas = plataformas;
  }
}
