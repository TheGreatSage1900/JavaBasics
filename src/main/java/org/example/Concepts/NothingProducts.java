package org.example.Concepts;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public enum NothingProducts {

    PHONE("Phone 3", List.of("Phone 1", "Phone 2", "Phone 3")),
    HEADPHONE("Headphone 1", List.of("Headphone 1", "headphone 2")),
    WATCH("", List.of("Watch 1"));

    private final String latestProduct;
    private final List<String> allProducts;
}
