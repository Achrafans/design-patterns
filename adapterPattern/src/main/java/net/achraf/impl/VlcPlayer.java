package net.achraf.impl;

import net.achraf.IAdvancedMediaPlayer;

// Implémentation concrète de ce lecteur avancé
public class VlcPlayer implements IAdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        // Ne fait rien
    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("Lecture du fichier VLC : " + fileName);
    }
}
