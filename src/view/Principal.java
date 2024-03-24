package view;

import model.Musica;
import model.Playlist;

public class Principal {


	public static void main(String[] args) {	

Playlist playlist = new Playlist();
Musica m = new Musica();

m.setAutor("amos");
m.setGravadora("aoc");
m.setNome("Semestre");


Musica m2 = new Musica();

m2.setAutor("Veloso");
m2.setGravadora("AOC");
m2.setNome("Opera");


playlist.adicionarMusica(m);
playlist.adicionarMusica(m2);
playlist.tocarMusicaAleatoria();
		
	}
	

}
