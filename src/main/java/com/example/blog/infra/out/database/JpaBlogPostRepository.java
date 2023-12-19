package com.example.blog.infra.out.database;

import com.example.blog.domain.BlogPost;
import com.example.blog.domain.IBlogPostRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaBlogPostRepository extends IBlogPostRepository, CrudRepository<BlogPostEntity, Long> {

    @Override
    default void save(BlogPost of) {

    }

}