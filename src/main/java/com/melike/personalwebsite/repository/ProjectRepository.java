package com.melike.personalwebsite.repository;

import com.melike.personalwebsite.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
