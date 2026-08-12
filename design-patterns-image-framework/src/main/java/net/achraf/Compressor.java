package net.achraf;

public abstract class Compressor {
    // TEMPLATE METHOD : final pour ne pas être modifié
    public final int[] compress(int[] data) {
        int[] tmp = preProcess(data);
        tmp = doCompress(tmp);
        return postProcess(tmp);
    }

    // Hook (étape optionnelle : par défaut, ne fait rien)
    protected int[] preProcess(int[] data) {
        return data;
    }

    // Étape obligatoire (abstraite) : le cœur de la compression
    protected abstract int[] doCompress(int[] data);

    // Hook (étape optionnelle)
    protected int[] postProcess(int[] data) {
        return data;
    }
}
