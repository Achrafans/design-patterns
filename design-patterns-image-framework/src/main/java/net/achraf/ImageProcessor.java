package net.achraf;

public class ImageProcessor {
    private Filter filter;
    private Compressor compressor;

    public ImageProcessor(Filter filter, Compressor compressor) {
        this.filter = filter;
        this.compressor = compressor;
    }

    // Permet de changer dynamiquement la stratégie de filtrage
    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    // Permet de changer dynamiquement la stratégie de compression
    public void setCompressor(Compressor compressor) {
        this.compressor = compressor;
    }

    public int[] traiter(int[] imageData) {
        System.out.println("Début du traitement de l'image...");
        int[] filteredData = filter.filter(imageData);
        System.out.println("Filtrage terminé.");
        int[] compressedData = compressor.compress(filteredData);
        System.out.println("Compression terminée.");
        return compressedData;
    }
}
