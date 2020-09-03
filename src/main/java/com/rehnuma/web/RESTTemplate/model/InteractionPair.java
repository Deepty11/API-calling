package com.rehnuma.web.RESTTemplate.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InteractionPair {

    @JsonProperty("interactionConcept")
    private InteractionConcept[] interactionConcepts;

    @JsonProperty("severity")
    private String severity;

    @JsonProperty("description")
    private String description;

    public InteractionConcept[] getInteractionConcepts() {
        return interactionConcepts;
    }

    public void setInteractionConcepts(InteractionConcept[] interactionConcepts) {
        this.interactionConcepts = interactionConcepts;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
