package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "boxes")
@Data
public class Box {

    private int length;
    private int height;
    private int width;
}
