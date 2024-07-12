package com.company.validator.opensource;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GitHubRepoBranches {

    private String name;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
