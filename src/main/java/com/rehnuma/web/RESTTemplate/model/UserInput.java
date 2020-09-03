package com.rehnuma.web.RESTTemplate.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserInput {

    @JsonProperty("sources")
    private String[] sources;

    @JsonProperty("rxcui")
    private String rxcui;

    public String[] getSources() {
        return sources;
    }

    public void setSources(String[] sources) {
        this.sources = sources;
    }

    public String getRxcui() {
        return rxcui;
    }

    public void setRxcui(String rxcui) {
        this.rxcui = rxcui;
    }
}
