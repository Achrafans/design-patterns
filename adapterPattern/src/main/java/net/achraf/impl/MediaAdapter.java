package net.achraf.impl;

import net.achraf.IAdvancedMediaPlayer;
import net.achraf.IMediaPlayer;

// L'adaptateur implémente l'interface cible (IMediaPlayer)
// et utilise en interne l'interface incompatible (IAdvancedMediaPlayer)
public class MediaAdapter implements IMediaPlayer {
    private IAdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(IAdvancedMediaPlayer advancedMusicPlayer) {
        this.advancedMusicPlayer = advancedMusicPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        // Ici, on traduit l'appel "play" vers les méthodes spécifiques
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer.playMp4(fileName);
        } else {
            System.out.println("Format non supporté par l'adaptateur : " + audioType);
        }

    }
}
