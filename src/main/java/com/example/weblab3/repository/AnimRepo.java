package com.example.weblab3.repository;

import com.example.weblab3.model.Slider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimRepo extends JpaRepository<Slider, Long> {
}
