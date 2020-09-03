package com.rehnuma.web.RESTTemplate.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Object {

    @JsonProperty("nlmDisclaimer")
    private String nlmDisclaimer;

    @JsonProperty("userInput")
    private UserInput userInput;

    @JsonProperty("interactionTypeGroup")
    private InteractionTypeGroup[] interactionTypeGroup;

    public String getNlmDisclaimer() {
        return nlmDisclaimer;
    }

    public void setNlmDisclaimer(String nlmDisclaimer) {
        this.nlmDisclaimer = nlmDisclaimer;
    }

    public UserInput getUserInput() {
        return userInput;
    }

    public void setUserInput(UserInput userInput) {
        this.userInput = userInput;
    }

    public InteractionTypeGroup[] getInteractionTypeGroup() {
        return interactionTypeGroup;
    }

    public void setInteractionTypeGroup(InteractionTypeGroup[] interactionTypeGroup) {
        this.interactionTypeGroup = interactionTypeGroup;
    }
}
