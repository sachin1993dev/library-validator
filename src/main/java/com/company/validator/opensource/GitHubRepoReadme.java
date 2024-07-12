package com.company.validator.opensource;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GitHubRepoReadme {

    private String content;

    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
