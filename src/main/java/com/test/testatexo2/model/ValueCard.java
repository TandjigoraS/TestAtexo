package com.test.testatexo2.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;
@NoArgsConstructor
public class ValueCard {

    private static final List<String> listValue = Arrays.asList("2","3","4","5","6","7","8","9","10","As","Dame","Roi","Valet");

    public static List<String> getListValue() {
        return listValue;
    }
}
