package com.melike.personalwebsite.repository;

import com.melike.personalwebsite.entity.AboutMe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AboutMeRepository extends JpaRepository<AboutMe, Long> {
}