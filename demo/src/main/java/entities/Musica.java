package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tabela_musica")
public class Musica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id_musica;

    public String nome;
    public String tempo;

    public Musica (int id, String nome, String tempo){
        this.id_musica = id;
        this.nome = nome;
        this.tempo = tempo;
    }
}
