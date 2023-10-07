package com.melike.personalwebsite.controller;

import com.melike.personalwebsite.dto.AboutMeDTO;
import com.melike.personalwebsite.dto.BlogPostDto;
import com.melike.personalwebsite.dto.ContactFormDto;
import com.melike.personalwebsite.dto.ProjectDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
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
    @GetMapping("/blog-posts")
    public ResponseEntity<List<BlogPostDto>> getBlogPosts()
    {
        //Temporary hardcoded data, will be replaced with real one
        //when the content is fetched from a db
        List<BlogPostDto> blogPosts = List.of(
                new BlogPostDto("My First Blog Post", "This is the content of my first blog post.", LocalDate.now()),
                new BlogPostDto("My Second Blog Post", "This is my second blog post and it's content.",
                        LocalDate.now().minusDays(5)));
        return ResponseEntity.ok(blogPosts);
    }
    @PostMapping("/contact")
    public ResponseEntity<String> handleContactFormSubmission(@RequestBody ContactFormDto contactForm) {
        System.out.println("Received message from " + contactForm.getName() + ": " + contactForm.getMessage());
        return ResponseEntity.ok("Message received!");
    }

}
