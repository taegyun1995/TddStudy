package com.example.blog.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Content {

    private String content;

    public Content(String content) {
        this.content = content;
    }

}