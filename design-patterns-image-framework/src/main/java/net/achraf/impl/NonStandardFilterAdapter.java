package net.achraf.impl;

import net.achraf.Filter;
import net.achraf.ImplNonStandard;

public class NonStandardFilterAdapter implements Filter {
    private ImplNonStandard nonStandard;
    private String filterName;

    public NonStandardFilterAdapter(ImplNonStandard nonStandard, String filterName) {
        this.nonStandard = nonStandard;
        this.filterName = filterName;
    }

    @Override
    public int[] filter(int[] data) {
        // Traduction de l'appel filter() vers appliquerFiltre()
        return nonStandard.appliquerFiltre(this.filterName, data);
    }
}
