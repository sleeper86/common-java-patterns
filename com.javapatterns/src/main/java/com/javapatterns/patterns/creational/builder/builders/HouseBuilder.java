package com.javapatterns.patterns.creational.builder.builders;

import com.javapatterns.patterns.creational.builder.product.House;

public interface HouseBuilder {
    void buildFoundation();
    void buildStructure();
    void buildRoof();
    void paintHouse();
    void furnishHouse();
    House getHouse();
}
