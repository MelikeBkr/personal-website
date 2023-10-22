package com.melike.personalwebsite.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service

public class GitHubService {

        private String githubApiUrl;
        private final RestTemplate restTemplate;

        public GitHubService(RestTemplate restTemplate, @Value("${github.api.url}") String githubApiUrl) {
            this.restTemplate = restTemplate;
            this.githubApiUrl = githubApiUrl;
        }

        public String fetchRepositories() {

            return restTemplate.getForObject(githubApiUrl, String.class);
            //TODO: This returns the JSON as String, can be converted it into a DTO later.
        }
    }

