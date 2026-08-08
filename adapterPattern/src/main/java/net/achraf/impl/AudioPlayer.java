package net.achraf.impl;

import net.achraf.IMediaPlayer;

// Lecteur audio principal qui ne connaît que l'interface MediaPlayer
public class AudioPlayer implements IMediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        // Fonctionnalité native : lecture MP3 (pas besoin d'adaptateur)
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Lecture du fichier MP3 : " + fileName);
        }
        // Pour les formats non natifs, on utilise l'adaptateur
        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            // On instancie l'adaptateur avec le bon lecteur spécialisé
            if (audioType.equalsIgnoreCase("vlc")) {
                mediaAdapter = new MediaAdapter(new VlcPlayer());
            } else {
                mediaAdapter = new MediaAdapter(new Mp4Player());
            }
            // On délègue le travail à l'adaptateur
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Format invalide : " + audioType + " (non supporté)");
        }
    }
}
