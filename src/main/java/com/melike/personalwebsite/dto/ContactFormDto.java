package com.melike.personalwebsite.dto;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ContactFormDto {
    private String name;
    private String email;
    private String message;
}
