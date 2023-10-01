package com.melike.personalwebsite.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDto {
    private String title;
    private String description;
    private String imageUrl;
    private String projectUrl;
}
