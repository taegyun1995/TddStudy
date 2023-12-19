package com.example.blog;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {

    @LocalServerPort
    private int port;

    @BeforeEach
    void setUp() {
        RestAssured.port = port;
    }

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    @DisplayName("POST /blogs(title, content) => (201)")
    void shouldCreateBlog() throws Exception {
        String body = objectMapper.writeValueAsString(
                BlogRequest.of(1l, "eat foods", "음식을 먹는건 중요하다.")
        );

        given()
            .body(body)
            .contentType("application/json")
        .when()
                .log().all()
            .post("/blogs")
        .then()
                .log().all()
            .body("title", is("eat foods"))
            .body("content", is("음식을 먹는건 중요하다."))
            .statusCode(201);
    }

}