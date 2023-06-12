package com.test.testatexo2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;
@NoArgsConstructor
public class ColorCard {


    private static final List<String> listColor = Arrays.asList("Carreaux","Coeur","Pique","Tréfle");

    public static List<String> getListColor() {
        return listColor;
    }
}
