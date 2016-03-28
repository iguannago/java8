package com.getinthecloud.java8NewFeatures.defaultMethodForInterfaces;

/**
 * Created by davicres on 28/03/2016.
 * source: http://winterbe.com/posts/2014/03/16/java-8-tutorial/
 */
interface Formula {
    double calculate(int a);
    default double sqrt(int a) {
        return Math.sqrt(a);
    }

    static void main(String[] args) {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a*100);
            }
        };

        System.out.println("formula.calculate(100): " + formula.calculate(100));
        System.out.println("formula.sqrt(16): " + formula.sqrt(16));
    }

}
