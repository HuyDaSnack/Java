package com.snaacker.playground.designpattern.abstractfactory.shape.impl;

import com.snaacker.playground.designpattern.abstractfactory.shape.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("we've draw rectangle");
    }
}
