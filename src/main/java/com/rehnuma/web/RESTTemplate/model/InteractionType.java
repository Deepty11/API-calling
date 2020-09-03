package com.rehnuma.web.RESTTemplate.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InteractionType {

    @JsonProperty("comment")
    private String comment;

    @JsonProperty("minConceptItem")
    private MinConceptItem minConceptItems;

    @JsonProperty("interactionPair")
    private InteractionPair[] interactionPair;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public MinConceptItem getMinConceptItems() {
        return minConceptItems;
    }

    public void setMinConceptItems(MinConceptItem minConceptItems) {
        this.minConceptItems = minConceptItems;
    }

    public InteractionPair[] getInteractionPair() {
        return interactionPair;
    }

    public void setInteractionPair(InteractionPair[] interactionPair) {
        this.interactionPair = interactionPair;
    }
}
