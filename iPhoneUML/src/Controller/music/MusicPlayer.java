package Controller.music;

import Model.Music;

public class MusicPlayer {

    public static void main() {
        selecionar();
    }

    private static void selecionar(){
        Music music = new Music();
        music.setMusic("Luan Santana");
        tocar(music.getMusic());
        pausar();
    }

    private static void tocar(String music)
    {
        System.out.println("Tocando a música " + music);
    }

    private static void pausar()
    {
        System.out.println("Pausando a música");
    }
}
