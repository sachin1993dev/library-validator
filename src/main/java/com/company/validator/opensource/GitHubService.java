package com.company.validator.opensource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GitHubService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private GitHubValidator validator;

    private static final String GITHUB_API_URL = "https://api.github.com/repos/";

    public GitHubRepoDetails getRepoDetails(String owner, String repo) {
        validator.validateOwnerAndRepo(owner, repo);
        String url = GITHUB_API_URL + owner + "/" + repo;
        GitHubRepoDetails repoDetails = restTemplate.getForObject(url, GitHubRepoDetails.class);
        validator.validateGitHubRepoDetails(repoDetails);
        return repoDetails;
    }

    public GitHubRepoCommitActivity[] getRepoCommitActivity(String owner, String repo) {
        validator.validateOwnerAndRepo(owner, repo);
        String url = GITHUB_API_URL + owner + "/" + repo + "/stats/commit_activity";
        return restTemplate.getForObject(url, GitHubRepoCommitActivity[].class);
    }

    public GitHubRepoPullRequest[] getRepoPullRequests(String owner, String repo) {
        validator.validateOwnerAndRepo(owner, repo);
        String url = GITHUB_API_URL + owner + "/" + repo + "/pulls";
        return restTemplate.getForObject(url, GitHubRepoPullRequest[].class);
    }

    public GitHubRepoIssues[] getRepoIssues(String owner, String repo) {
        validator.validateOwnerAndRepo(owner, repo);
        String url = GITHUB_API_URL + owner + "/" + repo + "/issues";
        return restTemplate.getForObject(url, GitHubRepoIssues[].class);
    }

    public GitHubRepoContributors[] getRepoContributors(String owner, String repo) {
        validator.validateOwnerAndRepo(owner, repo);
        String url = GITHUB_API_URL + owner + "/" + repo + "/contributors";
        return restTemplate.getForObject(url, GitHubRepoContributors[].class);
    }

    public GitHubRepoReleases[] getRepoReleases(String owner, String repo) {
        validator.validateOwnerAndRepo(owner, repo);
        String url = GITHUB_API_URL + owner + "/" + repo + "/releases";
        return restTemplate.getForObject(url, GitHubRepoReleases[].class);
    }

    public GitHubRepoReadme getRepoReadme(String owner, String repo) {
        validator.validateOwnerAndRepo(owner, repo);
        String url = GITHUB_API_URL + owner + "/" + repo + "/readme";
        return restTemplate.getForObject(url, GitHubRepoReadme.class);
    }

    public GitHubRepoBranches[] getRepoBranches(String owner, String repo) {
        validator.validateOwnerAndRepo(owner, repo);
        String url = GITHUB_API_URL + owner + "/" + repo + "/branches";
        return restTemplate.getForObject(url, GitHubRepoBranches[].class);
    }

    public GitHubRepoTags[] getRepoTags(String owner, String repo) {
        validator.validateOwnerAndRepo(owner, repo);
        String url = GITHUB_API_URL + owner + "/" + repo + "/tags";
        return restTemplate.getForObject(url, GitHubRepoTags[].class);
    }
}
