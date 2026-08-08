package net.achraf;

import net.achraf.impl.AudioPlayer;

public class Main {
    public static void main(String[] args) {

        AudioPlayer player = new AudioPlayer();

        // Lecture native (sans adaptateur)
        player.play("mp3", "ma_musique_preferee.mp3");

        // Lecture via l'adaptateur (traduit en playVlc)
        player.play("vlc", "film_super.hevc.vlc");

        // Lecture via l'adaptateur (traduit en playMp4)
        player.play("mp4", "vacances_ete.mp4");

        // Format inconnu (l'adaptateur ne peut pas aider)
        player.play("avi", "ancien_film.avi");
    }
}