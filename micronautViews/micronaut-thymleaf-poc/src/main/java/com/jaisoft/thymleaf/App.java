package com.jaisoft.thymleaf;

import io.micronaut.runtime.Micronaut;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        Micronaut.run(App.class, args);
    }
}
