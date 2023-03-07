package com.example.weblab3.model;

import javax.persistence.*;

@Entity
@Table(name = "Animation")
public class Slider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private float speed;
    private String begin;
    private String end;
    private String stop;

    public Slider() {
    }

    public Slider(String begin, String end, float speed, String stop) {
        this.begin = begin;
        this.end = end;
        this.speed = speed;
        this.stop = stop;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getSpeed() {
        return speed;
    }

    public String getBegin() {
        return begin;
    }

    public String getEnd() {
        return end;
    }

    public String getStop() {
        return stop;
    }

//    public String getReload() {
//        return reload;
//    }
//
//    public String getLeft() {
//        return left;
//    }
//
//    public String getRight() {
//        return right;
//    }
//
//    public String getClose() {
//        return close;
//    }
//
//    public String getStart() {
//        return start;
//    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public void setStop(String stop) {
        this.stop = stop;
    }

//    public void setReload(String reload) {
//        this.reload = reload;
//    }
//
//    public void setLeft(String left) {
//        this.left = left;
//    }
//
//    public void setRight(String right) {
//        this.right = right;
//    }
//
//    public void setClose(String close) {
//        this.close = close;
//    }
//
//    public void setStart(String start) {
//        this.start = start;
//    }
}