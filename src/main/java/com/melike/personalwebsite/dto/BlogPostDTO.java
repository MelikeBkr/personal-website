package com.melike.personalwebsite.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class BlogPostDTO
{
    private Long id;
    private String title;
    private String content;
    private LocalDate datePublished;
}
