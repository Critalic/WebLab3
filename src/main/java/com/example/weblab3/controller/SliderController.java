package com.example.weblab3.controller;

import com.example.weblab3.model.Slider;
import com.example.weblab3.repository.SliderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/")
public class SliderController {

    @Autowired
    private SliderRepo sliderRepository;

    @GetMapping("display")
    public List<Slider> getSliders() { return this.sliderRepository.findAll(); }

    @GetMapping("edit")
    public List<Slider> getEditor() { return this.sliderRepository.findAll(); }

    @PostMapping ("edit")
    public void uploadSlider(@RequestBody List<Slider> slider) {
        this.sliderRepository.deleteAll();
        this.sliderRepository.saveAll(slider);
        System.out.println(slider.get(0));
    }

    @DeleteMapping ("edit/{id}")
    public void deleteSlider(@PathVariable String id) {
        this.sliderRepository.deleteById(Long.parseLong(id));
    }

    @PutMapping("edit")
    public void putSlider(@RequestBody Slider slider) {
        this.sliderRepository.save(slider);
    }
}
