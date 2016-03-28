package com.getinthecloud.java8NewFeatures.lambdaExpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by davicres on 28/03/2016.
 */
public class StringList {

    private List<String> arrayList = Arrays.asList("David", "Fatima", "my little one");

    public void sort() {
        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });
    }

    public List<String> getArrayList() {
        return arrayList;
    }

    public static void main(String[] args) {
        StringList stringList = new StringList();
        System.out.println("before sorting: " + stringList.getArrayList());
    }
}
