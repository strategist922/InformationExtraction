package com.intel.ie.analytics;

import edu.stanford.nlp.ie.KBPSemgrexExtractor;
import edu.stanford.nlp.ie.KBPTokensregexExtractor;

import java.io.IOException;

public class ModelWeight {

    static Double KBPStatisticalWeightIntel = 0.5289;
    static Double KBPStatisticalWeightDefault = 0.4474;
    static Double KBPTokenWeight = 0.6218;
    static Double KBPSemgrexWeight = 0.3653;

    static Double getWeight(IntelKBPRelationExtractor extractor) {
        if (extractor.getClass().equals(IntelKBPStatisticalExtractor.class)) return KBPStatisticalWeightIntel;
        else if (extractor.getClass().equals(DefaultKBPStatisticalExtractor.class)) return KBPStatisticalWeightDefault;
        else if (extractor.getClass().equals(IntelKBPSemgrexExtractor.class)) return KBPSemgrexWeight;
        else if (extractor.getClass().equals(IntelKBPTokensregexExtractor.class)) return KBPTokenWeight;
        else return 1.0;
    }
}
