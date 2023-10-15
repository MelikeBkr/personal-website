package com.melike.personalwebsite.controller;

import com.melike.personalwebsite.dto.AboutMeDTO;
import com.melike.personalwebsite.dto.BlogPostDTO;
import com.melike.personalwebsite.dto.ContactFormDTO;
import com.melike.personalwebsite.dto.ProjectDTO;
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
    public ResponseEntity<List<ProjectDTO>> getProjects() {
        //TODO:for now there are temporary hardcoded list of projects, but later it will be fetched from a database or GitHub
        List<ProjectDTO> projects = List.of(
                new ProjectDTO("Project Skylab", "Description of Project Skylab", "imageUrl1", "projectUrl1"),
                new ProjectDTO("Project New Horizons", "Description of Project New Horizons", "imageUrl2", "projectUrl2")
                // ... add as many projects as you like
        );
        return ResponseEntity.ok(projects);
    }
    @GetMapping("/blog-posts")
    public ResponseEntity<List<BlogPostDTO>> getAllBlogPosts()
    {
        //Temporary hardcoded data, will be replaced with real one
        //when the content is fetched from a db
        List<BlogPostDTO> blogPosts = List.of(
                new BlogPostDTO(1L,"My First Blog Post", "This is the content of my first blog post.", LocalDate.now()),
                new BlogPostDTO(2L,"My Second Blog Post", "This is my second blog post and it's content.",
                        LocalDate.now().minusDays(5)));
        return ResponseEntity.ok(blogPosts);
    }
    @GetMapping("/blog-posts/{id}")
    public ResponseEntity<BlogPostDTO> getBlogPostById(@PathVariable Long id) {
        // TODO: Fetch the post by ID from a database. Here, we'll just find it in the hardcoded list.
        List<BlogPostDTO> blogPosts = List.of(
                new BlogPostDTO(1L, "My First Blog Post", "This is the content of my first blog post.", LocalDate.now()),
                new BlogPostDTO(2L, "My Second Blog Post", "This is my second blog post and it's content.", LocalDate.now())
        );
        return blogPosts.stream()
                .filter(post -> post.getId().equals(id))
                .findFirst()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping("/contact")
    public ResponseEntity<String> handleContactFormSubmission(@RequestBody ContactFormDTO contactForm) {
        System.out.println("Received message from " + contactForm.getName() + ": " + contactForm.getMessage());
        return ResponseEntity.ok("Message received!");
    }
}
