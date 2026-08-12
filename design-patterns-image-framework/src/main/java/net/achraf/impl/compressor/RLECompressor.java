package net.achraf.impl.compressor;

import net.achraf.Compressor;

// Compression RLE (Run-Length Encoding) simulée
public class RLECompressor extends Compressor {
    @Override
    protected int[] doCompress(int[] data) {
        System.out.println("Application de la compression RLE...");
        // Simulation : on réduit la taille de moitié (pour l'exemple)
        int[] compressed = new int[data.length / 2 + 1];
        for (int i = 0; i < compressed.length && i < data.length; i++) {
            compressed[i] = data[i];
        }
        return compressed;
    }
}
