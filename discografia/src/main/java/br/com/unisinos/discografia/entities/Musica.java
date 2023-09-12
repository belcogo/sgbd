package br.com.unisinos.discografia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "musicas")
public class Musica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int idMusica;

    public String nome;
    public String tempo;

    @ManyToOne
    @JoinColumn(name = "idDiscografia")
    private Discografia discografia;

    @ManyToOne
    @JoinColumn(name = "idGenero")
    private Genero genero;

    public Musica (int id, String nome, String tempo){
        this.idMusica = id;
        this.nome = nome;
        this.tempo = tempo;
    }
}
