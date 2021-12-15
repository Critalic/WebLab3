package com.example.weblab3;

import com.example.weblab3.model.Slider;
import com.example.weblab3.repository.SliderRepo;
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
    private SliderRepo sliderRepo;

    @Override
    public void run(String... args) throws Exception {
        this.sliderRepo.save(new Slider("Vladius", "https://upload.wikimedia.org/wikipedia/commons/thumb/a/af/Vlad_Tepes_002.jpg/1200px-Vlad_Tepes_002.jpg"));
        this.sliderRepo.save(new Slider( "Vladislavidjkhglkskidfg", "https://upload.wikimedia.org/wikipedia/commons/thumb/a/af/Vlad_Tepes_002.jpg/1200px-Vlad_Tepes_002.jpg"));
    }
}
