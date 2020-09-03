package com.rehnuma.web.RESTTemplate.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InteractionTypeGroup {

    @JsonProperty("sourceDisclaimer")
    private String sourceDisclaimer;

    @JsonProperty("sourceName")
    private String sourceName;

    @JsonProperty("interactionType")
    private InteractionType[] interactionTypes;

    public String getSourceDisclaimer() {
        return sourceDisclaimer;
    }

    public void setSourceDisclaimer(String sourceDisclaimer) {
        this.sourceDisclaimer = sourceDisclaimer;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public InteractionType[] getInteractionTypes() {
        return interactionTypes;
    }

    public void setInteractionTypes(InteractionType[] interactionTypes) {
        this.interactionTypes = interactionTypes;
    }
}
