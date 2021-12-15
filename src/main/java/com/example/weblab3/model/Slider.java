package com.example.weblab3.model;

import javax.persistence.*;

@Entity
@Table(name = "sliders")
public class Slider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String text;
    private String image;

    public Slider() {
    }

    public Slider(String text, String image) {
        this.text = text;
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String firstName) {
        this.text = firstName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String lastName) {
        this.image = lastName;
    }

}
