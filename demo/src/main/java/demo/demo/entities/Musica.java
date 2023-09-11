package demo.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tabela_musica")
public class Musica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id_musica;

    public String nome;
    public String tempo;

    @ManyToOne
    @JoinColumn(name = "id_discografia")
    private Discografia discografia;

    @ManyToOne
    @JoinColumn(name = "id_genero")
    private Genero genero;

    public Musica (int id, String nome, String tempo){
        this.id_musica = id;
        this.nome = nome;
        this.tempo = tempo;
    }
}
