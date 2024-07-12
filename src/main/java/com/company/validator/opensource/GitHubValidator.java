package com.company.validator.opensource;

import org.springframework.stereotype.Component;

@Component
public class GitHubValidator {

    public void validateOwnerAndRepo(String owner, String repo) {
        if (owner == null || owner.trim().isEmpty()) {
            throw new IllegalArgumentException("Owner is required");
        }
        if (repo == null || repo.trim().isEmpty()) {
            throw new IllegalArgumentException("Repository name is required");
        }
    }

    public void validateGitHubRepoDetails(GitHubRepoDetails repoDetails) {
        if (repoDetails.getFullName() == null || repoDetails.getFullName().trim().isEmpty()) {
            throw new IllegalArgumentException("Full name is required");
        }
        if (repoDetails.getDescription() == null || repoDetails.getDescription().trim().isEmpty()) {
            throw new IllegalArgumentException("Description is required");
        }
        if (repoDetails.getLanguage() == null || repoDetails.getLanguage().trim().isEmpty()) {
            throw new IllegalArgumentException("Language is required");
        }
        if (repoDetails.getCreatedAt() == null || repoDetails.getCreatedAt().trim().isEmpty()) {
            throw new IllegalArgumentException("Creation date is required");
        }
        if (repoDetails.getUpdatedAt() == null || repoDetails.getUpdatedAt().trim().isEmpty()) {
            throw new IllegalArgumentException("Update date is required");
        }
        if (repoDetails.getPushedAt() == null || repoDetails.getPushedAt().trim().isEmpty()) {
            throw new IllegalArgumentException("Push date is required");
        }
        if (repoDetails.getSize() <= 0) {
            throw new IllegalArgumentException("Size must be greater than zero");
        }
        if (repoDetails.getStargazersCount() < 0) {
            throw new IllegalArgumentException("Stargazers count cannot be negative");
        }
        if (repoDetails.getForksCount() < 0) {
            throw new IllegalArgumentException("Forks count cannot be negative");
        }
        if (repoDetails.getWatchersCount() < 0) {
            throw new IllegalArgumentException("Watchers count cannot be negative");
        }
        if (repoDetails.getOpenIssuesCount() < 0) {
            throw new IllegalArgumentException("Open issues count cannot be negative");
        }
    }
}
