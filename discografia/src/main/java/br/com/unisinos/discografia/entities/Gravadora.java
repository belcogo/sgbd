package br.com.unisinos.discografia.entities;

import br.com.unisinos.discografia.interfaces.IEmpresa;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "gravadoras")
@NoArgsConstructor
@AllArgsConstructor
public class Gravadora implements IEmpresa {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long idGravadora;
}
