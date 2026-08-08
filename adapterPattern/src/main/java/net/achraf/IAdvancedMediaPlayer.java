package net.achraf;

// Interface d'un lecteur avancé (incompatible avec MediaPlayer)
public interface IAdvancedMediaPlayer {
    void playMp4(String fileName);
    void playVlc(String fileName);
}
