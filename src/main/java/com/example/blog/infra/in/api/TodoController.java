package com.example.blog.infra.in.api;

import com.example.blog.BlogPostResponse;
import com.example.blog.BlogRequest;
import com.example.blog.domain.BlogPost;
import com.example.blog.domain.BlogPostCreateCommand;
import com.example.blog.domain.IBlogPostCreateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
class TodoController {

    IBlogPostCreateService blogPostCreateService;

    @GetMapping("/blogs/badwords")
    @ResponseStatus(CREATED)
    BlogPostResponse crateTodo(@RequestBody BlogRequest body) {
        BlogPost postPost = blogPostCreateService.create(BlogPostCreateCommand.of(body.getId(), body.getTitle(), body.getContent()));

        return new BlogPostResponse(postPost.extractBadWords());
    }

}