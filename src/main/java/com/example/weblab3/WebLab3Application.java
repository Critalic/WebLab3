package com.example.weblab3;

import com.example.weblab3.model.Slider;
import com.example.weblab3.repository.AnimRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebLab3Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(WebLab3Application.class, args);
    }

    @Autowired
    private AnimRepo animationRepo;

    @Override
    public void run(String... args) throws Exception {
        this.animationRepo.save(new Slider("begin","end", 100, "Stop"));
    }
}
