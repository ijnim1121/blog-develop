package me.jimin.blogdevelop.repository;

import me.jimin.blogdevelop.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
