    package com.company.validator.opensource;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GitHubRepoCommitActivity {

    private int total;

    @JsonProperty("total")
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
