package com.melike.personalwebsite.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "about_me")
public class AboutMe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String biography;
    private String socialLink;
}