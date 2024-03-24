package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Playlist {

    private String dono;
    private List<Musica> musicas;

    public Playlist() {
  
        musicas = new ArrayList<>();
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public void tocarMusicaAleatoria() {
        if (musicas.isEmpty()) {
            System.out.println("Nenhuma música foi adicionada à playlist.");
        } else {
            Random random = new Random();
            int Aleatorio = random.nextInt(musicas.size());
            Musica musicaAleatoria = musicas.get(Aleatorio);
            System.out.println("A música que está tocando é: " + musicaAleatoria.getNome());
        }
    }
}
