package br.com.unisinos.discografia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "musicas")
@NoArgsConstructor
@AllArgsConstructor
public class Musica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idMusica;

    public String nome;
    public String tempo;

    @ManyToOne
    @JoinColumn(name = "idDiscografia")
    public Discografia discografia;

    @ManyToOne
    @JoinColumn(name = "idGenero")
    public Genero genero;
}
