package net.achraf.impl;

import net.achraf.IAdvancedMediaPlayer;

public class Mp4Player implements IAdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        System.out.println("Lecture du fichier MP4 : " + fileName);
    }

    @Override
    public void playVlc(String fileName) {
        // Ne fait rien
    }
}
