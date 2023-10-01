package com.melike.personalwebsite.controller;

import com.melike.personalwebsite.dto.AboutMeDTO;
import com.melike.personalwebsite.dto.ProjectDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonalWebsiteController
{
    @GetMapping("/about-me")
    public AboutMeDTO getAboutMeDetails() {
        return new AboutMeDTO("Melike Bakir", "A software engineer with a passion for coding.", "Full-stack Developer");
    }
    @GetMapping("/projects")
    public ResponseEntity<List<ProjectDto>> getProjects() {
        //TODO:for now there are temporary hardcoded list of projects, but later it will be fetched from a database or GitHub
        List<ProjectDto> projects = List.of(
                new ProjectDto("Project Skylab", "Description of Project Skylab", "imageUrl1", "projectUrl1"),
                new ProjectDto("Project New Horizons", "Description of Project New Horizons", "imageUrl2", "projectUrl2")
                // ... add as many projects as you like
        );
        return ResponseEntity.ok(projects);
    }

}
