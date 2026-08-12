package net.achraf.impl;

import net.achraf.Filter;

public class SepiaFilter implements Filter {
    @Override
    public int[] filter(int[] data) {
        int[] result = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            int pixel = data[i];
            // Simulation d'un effet sépia (on ne manipule pas les canaux pour simplifier)
            result[i] = (int)(pixel * 0.8); // juste pour l'exemple
        }
        return result;
    }
}
