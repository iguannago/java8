package com.getinthecloud.java8NewFeatures.functionalInterfaces;

/**
 * Created by davicres on 28/03/2016.
 */
@FunctionalInterface
public interface Converter<F, T> {
    T convert (F from);

    static void main(String[] args) {
        Converter<String, Integer> converter = from -> Integer.valueOf(from);
        int converted = converter.convert("123");
        System.out.println("converted: " + converted);
    }
}
