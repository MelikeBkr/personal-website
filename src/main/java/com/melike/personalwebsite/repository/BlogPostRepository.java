package com.melike.personalwebsite.repository;

import com.melike.personalwebsite.entity.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
}
