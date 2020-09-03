package com.rehnuma.web.RESTTemplate.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MinConceptItem {

    @JsonProperty("rxcui")
    private String rxcui;

    @JsonProperty("name")
    private String name;

    @JsonProperty("tty")
    private String tty;

    public String getRxcui() {
        return rxcui;
    }

    public void setRxcui(String rxcui) {
        this.rxcui = rxcui;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTty() {
        return tty;
    }

    public void setTty(String tty) {
        this.tty = tty;
    }
}
