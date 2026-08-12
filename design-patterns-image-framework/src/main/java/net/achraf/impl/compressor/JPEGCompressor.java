package net.achraf.impl.compressor;

import net.achraf.Compressor;

// Compression JPEG simulée
public class JPEGCompressor extends Compressor {
    @Override
    protected int[] preProcess(int[] data) {
        System.out.println("Pre-traitement JPEG : conversion YCbCr...");
        return data; // juste pour l'exemple
    }

    @Override
    protected int[] doCompress(int[] data) {
        System.out.println("Application de la compression JPEG (DCT + Quantification)...");
        // Simulation
        int[] compressed = new int[data.length / 3 + 1];
        for (int i = 0; i < compressed.length && i < data.length; i++) {
            compressed[i] = data[i];
        }
        return compressed;
    }

    @Override
    protected int[] postProcess(int[] data) {
        System.out.println("Post-traitement JPEG : codage entropique...");
        return data;
    }
}
