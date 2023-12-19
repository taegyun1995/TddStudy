package com.example.blog.infra.out.database;

import com.example.blog.domain.BlogPost;
import com.example.blog.domain.Content;
import com.example.blog.domain.Title;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Value;

@Getter
@Value(staticConstructor = "of")
public class BlogPostEntity {

    @Id
    private Long id;
    private String title;
    private String content;

    public static BlogPostEntity from(BlogPost blogPost) {
        BlogPostEntity blogPostEntity = new BlogPostEntity(blogPost.getId(), blogPost.getTitle().getTitle(), blogPost.getContent().getContent());
        return blogPostEntity;
    }

    public BlogPost toDomain() {
        return BlogPost.of(id, new Title(title), new Content(content));
    }

}