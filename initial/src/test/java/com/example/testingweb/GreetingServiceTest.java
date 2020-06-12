package com.example.testingweb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class GreetingServiceTest {

    @Autowired
    GreetingService service;

    @Test
    public void greetShouldReturnDefaultMessage() throws Exception {
        assertThat(this.service.greet().contains("Hello, World"));
    }

    @Test
    public void whenEmptyString_thenAccept() {
        assertTrue(this.service.isPalindrome(""));
    }

    @Test
    public void whenPalindrom_thenAccept() {
        assertTrue(this.service.isPalindrome("noon"));
    }

    @Test
    public void whenNearPalindrom_thanReject(){
        assertFalse(this.service.isPalindrome("neon"));
    }

    @Test
    public void whenNotPalindrom_thanReject() {
        assertFalse(this.service.isPalindrome("box"));
    }
}
