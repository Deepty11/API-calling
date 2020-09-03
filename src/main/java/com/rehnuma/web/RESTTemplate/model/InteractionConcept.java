package com.rehnuma.web.RESTTemplate.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class InteractionConcept {

    @JsonProperty("minConceptItem")
    private MinConceptItem minConceptItem;

    @JsonProperty("sourceConceptItem")
    private SourceConceptItem sourceConceptItem;

    public MinConceptItem getMinConceptItem() {
        return minConceptItem;
    }

    public void setMinConceptItem(MinConceptItem minConceptItem) {
        this.minConceptItem = minConceptItem;
    }

    public SourceConceptItem getSourceConceptItem() {
        return sourceConceptItem;
    }

    public void setSourceConceptItem(SourceConceptItem sourceConceptItem) {
        this.sourceConceptItem = sourceConceptItem;
    }
}
