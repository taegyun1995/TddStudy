package com.example.blog.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Title {

    private String title;

    public Title(String title) {
        this.title = title;
    }

    public String extractBadWords() {
        return "나쁜말";
    }

}