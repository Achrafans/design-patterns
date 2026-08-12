package net.achraf.impl;

import net.achraf.Filter;

public class ContrasteFilter implements Filter {
    @Override
    public int[] filter(int[] data) {
        int[] result = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            int val = data[i];
            // Simule un contraste : on écrase les valeurs vers 0 ou 255
            result[i] = (val < 128) ? 0 : 255;
        }
        return result;
    }
}
