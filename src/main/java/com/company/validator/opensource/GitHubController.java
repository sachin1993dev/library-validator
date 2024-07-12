package com.company.validator.opensource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/github")
public class GitHubController {

    @Autowired
    private GitHubService gitHubService;

    @GetMapping("/repos/{owner}/{repo}")
    public GitHubRepoDetails getRepoDetails(@PathVariable String owner, @PathVariable String repo) {
        return gitHubService.getRepoDetails(owner, repo);
    }

    @GetMapping("/repos/{owner}/{repo}/stats/commit_activity")
    public GitHubRepoCommitActivity[] getRepoCommitActivity(@PathVariable String owner, @PathVariable String repo) {
        return gitHubService.getRepoCommitActivity(owner, repo);
    }

    @GetMapping("/repos/{owner}/{repo}/pulls")
    public GitHubRepoPullRequest[] getRepoPullRequests(@PathVariable String owner, @PathVariable String repo) {
        return gitHubService.getRepoPullRequests(owner, repo);
    }

    @GetMapping("/repos/{owner}/{repo}/issues")
    public GitHubRepoIssues[] getRepoIssues(@PathVariable String owner, @PathVariable String repo) {
        return gitHubService.getRepoIssues(owner, repo);
    }

    @GetMapping("/repos/{owner}/{repo}/contributors")
    public GitHubRepoContributors[] getRepoContributors(@PathVariable String owner, @PathVariable String repo) {
        return gitHubService.getRepoContributors(owner, repo);
    }

    @GetMapping("/repos/{owner}/{repo}/releases")
    public GitHubRepoReleases[] getRepoReleases(@PathVariable String owner, @PathVariable String repo) {
        return gitHubService.getRepoReleases(owner, repo);
    }

    @GetMapping("/repos/{owner}/{repo}/readme")
    public GitHubRepoReadme getRepoReadme(@PathVariable String owner, @PathVariable String repo) {
        return gitHubService.getRepoReadme(owner, repo);
    }

    @GetMapping("/repos/{owner}/{repo}/branches")
    public GitHubRepoBranches[] getRepoBranches(@PathVariable String owner, @PathVariable String repo) {
        return gitHubService.getRepoBranches(owner, repo);
    }

    @GetMapping("/repos/{owner}/{repo}/tags")
    public GitHubRepoTags[] getRepoTags(@PathVariable String owner, @PathVariable String repo) {
        return gitHubService.getRepoTags(owner, repo);
    }
}
